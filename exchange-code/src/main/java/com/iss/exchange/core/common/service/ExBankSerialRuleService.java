package com.iss.exchange.core.common.service;

import com.iss.exchange.core.common.entity.ExBankSerialRule;
import com.iss.exchange.core.common.dto.ExBankSerialRuleDTO;
import java.util.List;
import java.util.Map;
public interface ExBankSerialRuleService {

	//增加
	public int addExBankSerialRule(Map map) throws Exception;

	//批量增加
	public int batchAddExBankSerialRule(Map map) throws Exception;

	//删除
	public int deleteExBankSerialRule(Map map) throws Exception;

	//批量删除
	public int batchDeleteExBankSerialRule(Map map) throws Exception;

	//修改
	public int updateExBankSerialRule(Map map) throws Exception;

//	//查询entity
//	public ExBankSerialRule getExBankSerialRule(Map map) throws Exception;
//
//	//查询dto
//	public ExBankSerialRuleDTO getExBankSerialRuleDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExBankSerialRuleDTO> getExBankSerialRuleList(Map map) throws Exception;

	//分页查询List
	public Map getExBankSerialRulePageList(Map map) throws Exception;

}
