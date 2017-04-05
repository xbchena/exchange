package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionInt;
public interface ExRecRouteInstructionIntService {

	//增加
	public int addExRecRouteInstructionInt(Map map) throws Exception;

	//批量增加
	public int batchAddExRecRouteInstructionInt(Map map) throws Exception;

	//删除
	public int deleteExRecRouteInstructionInt(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecRouteInstructionInt(Map map) throws Exception;

	//修改
	public int updateExRecRouteInstructionInt(Map map) throws Exception;

//	//查询entity
//	public ExRecRouteInstructionInt getExRecRouteInstructionInt(Map map) throws Exception;
//
//	//查询dto
//	public ExRecRouteInstructionIntDTO getExRecRouteInstructionIntDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecRouteInstructionIntDTO> getExRecRouteInstructionIntList(Map map) throws Exception;

	//分页查询List
	public Map getExRecRouteInstructionIntPageList(Map map) throws Exception;

}
