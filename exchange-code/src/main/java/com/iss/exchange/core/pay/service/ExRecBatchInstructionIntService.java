package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExRecBatchInstructionInt;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDTO;
import java.util.List;
import java.util.Map;
public interface ExRecBatchInstructionIntService {

	//增加
	public int addExRecBatchInstructionInt(Map map) throws Exception;

	//批量增加
	public int batchAddExRecBatchInstructionInt(Map map) throws Exception;

	//删除
	public int deleteExRecBatchInstructionInt(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecBatchInstructionInt(Map map) throws Exception;

	//修改
	public int updateExRecBatchInstructionInt(Map map) throws Exception;

//	//查询entity
//	public ExRecBatchInstructionInt getExRecBatchInstructionInt(Map map) throws Exception;
//
//	//查询dto
//	public ExRecBatchInstructionIntDTO getExRecBatchInstructionIntDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecBatchInstructionIntDTO> getExRecBatchInstructionIntList(Map map) throws Exception;

	//分页查询List
	public Map getExRecBatchInstructionIntPageList(Map map) throws Exception;

}
