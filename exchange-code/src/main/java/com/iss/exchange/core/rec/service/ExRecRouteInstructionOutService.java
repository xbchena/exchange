package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecRouteInstructionOutDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionOut;
public interface ExRecRouteInstructionOutService {

	//增加
	public int addExRecRouteInstructionOut(Map map) throws Exception;

	//批量增加
	public int batchAddExRecRouteInstructionOut(Map map) throws Exception;

	//删除
	public int deleteExRecRouteInstructionOut(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecRouteInstructionOut(Map map) throws Exception;

	//修改
	public int updateExRecRouteInstructionOut(Map map) throws Exception;

//	//查询entity
//	public ExRecRouteInstructionOut getExRecRouteInstructionOut(Map map) throws Exception;
//
//	//查询dto
//	public ExRecRouteInstructionOutDTO getExRecRouteInstructionOutDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecRouteInstructionOutDTO> getExRecRouteInstructionOutList(Map map) throws Exception;

	//分页查询List
	public Map getExRecRouteInstructionOutPageList(Map map) throws Exception;

}
