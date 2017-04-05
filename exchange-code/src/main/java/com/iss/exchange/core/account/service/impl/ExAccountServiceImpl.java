package com.iss.exchange.core.account.service.impl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.iss.exchange.core.account.dao.ExAccountMapper;
import com.iss.exchange.core.account.entity.ExAccount;
import com.iss.exchange.core.account.service.ExAccountService;
@Service("exAccountService")
public class ExAccountServiceImpl implements ExAccountService {

	public static Logger logger = LoggerFactory.getLogger(ExAccountServiceImpl.class);
	@Autowired
	private ExAccountMapper exAccountMapper;
	@Override
	@Transactional
	public int addExAccount(Map map) throws Exception{
		ExAccount exAccount = (ExAccount)map.get("exAccount");
		return exAccountMapper.addExAccount(exAccount);
	}
	@Override
	@Transactional
	public int batchAddExAccount(Map map) throws Exception{
		List<ExAccount> exAccountList =(List<ExAccount>)map.get("exAccountList");
		return exAccountMapper.batchAddExAccount(exAccountList);
	}
	@Override
	@Transactional
	public int deleteExAccount(Map map) throws Exception{
		BigInteger exAccountId = (BigInteger)map.get("exAccountId");
		return exAccountMapper.deleteExAccount(exAccountId);
	}
	@Override
	@Transactional
	public int batchDeleteExAccount(Map map) throws Exception{
		List exAccountIdList = (List)map.get("exAccountIdList");
		return exAccountMapper.batchDeleteExAccount(exAccountIdList);
	}
	@Override
	@Transactional
	public int updateExAccount(Map map) throws Exception{
			ExAccount exAccount = (ExAccount)map.get("exAccount");
			return exAccountMapper.updateExAccount(exAccount);
	}
//	@Override
//	public ExAccount getExAccount(Map map) throws Exception{
//		BigInteger exAccountId = (BigInteger)map.get("exAccountId");
//		return exAccountMapper.getExAccount(exAccountId);
//	}
//	@Override
//	public ExAccount getExAccountDTO(Map map) throws Exception{
//		BigInteger exAccountId = (BigInteger)map.get("exAccountId");
//		return exAccountMapper.getExAccountDTO(exAccountId);
//	}
//	@Override
//	public List<ExAccount> getExAccountList(Map map) throws Exception{
//		ExAccount exAccount = (ExAccount)map.get("exAccount");
//		return exAccountMapper.getExAccountList(exAccount);
//	}
	@Override
	public Map getExAccountPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exAccountMapper.getExAccountPageList(page);
		return resultMap;
	}
}
