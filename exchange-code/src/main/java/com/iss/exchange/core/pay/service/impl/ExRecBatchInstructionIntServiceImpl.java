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
import com.iss.exchange.core.pay.dao.ExRecBatchInstructionIntMapper;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionInt;
import com.iss.exchange.core.pay.service.ExRecBatchInstructionIntService;
@Service("exRecBatchInstructionIntService")
public class ExRecBatchInstructionIntServiceImpl implements ExRecBatchInstructionIntService {

	public static Logger logger = LoggerFactory.getLogger(ExRecBatchInstructionIntServiceImpl.class);
	@Autowired
	private ExRecBatchInstructionIntMapper exRecBatchInstructionIntMapper;
	@Override
	@Transactional
	public int addExRecBatchInstructionInt(Map map) throws Exception{
		ExRecBatchInstructionInt exRecBatchInstructionInt = (ExRecBatchInstructionInt)map.get("exRecBatchInstructionInt");
		return exRecBatchInstructionIntMapper.addExRecBatchInstructionInt(exRecBatchInstructionInt);
	}
	@Override
	@Transactional
	public int batchAddExRecBatchInstructionInt(Map map) throws Exception{
		List<ExRecBatchInstructionInt> exRecBatchInstructionIntList =(List<ExRecBatchInstructionInt>)map.get("exRecBatchInstructionIntList");
		return exRecBatchInstructionIntMapper.batchAddExRecBatchInstructionInt(exRecBatchInstructionIntList);
	}
	@Override
	@Transactional
	public int deleteExRecBatchInstructionInt(Map map) throws Exception{
		BigInteger exRecBatchInstructionInId = (BigInteger)map.get("exRecBatchInstructionInId");
		return exRecBatchInstructionIntMapper.deleteExRecBatchInstructionInt(exRecBatchInstructionInId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecBatchInstructionInt(Map map) throws Exception{
		List exRecBatchInstructionIntIdList = (List)map.get("exRecBatchInstructionIntIdList");
		return exRecBatchInstructionIntMapper.batchDeleteExRecBatchInstructionInt(exRecBatchInstructionIntIdList);
	}
	@Override
	@Transactional
	public int updateExRecBatchInstructionInt(Map map) throws Exception{
			ExRecBatchInstructionInt exRecBatchInstructionInt = (ExRecBatchInstructionInt)map.get("exRecBatchInstructionInt");
			return exRecBatchInstructionIntMapper.updateExRecBatchInstructionInt(exRecBatchInstructionInt);
	}
//	@Override
//	public ExRecBatchInstructionInt getExRecBatchInstructionInt(Map map) throws Exception{
//		BigInteger exRecBatchInstructionInId = (BigInteger)map.get("exRecBatchInstructionInId");
//		return exRecBatchInstructionIntMapper.getExRecBatchInstructionInt(exRecBatchInstructionInId);
//	}
//	@Override
//	public ExRecBatchInstructionInt getExRecBatchInstructionIntDTO(Map map) throws Exception{
//		BigInteger exRecBatchInstructionInId = (BigInteger)map.get("exRecBatchInstructionInId");
//		return exRecBatchInstructionIntMapper.getExRecBatchInstructionIntDTO(exRecBatchInstructionInId);
//	}
//	@Override
//	public List<ExRecBatchInstructionInt> getExRecBatchInstructionIntList(Map map) throws Exception{
//		ExRecBatchInstructionInt exRecBatchInstructionInt = (ExRecBatchInstructionInt)map.get("exRecBatchInstructionInt");
//		return exRecBatchInstructionIntMapper.getExRecBatchInstructionIntList(exRecBatchInstructionInt);
//	}
	@Override
	public Map getExRecBatchInstructionIntPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecBatchInstructionIntMapper.getExRecBatchInstructionIntPageList(page);
		return resultMap;
	}
}
