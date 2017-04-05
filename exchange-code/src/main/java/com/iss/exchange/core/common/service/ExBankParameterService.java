package com.iss.exchange.core.common.service;

import com.iss.exchange.core.common.entity.ExBankParameter;
import com.iss.exchange.core.common.dto.ExBankParameterDTO;
import java.util.List;
import java.util.Map;
public interface ExBankParameterService {

	//增加
	public int addExBankParameter(Map map) throws Exception;

	//批量增加
	public int batchAddExBankParameter(Map map) throws Exception;

	//删除
	public int deleteExBankParameter(Map map) throws Exception;

	//批量删除
	public int batchDeleteExBankParameter(Map map) throws Exception;

	//修改
	public int updateExBankParameter(Map map) throws Exception;

//	//查询entity
//	public ExBankParameter getExBankParameter(Map map) throws Exception;
//
//	//查询dto
//	public ExBankParameterDTO getExBankParameterDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExBankParameterDTO> getExBankParameterList(Map map) throws Exception;

	//分页查询List
	public Map getExBankParameterPageList(Map map) throws Exception;

}
