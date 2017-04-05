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
import com.iss.exchange.core.pay.dao.ExPayRouteInstructionOutDetailMapper;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOutDetail;
import com.iss.exchange.core.pay.service.ExPayRouteInstructionOutDetailService;
@Service("exPayRouteInstructionOutDetailService")
public class ExPayRouteInstructionOutDetailServiceImpl implements ExPayRouteInstructionOutDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExPayRouteInstructionOutDetailServiceImpl.class);
	@Autowired
	private ExPayRouteInstructionOutDetailMapper exPayRouteInstructionOutDetailMapper;
	@Override
	@Transactional
	public int addExPayRouteInstructionOutDetail(Map map) throws Exception{
		ExPayRouteInstructionOutDetail exPayRouteInstructionOutDetail = (ExPayRouteInstructionOutDetail)map.get("exPayRouteInstructionOutDetail");
		return exPayRouteInstructionOutDetailMapper.addExPayRouteInstructionOutDetail(exPayRouteInstructionOutDetail);
	}
	@Override
	@Transactional
	public int batchAddExPayRouteInstructionOutDetail(Map map) throws Exception{
		List<ExPayRouteInstructionOutDetail> exPayRouteInstructionOutDetailList =(List<ExPayRouteInstructionOutDetail>)map.get("exPayRouteInstructionOutDetailList");
		return exPayRouteInstructionOutDetailMapper.batchAddExPayRouteInstructionOutDetail(exPayRouteInstructionOutDetailList);
	}
	@Override
	@Transactional
	public int deleteExPayRouteInstructionOutDetail(Map map) throws Exception{
		BigInteger exPayRouteInstrucrionOutDetailId = (BigInteger)map.get("exPayRouteInstrucrionOutDetailId");
		return exPayRouteInstructionOutDetailMapper.deleteExPayRouteInstructionOutDetail(exPayRouteInstrucrionOutDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExPayRouteInstructionOutDetail(Map map) throws Exception{
		List exPayRouteInstructionOutDetailIdList = (List)map.get("exPayRouteInstructionOutDetailIdList");
		return exPayRouteInstructionOutDetailMapper.batchDeleteExPayRouteInstructionOutDetail(exPayRouteInstructionOutDetailIdList);
	}
	@Override
	@Transactional
	public int updateExPayRouteInstructionOutDetail(Map map) throws Exception{
			ExPayRouteInstructionOutDetail exPayRouteInstructionOutDetail = (ExPayRouteInstructionOutDetail)map.get("exPayRouteInstructionOutDetail");
			return exPayRouteInstructionOutDetailMapper.updateExPayRouteInstructionOutDetail(exPayRouteInstructionOutDetail);
	}
//	@Override
//	public ExPayRouteInstructionOutDetail getExPayRouteInstructionOutDetail(Map map) throws Exception{
//		BigInteger exPayRouteInstrucrionOutDetailId = (BigInteger)map.get("exPayRouteInstrucrionOutDetailId");
//		return exPayRouteInstructionOutDetailMapper.getExPayRouteInstructionOutDetail(exPayRouteInstrucrionOutDetailId);
//	}
//	@Override
//	public ExPayRouteInstructionOutDetail getExPayRouteInstructionOutDetailDTO(Map map) throws Exception{
//		BigInteger exPayRouteInstrucrionOutDetailId = (BigInteger)map.get("exPayRouteInstrucrionOutDetailId");
//		return exPayRouteInstructionOutDetailMapper.getExPayRouteInstructionOutDetailDTO(exPayRouteInstrucrionOutDetailId);
//	}
//	@Override
//	public List<ExPayRouteInstructionOutDetail> getExPayRouteInstructionOutDetailList(Map map) throws Exception{
//		ExPayRouteInstructionOutDetail exPayRouteInstructionOutDetail = (ExPayRouteInstructionOutDetail)map.get("exPayRouteInstructionOutDetail");
//		return exPayRouteInstructionOutDetailMapper.getExPayRouteInstructionOutDetailList(exPayRouteInstructionOutDetail);
//	}
	@Override
	public Map getExPayRouteInstructionOutDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPayRouteInstructionOutDetailMapper.getExPayRouteInstructionOutDetailPageList(page);
		return resultMap;
	}
}
