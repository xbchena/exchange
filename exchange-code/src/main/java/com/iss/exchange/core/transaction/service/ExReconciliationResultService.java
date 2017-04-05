package com.iss.exchange.core.transaction.service;

import com.iss.exchange.core.transaction.entity.ExReconciliationResult;
import com.iss.exchange.core.transaction.dto.ExReconciliationResultDTO;
import java.util.List;
import java.util.Map;
public interface ExReconciliationResultService {

	//增加
	public int addExReconciliationResult(Map map) throws Exception;

	//批量增加
	public int batchAddExReconciliationResult(Map map) throws Exception;

	//删除
	public int deleteExReconciliationResult(Map map) throws Exception;

	//批量删除
	public int batchDeleteExReconciliationResult(Map map) throws Exception;

	//修改
	public int updateExReconciliationResult(Map map) throws Exception;

//	//查询entity
//	public ExReconciliationResult getExReconciliationResult(Map map) throws Exception;
//
//	//查询dto
//	public ExReconciliationResultDTO getExReconciliationResultDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExReconciliationResultDTO> getExReconciliationResultList(Map map) throws Exception;

	//分页查询List
	public Map getExReconciliationResultPageList(Map map) throws Exception;

}
