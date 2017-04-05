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
import com.iss.exchange.core.common.dao.ExAgencyMapper;
import com.iss.exchange.core.common.entity.ExAgency;
import com.iss.exchange.core.common.service.ExAgencyService;
@Service("exAgencyService")
public class ExAgencyServiceImpl implements ExAgencyService {

	public static Logger logger = LoggerFactory.getLogger(ExAgencyServiceImpl.class);
	@Autowired
	private ExAgencyMapper exAgencyMapper;
	@Override
	@Transactional
	public int addExAgency(Map map) throws Exception{
		ExAgency exAgency = (ExAgency)map.get("exAgency");
		return exAgencyMapper.addExAgency(exAgency);
	}
	@Override
	@Transactional
	public int batchAddExAgency(Map map) throws Exception{
		List<ExAgency> exAgencyList =(List<ExAgency>)map.get("exAgencyList");
		return exAgencyMapper.batchAddExAgency(exAgencyList);
	}
	@Override
	@Transactional
	public int deleteExAgency(Map map) throws Exception{
		BigInteger exAccountId = (BigInteger)map.get("exAccountId");
		return exAgencyMapper.deleteExAgency(exAccountId);
	}
	@Override
	@Transactional
	public int batchDeleteExAgency(Map map) throws Exception{
		List exAgencyIdList = (List)map.get("exAgencyIdList");
		return exAgencyMapper.batchDeleteExAgency(exAgencyIdList);
	}
	@Override
	@Transactional
	public int updateExAgency(Map map) throws Exception{
			ExAgency exAgency = (ExAgency)map.get("exAgency");
			return exAgencyMapper.updateExAgency(exAgency);
	}
//	@Override
//	public ExAgency getExAgency(Map map) throws Exception{
//		BigInteger exAccountId = (BigInteger)map.get("exAccountId");
//		return exAgencyMapper.getExAgency(exAccountId);
//	}
//	@Override
//	public ExAgency getExAgencyDTO(Map map) throws Exception{
//		BigInteger exAccountId = (BigInteger)map.get("exAccountId");
//		return exAgencyMapper.getExAgencyDTO(exAccountId);
//	}
//	@Override
//	public List<ExAgency> getExAgencyList(Map map) throws Exception{
//		ExAgency exAgency = (ExAgency)map.get("exAgency");
//		return exAgencyMapper.getExAgencyList(exAgency);
//	}
	@Override
	public Map getExAgencyPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exAgencyMapper.getExAgencyPageList(page);
		return resultMap;
	}
}
