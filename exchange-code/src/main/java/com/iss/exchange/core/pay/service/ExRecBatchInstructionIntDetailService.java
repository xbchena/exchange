package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExRecBatchInstructionIntDetail;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDetailDTO;
import java.util.List;
import java.util.Map;
public interface ExRecBatchInstructionIntDetailService {

	//增加
	public int addExRecBatchInstructionIntDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExRecBatchInstructionIntDetail(Map map) throws Exception;

	//删除
	public int deleteExRecBatchInstructionIntDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecBatchInstructionIntDetail(Map map) throws Exception;

	//修改
	public int updateExRecBatchInstructionIntDetail(Map map) throws Exception;

//	//查询entity
//	public ExRecBatchInstructionIntDetail getExRecBatchInstructionIntDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExRecBatchInstructionIntDetailDTO getExRecBatchInstructionIntDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecBatchInstructionIntDetailDTO> getExRecBatchInstructionIntDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExRecBatchInstructionIntDetailPageList(Map map) throws Exception;

}
