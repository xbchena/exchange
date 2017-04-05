package com.iss.exchange.core.transaction.service.impl;

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
import com.iss.exchange.core.transaction.dao.ExReconciliationResultMapper;
import com.iss.exchange.core.transaction.entity.ExReconciliationResult;
import com.iss.exchange.core.transaction.service.ExReconciliationResultService;
@Service("exReconciliationResultService")
public class ExReconciliationResultServiceImpl implements ExReconciliationResultService {

	public static Logger logger = LoggerFactory.getLogger(ExReconciliationResultServiceImpl.class);
	@Autowired
	private ExReconciliationResultMapper exReconciliationResultMapper;
	@Override
	@Transactional
	public int addExReconciliationResult(Map map) throws Exception{
		ExReconciliationResult exReconciliationResult = (ExReconciliationResult)map.get("exReconciliationResult");
		return exReconciliationResultMapper.addExReconciliationResult(exReconciliationResult);
	}
	@Override
	@Transactional
	public int batchAddExReconciliationResult(Map map) throws Exception{
		List<ExReconciliationResult> exReconciliationResultList =(List<ExReconciliationResult>)map.get("exReconciliationResultList");
		return exReconciliationResultMapper.batchAddExReconciliationResult(exReconciliationResultList);
	}
	@Override
	@Transactional
	public int deleteExReconciliationResult(Map map) throws Exception{
		BigInteger exReconciliationResultId = (BigInteger)map.get("exReconciliationResultId");
		return exReconciliationResultMapper.deleteExReconciliationResult(exReconciliationResultId);
	}
	@Override
	@Transactional
	public int batchDeleteExReconciliationResult(Map map) throws Exception{
		List exReconciliationResultIdList = (List)map.get("exReconciliationResultIdList");
		return exReconciliationResultMapper.batchDeleteExReconciliationResult(exReconciliationResultIdList);
	}
	@Override
	@Transactional
	public int updateExReconciliationResult(Map map) throws Exception{
			ExReconciliationResult exReconciliationResult = (ExReconciliationResult)map.get("exReconciliationResult");
			return exReconciliationResultMapper.updateExReconciliationResult(exReconciliationResult);
	}
//	@Override
//	public ExReconciliationResult getExReconciliationResult(Map map) throws Exception{
//		BigInteger exReconciliationResultId = (BigInteger)map.get("exReconciliationResultId");
//		return exReconciliationResultMapper.getExReconciliationResult(exReconciliationResultId);
//	}
//	@Override
//	public ExReconciliationResult getExReconciliationResultDTO(Map map) throws Exception{
//		BigInteger exReconciliationResultId = (BigInteger)map.get("exReconciliationResultId");
//		return exReconciliationResultMapper.getExReconciliationResultDTO(exReconciliationResultId);
//	}
//	@Override
//	public List<ExReconciliationResult> getExReconciliationResultList(Map map) throws Exception{
//		ExReconciliationResult exReconciliationResult = (ExReconciliationResult)map.get("exReconciliationResult");
//		return exReconciliationResultMapper.getExReconciliationResultList(exReconciliationResult);
//	}
	@Override
	public Map getExReconciliationResultPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exReconciliationResultMapper.getExReconciliationResultPageList(page);
		return resultMap;
	}
}
