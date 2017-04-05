package com.iss.exchange.core.pay.service.impl;

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
import com.iss.exchange.core.pay.dao.ExPaySingleInstructionIntMapper;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionInt;
import com.iss.exchange.core.pay.service.ExPaySingleInstructionIntService;
@Service("exPaySingleInstructionIntService")
public class ExPaySingleInstructionIntServiceImpl implements ExPaySingleInstructionIntService {

	public static Logger logger = LoggerFactory.getLogger(ExPaySingleInstructionIntServiceImpl.class);
	@Autowired
	private ExPaySingleInstructionIntMapper exPaySingleInstructionIntMapper;
	@Override
	@Transactional
	public int addExPaySingleInstructionInt(Map map) throws Exception{
		ExPaySingleInstructionInt exPaySingleInstructionInt = (ExPaySingleInstructionInt)map.get("exPaySingleInstructionInt");
		return exPaySingleInstructionIntMapper.addExPaySingleInstructionInt(exPaySingleInstructionInt);
	}
	@Override
	@Transactional
	public int batchAddExPaySingleInstructionInt(Map map) throws Exception{
		List<ExPaySingleInstructionInt> exPaySingleInstructionIntList =(List<ExPaySingleInstructionInt>)map.get("exPaySingleInstructionIntList");
		return exPaySingleInstructionIntMapper.batchAddExPaySingleInstructionInt(exPaySingleInstructionIntList);
	}
	@Override
	@Transactional
	public int deleteExPaySingleInstructionInt(Map map) throws Exception{
		BigInteger exPaySingleInstructionInId = (BigInteger)map.get("exPaySingleInstructionInId");
		return exPaySingleInstructionIntMapper.deleteExPaySingleInstructionInt(exPaySingleInstructionInId);
	}
	@Override
	@Transactional
	public int batchDeleteExPaySingleInstructionInt(Map map) throws Exception{
		List exPaySingleInstructionIntIdList = (List)map.get("exPaySingleInstructionIntIdList");
		return exPaySingleInstructionIntMapper.batchDeleteExPaySingleInstructionInt(exPaySingleInstructionIntIdList);
	}
	@Override
	@Transactional
	public int updateExPaySingleInstructionInt(Map map) throws Exception{
			ExPaySingleInstructionInt exPaySingleInstructionInt = (ExPaySingleInstructionInt)map.get("exPaySingleInstructionInt");
			return exPaySingleInstructionIntMapper.updateExPaySingleInstructionInt(exPaySingleInstructionInt);
	}
//	@Override
//	public ExPaySingleInstructionInt getExPaySingleInstructionInt(Map map) throws Exception{
//		BigInteger exPaySingleInstructionInId = (BigInteger)map.get("exPaySingleInstructionInId");
//		return exPaySingleInstructionIntMapper.getExPaySingleInstructionInt(exPaySingleInstructionInId);
//	}
//	@Override
//	public ExPaySingleInstructionInt getExPaySingleInstructionIntDTO(Map map) throws Exception{
//		BigInteger exPaySingleInstructionInId = (BigInteger)map.get("exPaySingleInstructionInId");
//		return exPaySingleInstructionIntMapper.getExPaySingleInstructionIntDTO(exPaySingleInstructionInId);
//	}
//	@Override
//	public List<ExPaySingleInstructionInt> getExPaySingleInstructionIntList(Map map) throws Exception{
//		ExPaySingleInstructionInt exPaySingleInstructionInt = (ExPaySingleInstructionInt)map.get("exPaySingleInstructionInt");
//		return exPaySingleInstructionIntMapper.getExPaySingleInstructionIntList(exPaySingleInstructionInt);
//	}
	@Override
	public Map getExPaySingleInstructionIntPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPaySingleInstructionIntMapper.getExPaySingleInstructionIntPageList(page);
		return resultMap;
	}
}
