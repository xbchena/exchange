package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOut;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDTO;
import java.util.List;
import java.util.Map;
public interface ExPayRouteInstructionOutService {

	//增加
	public int addExPayRouteInstructionOut(Map map) throws Exception;

	//批量增加
	public int batchAddExPayRouteInstructionOut(Map map) throws Exception;

	//删除
	public int deleteExPayRouteInstructionOut(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPayRouteInstructionOut(Map map) throws Exception;

	//修改
	public int updateExPayRouteInstructionOut(Map map) throws Exception;

//	//查询entity
//	public ExPayRouteInstructionOut getExPayRouteInstructionOut(Map map) throws Exception;
//
//	//查询dto
//	public ExPayRouteInstructionOutDTO getExPayRouteInstructionOutDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPayRouteInstructionOutDTO> getExPayRouteInstructionOutList(Map map) throws Exception;

	//分页查询List
	public Map getExPayRouteInstructionOutPageList(Map map) throws Exception;

}
