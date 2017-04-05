package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDetailDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionIntDetail;
public interface ExRecRouteInstructionIntDetailService {

	//增加
	public int addExRecRouteInstructionIntDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExRecRouteInstructionIntDetail(Map map) throws Exception;

	//删除
	public int deleteExRecRouteInstructionIntDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecRouteInstructionIntDetail(Map map) throws Exception;

	//修改
	public int updateExRecRouteInstructionIntDetail(Map map) throws Exception;

//	//查询entity
//	public ExRecRouteInstructionIntDetail getExRecRouteInstructionIntDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExRecRouteInstructionIntDetailDTO getExRecRouteInstructionIntDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecRouteInstructionIntDetailDTO> getExRecRouteInstructionIntDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExRecRouteInstructionIntDetailPageList(Map map) throws Exception;

}
