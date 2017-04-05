package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecRouteInstrucrionOutDetailDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstrucrionOutDetail;
public interface ExRecRouteInstrucrionOutDetailService {

	//增加
	public int addExRecRouteInstrucrionOutDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExRecRouteInstrucrionOutDetail(Map map) throws Exception;

	//删除
	public int deleteExRecRouteInstrucrionOutDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecRouteInstrucrionOutDetail(Map map) throws Exception;

	//修改
	public int updateExRecRouteInstrucrionOutDetail(Map map) throws Exception;

//	//查询entity
//	public ExRecRouteInstrucrionOutDetail getExRecRouteInstrucrionOutDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExRecRouteInstrucrionOutDetailDTO getExRecRouteInstrucrionOutDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecRouteInstrucrionOutDetailDTO> getExRecRouteInstrucrionOutDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExRecRouteInstrucrionOutDetailPageList(Map map) throws Exception;

}
