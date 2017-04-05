package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecRouteInstructionIntDetail;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDetailDTO;
import com.iss.exchange.core.rec.dao.ExRecRouteInstructionIntDetailMapper;
import com.iss.exchange.core.rec.service.ExRecRouteInstructionIntDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import java.util.List;
import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;
@Service("exRecRouteInstructionIntDetailService")
public class ExRecRouteInstructionIntDetailServiceImpl implements ExRecRouteInstructionIntDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExRecRouteInstructionIntDetailServiceImpl.class);
	@Autowired
	private ExRecRouteInstructionIntDetailMapper exRecRouteInstructionIntDetailMapper;
	@Override
	@Transactional
	public int addExRecRouteInstructionIntDetail(Map map) throws Exception{
		ExRecRouteInstructionIntDetail exRecRouteInstructionIntDetail = (ExRecRouteInstructionIntDetail)map.get("exRecRouteInstructionIntDetail");
		return exRecRouteInstructionIntDetailMapper.addExRecRouteInstructionIntDetail(exRecRouteInstructionIntDetail);
	}
	@Override
	@Transactional
	public int batchAddExRecRouteInstructionIntDetail(Map map) throws Exception{
		List<ExRecRouteInstructionIntDetail> exRecRouteInstructionIntDetailList =(List<ExRecRouteInstructionIntDetail>)map.get("exRecRouteInstructionIntDetailList");
		return exRecRouteInstructionIntDetailMapper.batchAddExRecRouteInstructionIntDetail(exRecRouteInstructionIntDetailList);
	}
	@Override
	@Transactional
	public int deleteExRecRouteInstructionIntDetail(Map map) throws Exception{
		BigInteger exRecRouteInstructionIntDetailId = (BigInteger)map.get("exRecRouteInstructionIntDetailId");
		return exRecRouteInstructionIntDetailMapper.deleteExRecRouteInstructionIntDetail(exRecRouteInstructionIntDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecRouteInstructionIntDetail(Map map) throws Exception{
		List exRecRouteInstructionIntDetailIdList = (List)map.get("exRecRouteInstructionIntDetailIdList");
		return exRecRouteInstructionIntDetailMapper.batchDeleteExRecRouteInstructionIntDetail(exRecRouteInstructionIntDetailIdList);
	}
	@Override
	@Transactional
	public int updateExRecRouteInstructionIntDetail(Map map) throws Exception{
			ExRecRouteInstructionIntDetail exRecRouteInstructionIntDetail = (ExRecRouteInstructionIntDetail)map.get("exRecRouteInstructionIntDetail");
			return exRecRouteInstructionIntDetailMapper.updateExRecRouteInstructionIntDetail(exRecRouteInstructionIntDetail);
	}
//	@Override
//	public ExRecRouteInstructionIntDetail getExRecRouteInstructionIntDetail(Map map) throws Exception{
//		BigInteger exRecRouteInstructionIntDetailId = (BigInteger)map.get("exRecRouteInstructionIntDetailId");
//		return exRecRouteInstructionIntDetailMapper.getExRecRouteInstructionIntDetail(exRecRouteInstructionIntDetailId);
//	}
//	@Override
//	public ExRecRouteInstructionIntDetail getExRecRouteInstructionIntDetailDTO(Map map) throws Exception{
//		BigInteger exRecRouteInstructionIntDetailId = (BigInteger)map.get("exRecRouteInstructionIntDetailId");
//		return exRecRouteInstructionIntDetailMapper.getExRecRouteInstructionIntDetailDTO(exRecRouteInstructionIntDetailId);
//	}
//	@Override
//	public List<ExRecRouteInstructionIntDetail> getExRecRouteInstructionIntDetailList(Map map) throws Exception{
//		ExRecRouteInstructionIntDetail exRecRouteInstructionIntDetail = (ExRecRouteInstructionIntDetail)map.get("exRecRouteInstructionIntDetail");
//		return exRecRouteInstructionIntDetailMapper.getExRecRouteInstructionIntDetailList(exRecRouteInstructionIntDetail);
//	}
	@Override
	public Map getExRecRouteInstructionIntDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecRouteInstructionIntDetailMapper.getExRecRouteInstructionIntDetailPageList(page);
		return resultMap;
	}
}
