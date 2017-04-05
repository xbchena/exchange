package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPaySingleInstructionOut;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionOutDTO;
import java.util.List;
import java.util.Map;
public interface ExPaySingleInstructionOutService {

	//增加
	public int addExPaySingleInstructionOut(Map map) throws Exception;

	//批量增加
	public int batchAddExPaySingleInstructionOut(Map map) throws Exception;

	//删除
	public int deleteExPaySingleInstructionOut(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPaySingleInstructionOut(Map map) throws Exception;

	//修改
	public int updateExPaySingleInstructionOut(Map map) throws Exception;

//	//查询entity
//	public ExPaySingleInstructionOut getExPaySingleInstructionOut(Map map) throws Exception;
//
//	//查询dto
//	public ExPaySingleInstructionOutDTO getExPaySingleInstructionOutDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPaySingleInstructionOutDTO> getExPaySingleInstructionOutList(Map map) throws Exception;

	//分页查询List
	public Map getExPaySingleInstructionOutPageList(Map map) throws Exception;

}
