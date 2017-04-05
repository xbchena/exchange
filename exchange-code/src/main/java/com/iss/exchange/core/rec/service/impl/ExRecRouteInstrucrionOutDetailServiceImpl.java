package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecRouteInstrucrionOutDetail;
import com.iss.exchange.core.rec.dto.ExRecRouteInstrucrionOutDetailDTO;
import com.iss.exchange.core.rec.dao.ExRecRouteInstrucrionOutDetailMapper;
import com.iss.exchange.core.rec.service.ExRecRouteInstrucrionOutDetailService;
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
@Service("exRecRouteInstrucrionOutDetailService")
public class ExRecRouteInstrucrionOutDetailServiceImpl implements ExRecRouteInstrucrionOutDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExRecRouteInstrucrionOutDetailServiceImpl.class);
	@Autowired
	private ExRecRouteInstrucrionOutDetailMapper exRecRouteInstrucrionOutDetailMapper;
	@Override
	@Transactional
	public int addExRecRouteInstrucrionOutDetail(Map map) throws Exception{
		ExRecRouteInstrucrionOutDetail exRecRouteInstrucrionOutDetail = (ExRecRouteInstrucrionOutDetail)map.get("exRecRouteInstrucrionOutDetail");
		return exRecRouteInstrucrionOutDetailMapper.addExRecRouteInstrucrionOutDetail(exRecRouteInstrucrionOutDetail);
	}
	@Override
	@Transactional
	public int batchAddExRecRouteInstrucrionOutDetail(Map map) throws Exception{
		List<ExRecRouteInstrucrionOutDetail> exRecRouteInstrucrionOutDetailList =(List<ExRecRouteInstrucrionOutDetail>)map.get("exRecRouteInstrucrionOutDetailList");
		return exRecRouteInstrucrionOutDetailMapper.batchAddExRecRouteInstrucrionOutDetail(exRecRouteInstrucrionOutDetailList);
	}
	@Override
	@Transactional
	public int deleteExRecRouteInstrucrionOutDetail(Map map) throws Exception{
		BigInteger exRecRouteInstrucrionOutDetailId = (BigInteger)map.get("exRecRouteInstrucrionOutDetailId");
		return exRecRouteInstrucrionOutDetailMapper.deleteExRecRouteInstrucrionOutDetail(exRecRouteInstrucrionOutDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecRouteInstrucrionOutDetail(Map map) throws Exception{
		List exRecRouteInstrucrionOutDetailIdList = (List)map.get("exRecRouteInstrucrionOutDetailIdList");
		return exRecRouteInstrucrionOutDetailMapper.batchDeleteExRecRouteInstrucrionOutDetail(exRecRouteInstrucrionOutDetailIdList);
	}
	@Override
	@Transactional
	public int updateExRecRouteInstrucrionOutDetail(Map map) throws Exception{
			ExRecRouteInstrucrionOutDetail exRecRouteInstrucrionOutDetail = (ExRecRouteInstrucrionOutDetail)map.get("exRecRouteInstrucrionOutDetail");
			return exRecRouteInstrucrionOutDetailMapper.updateExRecRouteInstrucrionOutDetail(exRecRouteInstrucrionOutDetail);
	}
//	@Override
//	public ExRecRouteInstrucrionOutDetail getExRecRouteInstrucrionOutDetail(Map map) throws Exception{
//		BigInteger exRecRouteInstrucrionOutDetailId = (BigInteger)map.get("exRecRouteInstrucrionOutDetailId");
//		return exRecRouteInstrucrionOutDetailMapper.getExRecRouteInstrucrionOutDetail(exRecRouteInstrucrionOutDetailId);
//	}
//	@Override
//	public ExRecRouteInstrucrionOutDetail getExRecRouteInstrucrionOutDetailDTO(Map map) throws Exception{
//		BigInteger exRecRouteInstrucrionOutDetailId = (BigInteger)map.get("exRecRouteInstrucrionOutDetailId");
//		return exRecRouteInstrucrionOutDetailMapper.getExRecRouteInstrucrionOutDetailDTO(exRecRouteInstrucrionOutDetailId);
//	}
//	@Override
//	public List<ExRecRouteInstrucrionOutDetail> getExRecRouteInstrucrionOutDetailList(Map map) throws Exception{
//		ExRecRouteInstrucrionOutDetail exRecRouteInstrucrionOutDetail = (ExRecRouteInstrucrionOutDetail)map.get("exRecRouteInstrucrionOutDetail");
//		return exRecRouteInstrucrionOutDetailMapper.getExRecRouteInstrucrionOutDetailList(exRecRouteInstrucrionOutDetail);
//	}
	@Override
	public Map getExRecRouteInstrucrionOutDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecRouteInstrucrionOutDetailMapper.getExRecRouteInstrucrionOutDetailPageList(page);
		return resultMap;
	}
}
