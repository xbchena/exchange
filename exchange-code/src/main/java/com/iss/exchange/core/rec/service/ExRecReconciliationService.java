package com.iss.exchange.core.rec.service;

import java.util.List;
import java.util.Map;

import com.iss.exchange.core.rec.dto.ExRecReconciliationDTO;
import com.iss.exchange.core.rec.entity.ExRecReconciliation;
public interface ExRecReconciliationService {

	//增加
	public int addExRecReconciliation(Map map) throws Exception;

	//批量增加
	public int batchAddExRecReconciliation(Map map) throws Exception;

	//删除
	public int deleteExRecReconciliation(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecReconciliation(Map map) throws Exception;

	//修改
	public int updateExRecReconciliation(Map map) throws Exception;

//	//查询entity
//	public ExRecReconciliation getExRecReconciliation(Map map) throws Exception;
//
//	//查询dto
//	public ExRecReconciliationDTO getExRecReconciliationDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecReconciliationDTO> getExRecReconciliationList(Map map) throws Exception;

	//分页查询List
	public Map getExRecReconciliationPageList(Map map) throws Exception;

}
