package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecSingleInstructionIntDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionInt;
public interface ExRecSingleInstructionIntService {

	//增加
	public int addExRecSingleInstructionInt(Map map) throws Exception;

	//批量增加
	public int batchAddExRecSingleInstructionInt(Map map) throws Exception;

	//删除
	public int deleteExRecSingleInstructionInt(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecSingleInstructionInt(Map map) throws Exception;

	//修改
	public int updateExRecSingleInstructionInt(Map map) throws Exception;

//	//查询entity
//	public ExRecSingleInstructionInt getExRecSingleInstructionInt(Map map) throws Exception;
//
//	//查询dto
//	public ExRecSingleInstructionIntDTO getExRecSingleInstructionIntDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecSingleInstructionIntDTO> getExRecSingleInstructionIntList(Map map) throws Exception;

	//分页查询List
	public Map getExRecSingleInstructionIntPageList(Map map) throws Exception;

}
