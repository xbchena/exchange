package com.iss.finanframe.message.kafka;

/**
 * User: change.long
 * Date: 16/3/28
 * Time: 上午9:39
 */
public interface IMessageQueueService {

	/**
	 * sendMessage:发送kafka信息. <br/>
	 * @param eventType 事件类型(如"UAP-Analysis")
	 * @param bizType   业务场景(如"UserRegister")
	 * @param dataObject  数据对象(如req对象、entity对象)
	 * @param eventMemo  事件备注
	 */
	void sendMessage(String eventType, String bizType, Object dataObject, String eventMemo);

}
