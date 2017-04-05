package com.iss.exchange.core.route.service;

import com.iss.exchange.core.route.entity.ExRouteStaticInfo;
import com.iss.exchange.core.route.dto.ExRouteStaticInfoDTO;
import java.util.List;
import java.util.Map;
public interface ExRouteStaticInfoService {

	//增加
	public int addExRouteStaticInfo(Map map) throws Exception;

	//批量增加
	public int batchAddExRouteStaticInfo(Map map) throws Exception;

	//删除
	public int deleteExRouteStaticInfo(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRouteStaticInfo(Map map) throws Exception;

	//修改
	public int updateExRouteStaticInfo(Map map) throws Exception;

//	//查询entity
//	public ExRouteStaticInfo getExRouteStaticInfo(Map map) throws Exception;
//
//	//查询dto
//	public ExRouteStaticInfoDTO getExRouteStaticInfoDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRouteStaticInfoDTO> getExRouteStaticInfoList(Map map) throws Exception;

	//分页查询List
	public Map getExRouteStaticInfoPageList(Map map) throws Exception;

}
