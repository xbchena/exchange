package com.iss.exchange.core.channel.service.impl;

import com.iss.exchange.core.channel.entity.ExChannelFee;
import com.iss.exchange.core.channel.dto.ExChannelFeeDTO;
import com.iss.exchange.core.channel.dao.ExChannelFeeMapper;
import com.iss.exchange.core.channel.service.ExChannelFeeService;
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
@Service("exChannelFeeService")
public class ExChannelFeeServiceImpl implements ExChannelFeeService {

	public static Logger logger = LoggerFactory.getLogger(ExChannelFeeServiceImpl.class);
	@Autowired
	private ExChannelFeeMapper exChannelFeeMapper;
	@Override
	@Transactional
	public int addExChannelFee(Map map) throws Exception{
		ExChannelFee exChannelFee = (ExChannelFee)map.get("exChannelFee");
		return exChannelFeeMapper.addExChannelFee(exChannelFee);
	}
	@Override
	@Transactional
	public int batchAddExChannelFee(Map map) throws Exception{
		List<ExChannelFee> exChannelFeeList =(List<ExChannelFee>)map.get("exChannelFeeList");
		return exChannelFeeMapper.batchAddExChannelFee(exChannelFeeList);
	}
	@Override
	@Transactional
	public int deleteExChannelFee(Map map) throws Exception{
		BigInteger exChannelAbilityId = (BigInteger)map.get("exChannelAbilityId");
		return exChannelFeeMapper.deleteExChannelFee(exChannelAbilityId);
	}
	@Override
	@Transactional
	public int batchDeleteExChannelFee(Map map) throws Exception{
		List exChannelFeeIdList = (List)map.get("exChannelFeeIdList");
		return exChannelFeeMapper.batchDeleteExChannelFee(exChannelFeeIdList);
	}
	@Override
	@Transactional
	public int updateExChannelFee(Map map) throws Exception{
			ExChannelFee exChannelFee = (ExChannelFee)map.get("exChannelFee");
			return exChannelFeeMapper.updateExChannelFee(exChannelFee);
	}
//	@Override
//	public ExChannelFee getExChannelFee(Map map) throws Exception{
//		BigInteger exChannelAbilityId = (BigInteger)map.get("exChannelAbilityId");
//		return exChannelFeeMapper.getExChannelFee(exChannelAbilityId);
//	}
//	@Override
//	public ExChannelFee getExChannelFeeDTO(Map map) throws Exception{
//		BigInteger exChannelAbilityId = (BigInteger)map.get("exChannelAbilityId");
//		return exChannelFeeMapper.getExChannelFeeDTO(exChannelAbilityId);
//	}
//	@Override
//	public List<ExChannelFee> getExChannelFeeList(Map map) throws Exception{
//		ExChannelFee exChannelFee = (ExChannelFee)map.get("exChannelFee");
//		return exChannelFeeMapper.getExChannelFeeList(exChannelFee);
//	}
	@Override
	public Map getExChannelFeePageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exChannelFeeMapper.getExChannelFeePageList(page);
		return resultMap;
	}
}
