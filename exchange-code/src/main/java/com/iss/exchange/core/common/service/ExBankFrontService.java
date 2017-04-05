package com.iss.exchange.core.common.service;

import com.iss.exchange.core.common.entity.ExBankFront;
import com.iss.exchange.core.common.dto.ExBankFrontDTO;
import java.util.List;
import java.util.Map;
public interface ExBankFrontService {

	//增加
	public int addExBankFront(Map map) throws Exception;

	//批量增加
	public int batchAddExBankFront(Map map) throws Exception;

	//删除
	public int deleteExBankFront(Map map) throws Exception;

	//批量删除
	public int batchDeleteExBankFront(Map map) throws Exception;

	//修改
	public int updateExBankFront(Map map) throws Exception;
//
//	//查询entity
//	public ExBankFront getExBankFront(Map map) throws Exception;
//
//	//查询dto
//	public ExBankFrontDTO getExBankFrontDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExBankFrontDTO> getExBankFrontList(Map map) throws Exception;

	//分页查询List
	public Map getExBankFrontPageList(Map map) throws Exception;

}
