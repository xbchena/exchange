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
import com.iss.exchange.core.common.dao.ExBankFrontMapper;
import com.iss.exchange.core.common.entity.ExBankFront;
import com.iss.exchange.core.common.service.ExBankFrontService;
@Service("exBankFrontService")
public class ExBankFrontServiceImpl implements ExBankFrontService {

	public static Logger logger = LoggerFactory.getLogger(ExBankFrontServiceImpl.class);
	@Autowired
	private ExBankFrontMapper exBankFrontMapper;
	@Override
	@Transactional
	public int addExBankFront(Map map) throws Exception{
		ExBankFront exBankFront = (ExBankFront)map.get("exBankFront");
		return exBankFrontMapper.addExBankFront(exBankFront);
	}
	@Override
	@Transactional
	public int batchAddExBankFront(Map map) throws Exception{
		List<ExBankFront> exBankFrontList =(List<ExBankFront>)map.get("exBankFrontList");
		return exBankFrontMapper.batchAddExBankFront(exBankFrontList);
	}
	@Override
	@Transactional
	public int deleteExBankFront(Map map) throws Exception{
		BigInteger exBankFrontId = (BigInteger)map.get("exBankFrontId");
		return exBankFrontMapper.deleteExBankFront(exBankFrontId);
	}
	@Override
	@Transactional
	public int batchDeleteExBankFront(Map map) throws Exception{
		List exBankFrontIdList = (List)map.get("exBankFrontIdList");
		return exBankFrontMapper.batchDeleteExBankFront(exBankFrontIdList);
	}
	@Override
	@Transactional
	public int updateExBankFront(Map map) throws Exception{
			ExBankFront exBankFront = (ExBankFront)map.get("exBankFront");
			return exBankFrontMapper.updateExBankFront(exBankFront);
	}
//	@Override
//	public ExBankFront getExBankFront(Map map) throws Exception{
//		BigInteger exBankFrontId = (BigInteger)map.get("exBankFrontId");
//		return exBankFrontMapper.getExBankFront(exBankFrontId);
//	}
//	@Override
//	public ExBankFront getExBankFrontDTO(Map map) throws Exception{
//		BigInteger exBankFrontId = (BigInteger)map.get("exBankFrontId");
//		return exBankFrontMapper.getExBankFrontDTO(exBankFrontId);
//	}
//	@Override
//	public List<ExBankFront> getExBankFrontList(Map map) throws Exception{
//		ExBankFront exBankFront = (ExBankFront)map.get("exBankFront");
//		return exBankFrontMapper.getExBankFrontList(exBankFront);
//	}
	@Override
	public Map getExBankFrontPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exBankFrontMapper.getExBankFrontPageList(page);
		return resultMap;
	}
}
