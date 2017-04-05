package com.iss.exchange.core.route.service.impl;

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
import com.iss.exchange.core.route.dao.ExRouteDynInfoMapper;
import com.iss.exchange.core.route.entity.ExRouteDynInfo;
import com.iss.exchange.core.route.service.ExRouteDynInfoService;
@Service("exRouteDynInfoService")
public class ExRouteDynInfoServiceImpl implements ExRouteDynInfoService {

	public static Logger logger = LoggerFactory.getLogger(ExRouteDynInfoServiceImpl.class);
	@Autowired
	private ExRouteDynInfoMapper exRouteDynInfoMapper;
	@Override
	@Transactional
	public int addExRouteDynInfo(Map map) throws Exception{
		ExRouteDynInfo exRouteDynInfo = (ExRouteDynInfo)map.get("exRouteDynInfo");
		return exRouteDynInfoMapper.addExRouteDynInfo(exRouteDynInfo);
	}
	@Override
	@Transactional
	public int batchAddExRouteDynInfo(Map map) throws Exception{
		List<ExRouteDynInfo> exRouteDynInfoList =(List<ExRouteDynInfo>)map.get("exRouteDynInfoList");
		return exRouteDynInfoMapper.batchAddExRouteDynInfo(exRouteDynInfoList);
	}
	@Override
	@Transactional
	public int deleteExRouteDynInfo(Map map) throws Exception{
		BigInteger exRouteInfoId = (BigInteger)map.get("exRouteInfoId");
		return exRouteDynInfoMapper.deleteExRouteDynInfo(exRouteInfoId);
	}
	@Override
	@Transactional
	public int batchDeleteExRouteDynInfo(Map map) throws Exception{
		List exRouteDynInfoIdList = (List)map.get("exRouteDynInfoIdList");
		return exRouteDynInfoMapper.batchDeleteExRouteDynInfo(exRouteDynInfoIdList);
	}
	@Override
	@Transactional
	public int updateExRouteDynInfo(Map map) throws Exception{
			ExRouteDynInfo exRouteDynInfo = (ExRouteDynInfo)map.get("exRouteDynInfo");
			return exRouteDynInfoMapper.updateExRouteDynInfo(exRouteDynInfo);
	}
//	@Override
//	public ExRouteDynInfo getExRouteDynInfo(Map map) throws Exception{
//		BigInteger exRouteInfoId = (BigInteger)map.get("exRouteInfoId");
//		return exRouteDynInfoMapper.getExRouteDynInfo(exRouteInfoId);
//	}
//	@Override
//	public ExRouteDynInfo getExRouteDynInfoDTO(Map map) throws Exception{
//		BigInteger exRouteInfoId = (BigInteger)map.get("exRouteInfoId");
//		return exRouteDynInfoMapper.getExRouteDynInfoDTO(exRouteInfoId);
//	}
//	@Override
//	public List<ExRouteDynInfo> getExRouteDynInfoList(Map map) throws Exception{
//		ExRouteDynInfo exRouteDynInfo = (ExRouteDynInfo)map.get("exRouteDynInfo");
//		return exRouteDynInfoMapper.getExRouteDynInfoList(exRouteDynInfo);
//	}
	@Override
	public Map getExRouteDynInfoPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRouteDynInfoMapper.getExRouteDynInfoPageList(page);
		return resultMap;
	}
}
