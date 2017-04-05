package com.iss.exchange.core.common.service.impl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dao.ExBankSerialRuleMapper;
import com.iss.exchange.core.common.entity.ExBankSerialRule;
import com.iss.exchange.core.common.service.ExBankSerialRuleService;
@Service("exBankSerialRuleService")
public class ExBankSerialRuleServiceImpl implements ExBankSerialRuleService {

	public static Logger logger = LoggerFactory.getLogger(ExBankSerialRuleServiceImpl.class);
	@Autowired
	private ExBankSerialRuleMapper exBankSerialRuleMapper;
	@Override
	@Transactional
	public int addExBankSerialRule(Map map) throws Exception{
		ExBankSerialRule exBankSerialRule = (ExBankSerialRule)map.get("exBankSerialRule");
		return exBankSerialRuleMapper.addExBankSerialRule(exBankSerialRule);
	}
	@Override
	@Transactional
	public int batchAddExBankSerialRule(Map map) throws Exception{
		List<ExBankSerialRule> exBankSerialRuleList =(List<ExBankSerialRule>)map.get("exBankSerialRuleList");
		return exBankSerialRuleMapper.batchAddExBankSerialRule(exBankSerialRuleList);
	}
	@Override
	@Transactional
	public int deleteExBankSerialRule(Map map) throws Exception{
		BigInteger exBankSerialRuleId = (BigInteger)map.get("exBankSerialRuleId");
		return exBankSerialRuleMapper.deleteExBankSerialRule(exBankSerialRuleId);
	}
	@Override
	@Transactional
	public int batchDeleteExBankSerialRule(Map map) throws Exception{
		List exBankSerialRuleIdList = (List)map.get("exBankSerialRuleIdList");
		return exBankSerialRuleMapper.batchDeleteExBankSerialRule(exBankSerialRuleIdList);
	}
	@Override
	@Transactional
	public int updateExBankSerialRule(Map map) throws Exception{
			ExBankSerialRule exBankSerialRule = (ExBankSerialRule)map.get("exBankSerialRule");
			return exBankSerialRuleMapper.updateExBankSerialRule(exBankSerialRule);
	}
//	@Override
//	public ExBankSerialRule getExBankSerialRule(Map map) throws Exception{
//		BigInteger exBankSerialRuleId = (BigInteger)map.get("exBankSerialRuleId");
//		return exBankSerialRuleMapper.getExBankSerialRule(exBankSerialRuleId);
//	}
//	@Override
//	public ExBankSerialRule getExBankSerialRuleDTO(Map map) throws Exception{
//		BigInteger exBankSerialRuleId = (BigInteger)map.get("exBankSerialRuleId");
//		return exBankSerialRuleMapper.getExBankSerialRuleDTO(exBankSerialRuleId);
//	}
//	@Override
//	public List<ExBankSerialRule> getExBankSerialRuleList(Map map) throws Exception{
//		ExBankSerialRule exBankSerialRule = (ExBankSerialRule)map.get("exBankSerialRule");
//		return exBankSerialRuleMapper.getExBankSerialRuleList(exBankSerialRule);
//	}
	@Override
	public Map getExBankSerialRulePageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exBankSerialRuleMapper.getExBankSerialRulePageList(page);
		return resultMap;
	}
}
