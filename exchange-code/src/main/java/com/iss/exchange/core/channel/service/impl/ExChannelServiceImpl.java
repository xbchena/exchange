package com.iss.exchange.core.channel.service.impl;

import com.iss.exchange.core.channel.entity.ExChannel;
import com.iss.exchange.core.channel.dto.ExChannelDTO;
import com.iss.exchange.core.channel.dao.ExChannelMapper;
import com.iss.exchange.core.channel.service.ExChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import java.util.List;
import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;
@Service("exChannelService")
public class ExChannelServiceImpl implements ExChannelService {

	public static Logger logger = LoggerFactory.getLogger(ExChannelServiceImpl.class);
	@Autowired
	private ExChannelMapper exChannelMapper;
	@Override
	@Transactional
	public int addExChannel(Map map) throws Exception{
		ExChannel exChannel = (ExChannel)map.get("exChannel");
		return exChannelMapper.addExChannel(exChannel);
	}
	@Override
	@Transactional
	public int batchAddExChannel(Map map) throws Exception{
		List<ExChannel> exChannelList =(List<ExChannel>)map.get("exChannelList");
		return exChannelMapper.batchAddExChannel(exChannelList);
	}
	@Override
	@Transactional
	public int deleteExChannel(Map map) throws Exception{
		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
		return exChannelMapper.deleteExChannel(exBankTransactionHisInfoId);
	}
	@Override
	@Transactional
	public int batchDeleteExChannel(Map map) throws Exception{
		List exChannelIdList = (List)map.get("exChannelIdList");
		return exChannelMapper.batchDeleteExChannel(exChannelIdList);
	}
	@Override
	@Transactional
	public int updateExChannel(Map map) throws Exception{
			ExChannel exChannel = (ExChannel)map.get("exChannel");
			return exChannelMapper.updateExChannel(exChannel);
	}
//	@Override
//	public ExChannel getExChannel(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exChannelMapper.getExChannel(exBankTransactionHisInfoId);
//	}
//	@Override
//	public ExChannel getExChannelDTO(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exChannelMapper.getExChannelDTO(exBankTransactionHisInfoId);
//	}
//	@Override
//	public List<ExChannel> getExChannelList(Map map) throws Exception{
//		ExChannel exChannel = (ExChannel)map.get("exChannel");
//		return exChannelMapper.getExChannelList(exChannel);
//	}
	@Override
	public Map getExChannelPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exChannelMapper.getExChannelPageList(page);
		return resultMap;
	}
}
