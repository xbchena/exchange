package com.iss.exchange.core.account.service;

import com.iss.exchange.core.account.entity.ExAccount;
import com.iss.exchange.core.account.dto.ExAccountDTO;
import java.util.List;
import java.util.Map;
public interface ExAccountService {

	//增加
	public int addExAccount(Map map) throws Exception;

	//批量增加
	public int batchAddExAccount(Map map) throws Exception;

	//删除
	public int deleteExAccount(Map map) throws Exception;

	//批量删除
	public int batchDeleteExAccount(Map map) throws Exception;

	//修改
	public int updateExAccount(Map map) throws Exception;

//	//查询entity
//	public ExAccount getExAccount(Map map) throws Exception;
//
//	//查询dto
//	public ExAccount getExAccountDTO(Map map) throws Exception;

//	//查询List
//	public List<ExAccountDTO> getExAccountList(Map map) throws Exception;

	//分页查询List
	public Map getExAccountPageList(Map map) throws Exception;

}
