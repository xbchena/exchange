package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPayRouteInstructionIntDetail;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionIntDetailDTO;
import java.util.List;
import java.util.Map;
public interface ExPayRouteInstructionIntDetailService {

	//增加
	public int addExPayRouteInstructionIntDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExPayRouteInstructionIntDetail(Map map) throws Exception;

	//删除
	public int deleteExPayRouteInstructionIntDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPayRouteInstructionIntDetail(Map map) throws Exception;

	//修改
	public int updateExPayRouteInstructionIntDetail(Map map) throws Exception;

//	//查询entity
//	public ExPayRouteInstructionIntDetail getExPayRouteInstructionIntDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExPayRouteInstructionIntDetailDTO getExPayRouteInstructionIntDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPayRouteInstructionIntDetailDTO> getExPayRouteInstructionIntDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExPayRouteInstructionIntDetailPageList(Map map) throws Exception;

}
