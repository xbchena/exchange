package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOut;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDTO;
import java.util.List;
import java.util.Map;
public interface ExRecBatchInstructionOutService {

	//增加
	public int addExRecBatchInstructionOut(Map map) throws Exception;

	//批量增加
	public int batchAddExRecBatchInstructionOut(Map map) throws Exception;

	//删除
	public int deleteExRecBatchInstructionOut(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecBatchInstructionOut(Map map) throws Exception;

	//修改
	public int updateExRecBatchInstructionOut(Map map) throws Exception;

//	//查询entity
//	public ExRecBatchInstructionOut getExRecBatchInstructionOut(Map map) throws Exception;
//
//	//查询dto
//	public ExRecBatchInstructionOutDTO getExRecBatchInstructionOutDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecBatchInstructionOutDTO> getExRecBatchInstructionOutList(Map map) throws Exception;

	//分页查询List
	public Map getExRecBatchInstructionOutPageList(Map map) throws Exception;

}
