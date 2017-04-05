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
import com.iss.exchange.core.pay.dao.ExRecBatchInstructionOutDetailMapper;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOutDetail;
import com.iss.exchange.core.pay.service.ExRecBatchInstructionOutDetailService;
@Service("exRecBatchInstructionOutDetailService")
public class ExRecBatchInstructionOutDetailServiceImpl implements ExRecBatchInstructionOutDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExRecBatchInstructionOutDetailServiceImpl.class);
	@Autowired
	private ExRecBatchInstructionOutDetailMapper exRecBatchInstructionOutDetailMapper;
	@Override
	@Transactional
	public int addExRecBatchInstructionOutDetail(Map map) throws Exception{
		ExRecBatchInstructionOutDetail exRecBatchInstructionOutDetail = (ExRecBatchInstructionOutDetail)map.get("exRecBatchInstructionOutDetail");
		return exRecBatchInstructionOutDetailMapper.addExRecBatchInstructionOutDetail(exRecBatchInstructionOutDetail);
	}
	@Override
	@Transactional
	public int batchAddExRecBatchInstructionOutDetail(Map map) throws Exception{
		List<ExRecBatchInstructionOutDetail> exRecBatchInstructionOutDetailList =(List<ExRecBatchInstructionOutDetail>)map.get("exRecBatchInstructionOutDetailList");
		return exRecBatchInstructionOutDetailMapper.batchAddExRecBatchInstructionOutDetail(exRecBatchInstructionOutDetailList);
	}
	@Override
	@Transactional
	public int deleteExRecBatchInstructionOutDetail(Map map) throws Exception{
		BigInteger exRecBatchInstrucrionOutDetailId = (BigInteger)map.get("exRecBatchInstrucrionOutDetailId");
		return exRecBatchInstructionOutDetailMapper.deleteExRecBatchInstructionOutDetail(exRecBatchInstrucrionOutDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecBatchInstructionOutDetail(Map map) throws Exception{
		List exRecBatchInstructionOutDetailIdList = (List)map.get("exRecBatchInstructionOutDetailIdList");
		return exRecBatchInstructionOutDetailMapper.batchDeleteExRecBatchInstructionOutDetail(exRecBatchInstructionOutDetailIdList);
	}
	@Override
	@Transactional
	public int updateExRecBatchInstructionOutDetail(Map map) throws Exception{
			ExRecBatchInstructionOutDetail exRecBatchInstructionOutDetail = (ExRecBatchInstructionOutDetail)map.get("exRecBatchInstructionOutDetail");
			return exRecBatchInstructionOutDetailMapper.updateExRecBatchInstructionOutDetail(exRecBatchInstructionOutDetail);
	}
//	@Override
//	public ExRecBatchInstructionOutDetail getExRecBatchInstructionOutDetail(Map map) throws Exception{
//		BigInteger exRecBatchInstrucrionOutDetailId = (BigInteger)map.get("exRecBatchInstrucrionOutDetailId");
//		return exRecBatchInstructionOutDetailMapper.getExRecBatchInstructionOutDetail(exRecBatchInstrucrionOutDetailId);
//	}
//	@Override
//	public ExRecBatchInstructionOutDetail getExRecBatchInstructionOutDetailDTO(Map map) throws Exception{
//		BigInteger exRecBatchInstrucrionOutDetailId = (BigInteger)map.get("exRecBatchInstrucrionOutDetailId");
//		return exRecBatchInstructionOutDetailMapper.getExRecBatchInstructionOutDetailDTO(exRecBatchInstrucrionOutDetailId);
//	}
//	@Override
//	public List<ExRecBatchInstructionOutDetail> getExRecBatchInstructionOutDetailList(Map map) throws Exception{
//		ExRecBatchInstructionOutDetail exRecBatchInstructionOutDetail = (ExRecBatchInstructionOutDetail)map.get("exRecBatchInstructionOutDetail");
//		return exRecBatchInstructionOutDetailMapper.getExRecBatchInstructionOutDetailList(exRecBatchInstructionOutDetail);
//	}
	@Override
	public Map getExRecBatchInstructionOutDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecBatchInstructionOutDetailMapper.getExRecBatchInstructionOutDetailPageList(page);
		return resultMap;
	}
}
