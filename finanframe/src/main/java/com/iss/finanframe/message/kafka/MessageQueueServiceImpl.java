//package com.wanda.osp.finanframe.message.kafka;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.Future;
//
//import org.apache.kafka.clients.producer.Producer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.apache.kafka.clients.producer.RecordMetadata;
//import org.apache.logging.log4j.LogManager;
//
//import com.alibaba.fastjson.JSON;
//import com.wanda.uap.util.StringUtil;
//import org.apache.logging.log4j.Logger;
//
///**
// * User: change.long
// * Date: 16/3/28
// * Time: 上午9:42
// */
//public class MessageQueueServiceImpl implements IMessageQueueService {
//	private static final Logger log = LogManager.getLogger(MessageQueueServiceImpl.class);
//	public String[] eventType;
//
//	/**
//	 * 日志的topic
//	 */
//	public String topic;
//	/**
//	 * 日志队列开关
//	 */
//	public boolean active;
//
//	public String key = "";
//
//	public String message;
//	/**
//	 * 生产者
//	 */
//	public Producer<String, String> producer;
//
//	/**
//	 * sendMessage:发送kafka信息. <br/>
//	 *
//	 * @author zhiwu.mo
//	 * @param eventType 事件类型(如"UAP-Analysis")
//	 * @param bizType   业务场景(如"UserRegister")
//	 * @param dataObject  数据对象(如req对象、entity对象)
//	 * @param eventMemo  事件备注
//	 */
//	@Override
//	public void sendMessage(String eventType, String bizType, Object dataObject, String eventMemo) {
//		//根据事件类型 获取topic和active  {topic=xxx,active=yes/no} ，active表示队列开启还是关闭，关闭不再进行对外输出
//		if (isActive(eventType)) {
//			//設制kafka日志信息
//			setMessage(bizType, dataObject, eventMemo);
//			send();
//		}
//
//	}
//
//	/**
//	 * setMessage:設制kafka日志信息. <br/>
//	 */
//	public void setMessage(String bizType, Object dataObject, String eventMemo) {
//		//将数据对应转换为json串
//		Map<String, Object> messageMap = new HashMap<String, Object>();
//		messageMap.put("time", System.currentTimeMillis());
//		messageMap.put("bizType", bizType);
//		messageMap.put("json", dataObject);
//		messageMap.put("memo", eventMemo);
//
//		message = JSON.toJSONString(messageMap);
//	}
//
//	public void send() {
//		Future<RecordMetadata> future;
//		try {
//			future = producer.send(new ProducerRecord<String, String>(topic, "key:" + key, "value:" + message));
//			boolean done = future.isDone();
//			log.info("send log message:{},done:{}", message, done);
//		} catch (Exception e) {
//			log.error("send log message ERROR:{},e:{}", message, e.getMessage());
//		}
//	}
//
//	public void setProducer(Producer<String, String> producer) {
//		this.producer = producer;
//	}
//
//	public void setEventType(String[] eventType) {
//		this.eventType = eventType;
//	}
//
//	/**
//	 * isActive:是否发送kafka日志信息. <br/>	 *
//	 * @author zhiwu.mo
//	 * @param eventType
//	 * @return
//	 */
//
//	public Boolean isActive(String sEventType) {
//		//默认不发送kafka日志信息
//		this.active = false;
//		//根据传eventType 找到对应的配置信息
//		for (int i = 0; i < this.eventType.length; i++) {
//			String[] sEventTypeHead = this.eventType[i].split(":");
//			//配置參數格式檢查
//			if (sEventTypeHead.length > 2) {
//				if (StringUtil.equalsString(sEventTypeHead[0], sEventType)) {
//					this.topic = sEventTypeHead[1].trim();
//					if (StringUtil.equalsStringIgnoreCaseSensitivity(sEventTypeHead[2].toLowerCase(), "yes")) {
//						this.active = true;
//					}
//				}
//			}
//		}
//
//		return this.active;
//	}
//
//}
