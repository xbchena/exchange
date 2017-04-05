package com.iss.exchange.core.route.service;

import com.iss.exchange.core.route.entity.ExRouteDynInfo;
import com.iss.exchange.core.route.dto.ExRouteDynInfoDTO;
import java.util.List;
import java.util.Map;
public interface ExRouteDynInfoService {

	//增加
	public int addExRouteDynInfo(Map map) throws Exception;

	//批量增加
	public int batchAddExRouteDynInfo(Map map) throws Exception;

	//删除
	public int deleteExRouteDynInfo(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRouteDynInfo(Map map) throws Exception;

	//修改
	public int updateExRouteDynInfo(Map map) throws Exception;

//	//查询entity
//	public ExRouteDynInfo getExRouteDynInfo(Map map) throws Exception;
//
//	//查询dto
//	public ExRouteDynInfoDTO getExRouteDynInfoDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRouteDynInfoDTO> getExRouteDynInfoList(Map map) throws Exception;

	//分页查询List
	public Map getExRouteDynInfoPageList(Map map) throws Exception;

}
