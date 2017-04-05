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
import com.iss.exchange.core.pay.dao.ExPayRouteInstructionIntDetailMapper;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionIntDetail;
import com.iss.exchange.core.pay.service.ExPayRouteInstructionIntDetailService;
@Service("exPayRouteInstructionIntDetailService")
public class ExPayRouteInstructionIntDetailServiceImpl implements ExPayRouteInstructionIntDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExPayRouteInstructionIntDetailServiceImpl.class);
	@Autowired
	private ExPayRouteInstructionIntDetailMapper exPayRouteInstructionIntDetailMapper;
	@Override
	@Transactional
	public int addExPayRouteInstructionIntDetail(Map map) throws Exception{
		ExPayRouteInstructionIntDetail exPayRouteInstructionIntDetail = (ExPayRouteInstructionIntDetail)map.get("exPayRouteInstructionIntDetail");
		return exPayRouteInstructionIntDetailMapper.addExPayRouteInstructionIntDetail(exPayRouteInstructionIntDetail);
	}
	@Override
	@Transactional
	public int batchAddExPayRouteInstructionIntDetail(Map map) throws Exception{
		List<ExPayRouteInstructionIntDetail> exPayRouteInstructionIntDetailList =(List<ExPayRouteInstructionIntDetail>)map.get("exPayRouteInstructionIntDetailList");
		return exPayRouteInstructionIntDetailMapper.batchAddExPayRouteInstructionIntDetail(exPayRouteInstructionIntDetailList);
	}
	@Override
	@Transactional
	public int deleteExPayRouteInstructionIntDetail(Map map) throws Exception{
		BigInteger exPayRouteInstructionIntDetailId = (BigInteger)map.get("exPayRouteInstructionIntDetailId");
		return exPayRouteInstructionIntDetailMapper.deleteExPayRouteInstructionIntDetail(exPayRouteInstructionIntDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExPayRouteInstructionIntDetail(Map map) throws Exception{
		List exPayRouteInstructionIntDetailIdList = (List)map.get("exPayRouteInstructionIntDetailIdList");
		return exPayRouteInstructionIntDetailMapper.batchDeleteExPayRouteInstructionIntDetail(exPayRouteInstructionIntDetailIdList);
	}
	@Override
	@Transactional
	public int updateExPayRouteInstructionIntDetail(Map map) throws Exception{
			ExPayRouteInstructionIntDetail exPayRouteInstructionIntDetail = (ExPayRouteInstructionIntDetail)map.get("exPayRouteInstructionIntDetail");
			return exPayRouteInstructionIntDetailMapper.updateExPayRouteInstructionIntDetail(exPayRouteInstructionIntDetail);
	}
//	@Override
//	public ExPayRouteInstructionIntDetail getExPayRouteInstructionIntDetail(Map map) throws Exception{
//		BigInteger exPayRouteInstructionIntDetailId = (BigInteger)map.get("exPayRouteInstructionIntDetailId");
//		return exPayRouteInstructionIntDetailMapper.getExPayRouteInstructionIntDetail(exPayRouteInstructionIntDetailId);
//	}
//	@Override
//	public ExPayRouteInstructionIntDetail getExPayRouteInstructionIntDetailDTO(Map map) throws Exception{
//		BigInteger exPayRouteInstructionIntDetailId = (BigInteger)map.get("exPayRouteInstructionIntDetailId");
//		return exPayRouteInstructionIntDetailMapper.getExPayRouteInstructionIntDetailDTO(exPayRouteInstructionIntDetailId);
//	}
//	@Override
//	public List<ExPayRouteInstructionIntDetail> getExPayRouteInstructionIntDetailList(Map map) throws Exception{
//		ExPayRouteInstructionIntDetail exPayRouteInstructionIntDetail = (ExPayRouteInstructionIntDetail)map.get("exPayRouteInstructionIntDetail");
//		return exPayRouteInstructionIntDetailMapper.getExPayRouteInstructionIntDetailList(exPayRouteInstructionIntDetail);
//	}
	@Override
	public Map getExPayRouteInstructionIntDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPayRouteInstructionIntDetailMapper.getExPayRouteInstructionIntDetailPageList(page);
		return resultMap;
	}
}
