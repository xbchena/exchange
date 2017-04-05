package com.iss.exchange.core.common.service;

import com.iss.exchange.core.common.entity.ExBankType;
import com.iss.exchange.core.common.dto.ExBankTypeDTO;
import java.util.List;
import java.util.Map;
public interface ExBankTypeService {

	//增加
	public int addExBankType(Map map) throws Exception;

	//批量增加
	public int batchAddExBankType(Map map) throws Exception;

	//删除
	public int deleteExBankType(Map map) throws Exception;

	//批量删除
	public int batchDeleteExBankType(Map map) throws Exception;

	//修改
	public int updateExBankType(Map map) throws Exception;

//	//查询entity
//	public ExBankType getExBankType(Map map) throws Exception;
//
//	//查询dto
//	public ExBankTypeDTO getExBankTypeDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExBankTypeDTO> getExBankTypeList(Map map) throws Exception;

	//分页查询List
	public Map getExBankTypePageList(Map map) throws Exception;

}
