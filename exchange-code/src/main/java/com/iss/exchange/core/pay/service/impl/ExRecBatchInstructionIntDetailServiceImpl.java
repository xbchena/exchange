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
import com.iss.exchange.core.pay.dao.ExRecBatchInstructionIntDetailMapper;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionIntDetail;
import com.iss.exchange.core.pay.service.ExRecBatchInstructionIntDetailService;
@Service("exRecBatchInstructionIntDetailService")
public class ExRecBatchInstructionIntDetailServiceImpl implements ExRecBatchInstructionIntDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExRecBatchInstructionIntDetailServiceImpl.class);
	@Autowired
	private ExRecBatchInstructionIntDetailMapper exRecBatchInstructionIntDetailMapper;
	@Override
	@Transactional
	public int addExRecBatchInstructionIntDetail(Map map) throws Exception{
		ExRecBatchInstructionIntDetail exRecBatchInstructionIntDetail = (ExRecBatchInstructionIntDetail)map.get("exRecBatchInstructionIntDetail");
		return exRecBatchInstructionIntDetailMapper.addExRecBatchInstructionIntDetail(exRecBatchInstructionIntDetail);
	}
	@Override
	@Transactional
	public int batchAddExRecBatchInstructionIntDetail(Map map) throws Exception{
		List<ExRecBatchInstructionIntDetail> exRecBatchInstructionIntDetailList =(List<ExRecBatchInstructionIntDetail>)map.get("exRecBatchInstructionIntDetailList");
		return exRecBatchInstructionIntDetailMapper.batchAddExRecBatchInstructionIntDetail(exRecBatchInstructionIntDetailList);
	}
	@Override
	@Transactional
	public int deleteExRecBatchInstructionIntDetail(Map map) throws Exception{
		BigInteger exRecBatchInstructionIntDetailId = (BigInteger)map.get("exRecBatchInstructionIntDetailId");
		return exRecBatchInstructionIntDetailMapper.deleteExRecBatchInstructionIntDetail(exRecBatchInstructionIntDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecBatchInstructionIntDetail(Map map) throws Exception{
		List exRecBatchInstructionIntDetailIdList = (List)map.get("exRecBatchInstructionIntDetailIdList");
		return exRecBatchInstructionIntDetailMapper.batchDeleteExRecBatchInstructionIntDetail(exRecBatchInstructionIntDetailIdList);
	}
	@Override
	@Transactional
	public int updateExRecBatchInstructionIntDetail(Map map) throws Exception{
			ExRecBatchInstructionIntDetail exRecBatchInstructionIntDetail = (ExRecBatchInstructionIntDetail)map.get("exRecBatchInstructionIntDetail");
			return exRecBatchInstructionIntDetailMapper.updateExRecBatchInstructionIntDetail(exRecBatchInstructionIntDetail);
	}
//	@Override
//	public ExRecBatchInstructionIntDetail getExRecBatchInstructionIntDetail(Map map) throws Exception{
//		BigInteger exRecBatchInstructionIntDetailId = (BigInteger)map.get("exRecBatchInstructionIntDetailId");
//		return exRecBatchInstructionIntDetailMapper.getExRecBatchInstructionIntDetail(exRecBatchInstructionIntDetailId);
//	}
//	@Override
//	public ExRecBatchInstructionIntDetail getExRecBatchInstructionIntDetailDTO(Map map) throws Exception{
//		BigInteger exRecBatchInstructionIntDetailId = (BigInteger)map.get("exRecBatchInstructionIntDetailId");
//		return exRecBatchInstructionIntDetailMapper.getExRecBatchInstructionIntDetailDTO(exRecBatchInstructionIntDetailId);
//	}
//	@Override
//	public List<ExRecBatchInstructionIntDetail> getExRecBatchInstructionIntDetailList(Map map) throws Exception{
//		ExRecBatchInstructionIntDetail exRecBatchInstructionIntDetail = (ExRecBatchInstructionIntDetail)map.get("exRecBatchInstructionIntDetail");
//		return exRecBatchInstructionIntDetailMapper.getExRecBatchInstructionIntDetailList(exRecBatchInstructionIntDetail);
//	}
	@Override
	public Map getExRecBatchInstructionIntDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecBatchInstructionIntDetailMapper.getExRecBatchInstructionIntDetailPageList(page);
		return resultMap;
	}
}
