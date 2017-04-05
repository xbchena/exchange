package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExPaySingleInstructionInt;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionIntDTO;
import java.util.List;
import java.util.Map;
public interface ExPaySingleInstructionIntService {

	//增加
	public int addExPaySingleInstructionInt(Map map) throws Exception;

	//批量增加
	public int batchAddExPaySingleInstructionInt(Map map) throws Exception;

	//删除
	public int deleteExPaySingleInstructionInt(Map map) throws Exception;

	//批量删除
	public int batchDeleteExPaySingleInstructionInt(Map map) throws Exception;

	//修改
	public int updateExPaySingleInstructionInt(Map map) throws Exception;

//	//查询entity
//	public ExPaySingleInstructionInt getExPaySingleInstructionInt(Map map) throws Exception;
//
//	//查询dto
//	public ExPaySingleInstructionIntDTO getExPaySingleInstructionIntDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExPaySingleInstructionIntDTO> getExPaySingleInstructionIntList(Map map) throws Exception;

	//分页查询List
	public Map getExPaySingleInstructionIntPageList(Map map) throws Exception;

}
