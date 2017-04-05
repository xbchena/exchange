package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPayBatchInstructionIntDetail;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDetailDTO;
import java.util.List;
import java.util.Map;
public interface ExPayBatchInstructionIntDetailService {

	//增加
	public int addExPayBatchInstructionIntDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExPayBatchInstructionIntDetail(Map map) throws Exception;

	//删除
	public int deleteExPayBatchInstructionIntDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPayBatchInstructionIntDetail(Map map) throws Exception;

	//修改
	public int updateExPayBatchInstructionIntDetail(Map map) throws Exception;

//	//查询entity
//	public ExPayBatchInstructionIntDetail getExPayBatchInstructionIntDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExPayBatchInstructionIntDetailDTO getExPayBatchInstructionIntDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPayBatchInstructionIntDetailDTO> getExPayBatchInstructionIntDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExPayBatchInstructionIntDetailPageList(Map map) throws Exception;

}
