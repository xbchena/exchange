package com.iss.exchange.core.transaction.service;

import com.iss.exchange.core.transaction.entity.ExBankTransactionHisInfo;
import com.iss.exchange.core.transaction.dto.ExBankTransactionHisInfoDTO;
import java.util.List;
import java.util.Map;
public interface ExBankTransactionHisInfoService {

	//增加
	public int addExBankTransactionHisInfo(Map map) throws Exception;

	//批量增加
	public int batchAddExBankTransactionHisInfo(Map map) throws Exception;

	//删除
	public int deleteExBankTransactionHisInfo(Map map) throws Exception;

	//批量删除
	public int batchDeleteExBankTransactionHisInfo(Map map) throws Exception;

	//修改
	public int updateExBankTransactionHisInfo(Map map) throws Exception;

//	//查询entity
//	public ExBankTransactionHisInfo getExBankTransactionHisInfo(Map map) throws Exception;
//
//	//查询dto
//	public ExBankTransactionHisInfoDTO getExBankTransactionHisInfoDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExBankTransactionHisInfoDTO> getExBankTransactionHisInfoList(Map map) throws Exception;

	//分页查询List
	public Map getExBankTransactionHisInfoPageList(Map map) throws Exception;

}
