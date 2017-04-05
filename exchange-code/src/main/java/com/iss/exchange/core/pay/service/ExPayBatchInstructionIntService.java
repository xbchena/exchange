package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPayBatchInstructionInt;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDTO;
import java.util.List;
import java.util.Map;
public interface ExPayBatchInstructionIntService {

	//增加
	public int addExPayBatchInstructionInt(Map map) throws Exception;

	//批量增加
	public int batchAddExPayBatchInstructionInt(Map map) throws Exception;

	//删除
	public int deleteExPayBatchInstructionInt(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPayBatchInstructionInt(Map map) throws Exception;

	//修改
	public int updateExPayBatchInstructionInt(Map map) throws Exception;

//	//查询entity
//	public ExPayBatchInstructionInt getExPayBatchInstructionInt(Map map) throws Exception;
//
//	//查询dto
//	public ExPayBatchInstructionIntDTO getExPayBatchInstructionIntDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPayBatchInstructionIntDTO> getExPayBatchInstructionIntList(Map map) throws Exception;

	//分页查询List
	public Map getExPayBatchInstructionIntPageList(Map map) throws Exception;

}
