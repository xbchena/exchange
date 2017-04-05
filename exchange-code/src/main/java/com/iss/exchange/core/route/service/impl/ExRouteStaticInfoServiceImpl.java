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
import com.iss.exchange.core.route.dao.ExRouteStaticInfoMapper;
import com.iss.exchange.core.route.entity.ExRouteStaticInfo;
import com.iss.exchange.core.route.service.ExRouteStaticInfoService;
@Service("exRouteStaticInfoService")
public class ExRouteStaticInfoServiceImpl implements ExRouteStaticInfoService {

	public static Logger logger = LoggerFactory.getLogger(ExRouteStaticInfoServiceImpl.class);
	@Autowired
	private ExRouteStaticInfoMapper exRouteStaticInfoMapper;
	@Override
	@Transactional
	public int addExRouteStaticInfo(Map map) throws Exception{
		ExRouteStaticInfo exRouteStaticInfo = (ExRouteStaticInfo)map.get("exRouteStaticInfo");
		return exRouteStaticInfoMapper.addExRouteStaticInfo(exRouteStaticInfo);
	}
	@Override
	@Transactional
	public int batchAddExRouteStaticInfo(Map map) throws Exception{
		List<ExRouteStaticInfo> exRouteStaticInfoList =(List<ExRouteStaticInfo>)map.get("exRouteStaticInfoList");
		return exRouteStaticInfoMapper.batchAddExRouteStaticInfo(exRouteStaticInfoList);
	}
	@Override
	@Transactional
	public int deleteExRouteStaticInfo(Map map) throws Exception{
		BigInteger exRouteStaticInfoId = (BigInteger)map.get("exRouteStaticInfoId");
		return exRouteStaticInfoMapper.deleteExRouteStaticInfo(exRouteStaticInfoId);
	}
	@Override
	@Transactional
	public int batchDeleteExRouteStaticInfo(Map map) throws Exception{
		List exRouteStaticInfoIdList = (List)map.get("exRouteStaticInfoIdList");
		return exRouteStaticInfoMapper.batchDeleteExRouteStaticInfo(exRouteStaticInfoIdList);
	}
	@Override
	@Transactional
	public int updateExRouteStaticInfo(Map map) throws Exception{
			ExRouteStaticInfo exRouteStaticInfo = (ExRouteStaticInfo)map.get("exRouteStaticInfo");
			return exRouteStaticInfoMapper.updateExRouteStaticInfo(exRouteStaticInfo);
	}
//	@Override
//	public ExRouteStaticInfo getExRouteStaticInfo(Map map) throws Exception{
//		BigInteger exRouteStaticInfoId = (BigInteger)map.get("exRouteStaticInfoId");
//		return exRouteStaticInfoMapper.getExRouteStaticInfo(exRouteStaticInfoId);
//	}
//	@Override
//	public ExRouteStaticInfo getExRouteStaticInfoDTO(Map map) throws Exception{
//		BigInteger exRouteStaticInfoId = (BigInteger)map.get("exRouteStaticInfoId");
//		return exRouteStaticInfoMapper.getExRouteStaticInfoDTO(exRouteStaticInfoId);
//	}
//	@Override
//	public List<ExRouteStaticInfo> getExRouteStaticInfoList(Map map) throws Exception{
//		ExRouteStaticInfo exRouteStaticInfo = (ExRouteStaticInfo)map.get("exRouteStaticInfo");
//		return exRouteStaticInfoMapper.getExRouteStaticInfoList(exRouteStaticInfo);
//	}
	@Override
	public Map getExRouteStaticInfoPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRouteStaticInfoMapper.getExRouteStaticInfoPageList(page);
		return resultMap;
	}
}
