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
import com.iss.exchange.core.pay.dao.ExPayBatchInstructionIntMapper;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionInt;
import com.iss.exchange.core.pay.service.ExPayBatchInstructionIntService;
@Service("exPayBatchInstructionIntService")
public class ExPayBatchInstructionIntServiceImpl implements ExPayBatchInstructionIntService {

	public static Logger logger = LoggerFactory.getLogger(ExPayBatchInstructionIntServiceImpl.class);
	@Autowired
	private ExPayBatchInstructionIntMapper exPayBatchInstructionIntMapper;
	@Override
	@Transactional
	public int addExPayBatchInstructionInt(Map map) throws Exception{
		ExPayBatchInstructionInt exPayBatchInstructionInt = (ExPayBatchInstructionInt)map.get("exPayBatchInstructionInt");
		return exPayBatchInstructionIntMapper.addExPayBatchInstructionInt(exPayBatchInstructionInt);
	}
	@Override
	@Transactional
	public int batchAddExPayBatchInstructionInt(Map map) throws Exception{
		List<ExPayBatchInstructionInt> exPayBatchInstructionIntList =(List<ExPayBatchInstructionInt>)map.get("exPayBatchInstructionIntList");
		return exPayBatchInstructionIntMapper.batchAddExPayBatchInstructionInt(exPayBatchInstructionIntList);
	}
	@Override
	@Transactional
	public int deleteExPayBatchInstructionInt(Map map) throws Exception{
		BigInteger exPayBatchInstructionInId = (BigInteger)map.get("exPayBatchInstructionInId");
		return exPayBatchInstructionIntMapper.deleteExPayBatchInstructionInt(exPayBatchInstructionInId);
	}
	@Override
	@Transactional
	public int batchDeleteExPayBatchInstructionInt(Map map) throws Exception{
		List exPayBatchInstructionIntIdList = (List)map.get("exPayBatchInstructionIntIdList");
		return exPayBatchInstructionIntMapper.batchDeleteExPayBatchInstructionInt(exPayBatchInstructionIntIdList);
	}
	@Override
	@Transactional
	public int updateExPayBatchInstructionInt(Map map) throws Exception{
			ExPayBatchInstructionInt exPayBatchInstructionInt = (ExPayBatchInstructionInt)map.get("exPayBatchInstructionInt");
			return exPayBatchInstructionIntMapper.updateExPayBatchInstructionInt(exPayBatchInstructionInt);
	}
//	@Override
//	public ExPayBatchInstructionInt getExPayBatchInstructionInt(Map map) throws Exception{
//		BigInteger exPayBatchInstructionInId = (BigInteger)map.get("exPayBatchInstructionInId");
//		return exPayBatchInstructionIntMapper.getExPayBatchInstructionInt(exPayBatchInstructionInId);
//	}
//	@Override
//	public ExPayBatchInstructionInt getExPayBatchInstructionIntDTO(Map map) throws Exception{
//		BigInteger exPayBatchInstructionInId = (BigInteger)map.get("exPayBatchInstructionInId");
//		return exPayBatchInstructionIntMapper.getExPayBatchInstructionIntDTO(exPayBatchInstructionInId);
//	}
//	@Override
//	public List<ExPayBatchInstructionInt> getExPayBatchInstructionIntList(Map map) throws Exception{
//		ExPayBatchInstructionInt exPayBatchInstructionInt = (ExPayBatchInstructionInt)map.get("exPayBatchInstructionInt");
//		return exPayBatchInstructionIntMapper.getExPayBatchInstructionIntList(exPayBatchInstructionInt);
//	}
	@Override
	public Map getExPayBatchInstructionIntPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPayBatchInstructionIntMapper.getExPayBatchInstructionIntPageList(page);
		return resultMap;
	}
}
