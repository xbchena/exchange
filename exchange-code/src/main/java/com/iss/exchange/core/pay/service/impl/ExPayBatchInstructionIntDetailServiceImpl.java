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
import com.iss.exchange.core.pay.dao.ExPayBatchInstructionIntDetailMapper;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionIntDetail;
import com.iss.exchange.core.pay.service.ExPayBatchInstructionIntDetailService;
@Service("exPayBatchInstructionIntDetailService")
public class ExPayBatchInstructionIntDetailServiceImpl implements ExPayBatchInstructionIntDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExPayBatchInstructionIntDetailServiceImpl.class);
	@Autowired
	private ExPayBatchInstructionIntDetailMapper exPayBatchInstructionIntDetailMapper;
	@Override
	@Transactional
	public int addExPayBatchInstructionIntDetail(Map map) throws Exception{
		ExPayBatchInstructionIntDetail exPayBatchInstructionIntDetail = (ExPayBatchInstructionIntDetail)map.get("exPayBatchInstructionIntDetail");
		return exPayBatchInstructionIntDetailMapper.addExPayBatchInstructionIntDetail(exPayBatchInstructionIntDetail);
	}
	@Override
	@Transactional
	public int batchAddExPayBatchInstructionIntDetail(Map map) throws Exception{
		List<ExPayBatchInstructionIntDetail> exPayBatchInstructionIntDetailList =(List<ExPayBatchInstructionIntDetail>)map.get("exPayBatchInstructionIntDetailList");
		return exPayBatchInstructionIntDetailMapper.batchAddExPayBatchInstructionIntDetail(exPayBatchInstructionIntDetailList);
	}
	@Override
	@Transactional
	public int deleteExPayBatchInstructionIntDetail(Map map) throws Exception{
		BigInteger exPayBatchInstructionIntDetailId = (BigInteger)map.get("exPayBatchInstructionIntDetailId");
		return exPayBatchInstructionIntDetailMapper.deleteExPayBatchInstructionIntDetail(exPayBatchInstructionIntDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExPayBatchInstructionIntDetail(Map map) throws Exception{
		List exPayBatchInstructionIntDetailIdList = (List)map.get("exPayBatchInstructionIntDetailIdList");
		return exPayBatchInstructionIntDetailMapper.batchDeleteExPayBatchInstructionIntDetail(exPayBatchInstructionIntDetailIdList);
	}
	@Override
	@Transactional
	public int updateExPayBatchInstructionIntDetail(Map map) throws Exception{
			ExPayBatchInstructionIntDetail exPayBatchInstructionIntDetail = (ExPayBatchInstructionIntDetail)map.get("exPayBatchInstructionIntDetail");
			return exPayBatchInstructionIntDetailMapper.updateExPayBatchInstructionIntDetail(exPayBatchInstructionIntDetail);
	}
//	@Override
//	public ExPayBatchInstructionIntDetail getExPayBatchInstructionIntDetail(Map map) throws Exception{
//		BigInteger exPayBatchInstructionIntDetailId = (BigInteger)map.get("exPayBatchInstructionIntDetailId");
//		return exPayBatchInstructionIntDetailMapper.getExPayBatchInstructionIntDetail(exPayBatchInstructionIntDetailId);
//	}
//	@Override
//	public ExPayBatchInstructionIntDetail getExPayBatchInstructionIntDetailDTO(Map map) throws Exception{
//		BigInteger exPayBatchInstructionIntDetailId = (BigInteger)map.get("exPayBatchInstructionIntDetailId");
//		return exPayBatchInstructionIntDetailMapper.getExPayBatchInstructionIntDetailDTO(exPayBatchInstructionIntDetailId);
//	}
//	@Override
//	public List<ExPayBatchInstructionIntDetail> getExPayBatchInstructionIntDetailList(Map map) throws Exception{
//		ExPayBatchInstructionIntDetail exPayBatchInstructionIntDetail = (ExPayBatchInstructionIntDetail)map.get("exPayBatchInstructionIntDetail");
//		return exPayBatchInstructionIntDetailMapper.getExPayBatchInstructionIntDetailList(exPayBatchInstructionIntDetail);
//	}
	@Override
	public Map getExPayBatchInstructionIntDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPayBatchInstructionIntDetailMapper.getExPayBatchInstructionIntDetailPageList(page);
		return resultMap;
	}
}
