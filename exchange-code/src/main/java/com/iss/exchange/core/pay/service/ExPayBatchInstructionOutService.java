package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPayBatchInstructionOut;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionOutDTO;
import java.util.List;
import java.util.Map;
public interface ExPayBatchInstructionOutService {

	//增加
	public int addExPayBatchInstructionOut(Map map) throws Exception;

	//批量增加
	public int batchAddExPayBatchInstructionOut(Map map) throws Exception;

	//删除
	public int deleteExPayBatchInstructionOut(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPayBatchInstructionOut(Map map) throws Exception;

	//修改
	public int updateExPayBatchInstructionOut(Map map) throws Exception;

//	//查询entity
//	public ExPayBatchInstructionOut getExPayBatchInstructionOut(Map map) throws Exception;
//
//	//查询dto
//	public ExPayBatchInstructionOutDTO getExPayBatchInstructionOutDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPayBatchInstructionOutDTO> getExPayBatchInstructionOutList(Map map) throws Exception;

	//分页查询List
	public Map getExPayBatchInstructionOutPageList(Map map) throws Exception;

}
