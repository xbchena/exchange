package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecSingleInstructionOutDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionOut;
public interface ExRecSingleInstructionOutService {

	//增加
	public int addExRecSingleInstructionOut(Map map) throws Exception;

	//批量增加
	public int batchAddExRecSingleInstructionOut(Map map) throws Exception;

	//删除
	public int deleteExRecSingleInstructionOut(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecSingleInstructionOut(Map map) throws Exception;

	//修改
	public int updateExRecSingleInstructionOut(Map map) throws Exception;

//	//查询entity
//	public ExRecSingleInstructionOut getExRecSingleInstructionOut(Map map) throws Exception;
//
//	//查询dto
//	public ExRecSingleInstructionOutDTO getExRecSingleInstructionOutDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecSingleInstructionOutDTO> getExRecSingleInstructionOutList(Map map) throws Exception;

	//分页查询List
	public Map getExRecSingleInstructionOutPageList(Map map) throws Exception;

}
