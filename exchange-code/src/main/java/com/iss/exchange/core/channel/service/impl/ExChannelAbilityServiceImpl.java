package com.iss.exchange.core.channel.service.impl;

import com.iss.exchange.core.channel.entity.ExChannelAbility;
import com.iss.exchange.core.channel.dto.ExChannelAbilityDTO;
import com.iss.exchange.core.channel.dao.ExChannelAbilityMapper;
import com.iss.exchange.core.channel.service.ExChannelAbilityService;
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
@Service("exChannelAbilityService")
public class ExChannelAbilityServiceImpl implements ExChannelAbilityService {

	public static Logger logger = LoggerFactory.getLogger(ExChannelAbilityServiceImpl.class);
	@Autowired
	private ExChannelAbilityMapper exChannelAbilityMapper;
	@Override
	@Transactional
	public int addExChannelAbility(Map map) throws Exception{
		ExChannelAbility exChannelAbility = (ExChannelAbility)map.get("exChannelAbility");
		return exChannelAbilityMapper.addExChannelAbility(exChannelAbility);
	}
	@Override
	@Transactional
	public int batchAddExChannelAbility(Map map) throws Exception{
		List<ExChannelAbility> exChannelAbilityList =(List<ExChannelAbility>)map.get("exChannelAbilityList");
		return exChannelAbilityMapper.batchAddExChannelAbility(exChannelAbilityList);
	}
	@Override
	@Transactional
	public int deleteExChannelAbility(Map map) throws Exception{
		BigInteger exChannelAbilityId = (BigInteger)map.get("exChannelAbilityId");
		return exChannelAbilityMapper.deleteExChannelAbility(exChannelAbilityId);
	}
	@Override
	@Transactional
	public int batchDeleteExChannelAbility(Map map) throws Exception{
		List exChannelAbilityIdList = (List)map.get("exChannelAbilityIdList");
		return exChannelAbilityMapper.batchDeleteExChannelAbility(exChannelAbilityIdList);
	}
	@Override
	@Transactional
	public int updateExChannelAbility(Map map) throws Exception{
			ExChannelAbility exChannelAbility = (ExChannelAbility)map.get("exChannelAbility");
			return exChannelAbilityMapper.updateExChannelAbility(exChannelAbility);
	}
//	@Override
//	public ExChannelAbility getExChannelAbility(Map map) throws Exception{
//		BigInteger exChannelAbilityId = (BigInteger)map.get("exChannelAbilityId");
//		return exChannelAbilityMapper.getExChannelAbility(exChannelAbilityId);
//	}
//	@Override
//	public ExChannelAbility getExChannelAbilityDTO(Map map) throws Exception{
//		BigInteger exChannelAbilityId = (BigInteger)map.get("exChannelAbilityId");
//		return exChannelAbilityMapper.getExChannelAbilityDTO(exChannelAbilityId);
//	}
//	@Override
//	public List<ExChannelAbility> getExChannelAbilityList(Map map) throws Exception{
//		ExChannelAbility exChannelAbility = (ExChannelAbility)map.get("exChannelAbility");
//		return exChannelAbilityMapper.getExChannelAbilityList(exChannelAbility);
//	}
	@Override
	public Map getExChannelAbilityPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exChannelAbilityMapper.getExChannelAbilityPageList(page);
		return resultMap;
	}
}
