package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOutDetail;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDetailDTO;
import java.util.List;
import java.util.Map;
public interface ExPayRouteInstructionOutDetailService {

	//增加
	public int addExPayRouteInstructionOutDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExPayRouteInstructionOutDetail(Map map) throws Exception;

	//删除
	public int deleteExPayRouteInstructionOutDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPayRouteInstructionOutDetail(Map map) throws Exception;

	//修改
	public int updateExPayRouteInstructionOutDetail(Map map) throws Exception;

//	//查询entity
//	public ExPayRouteInstructionOutDetail getExPayRouteInstructionOutDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExPayRouteInstructionOutDetailDTO getExPayRouteInstructionOutDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPayRouteInstructionOutDetailDTO> getExPayRouteInstructionOutDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExPayRouteInstructionOutDetailPageList(Map map) throws Exception;

}
