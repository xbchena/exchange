package com.iss.exchange.core.common.service.impl;

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
import com.iss.exchange.core.common.dao.ExBankTypeMapper;
import com.iss.exchange.core.common.entity.ExBankType;
import com.iss.exchange.core.common.service.ExBankTypeService;
@Service("exBankTypeService")
public class ExBankTypeServiceImpl implements ExBankTypeService {

	public static Logger logger = LoggerFactory.getLogger(ExBankTypeServiceImpl.class);
	@Autowired
	private ExBankTypeMapper exBankTypeMapper;
	@Override
	@Transactional
	public int addExBankType(Map map) throws Exception{
		ExBankType exBankType = (ExBankType)map.get("exBankType");
		return exBankTypeMapper.addExBankType(exBankType);
	}
	@Override
	@Transactional
	public int batchAddExBankType(Map map) throws Exception{
		List<ExBankType> exBankTypeList =(List<ExBankType>)map.get("exBankTypeList");
		return exBankTypeMapper.batchAddExBankType(exBankTypeList);
	}
	@Override
	@Transactional
	public int deleteExBankType(Map map) throws Exception{
		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
		return exBankTypeMapper.deleteExBankType(exBankTransactionHisInfoId);
	}
	@Override
	@Transactional
	public int batchDeleteExBankType(Map map) throws Exception{
		List exBankTypeIdList = (List)map.get("exBankTypeIdList");
		return exBankTypeMapper.batchDeleteExBankType(exBankTypeIdList);
	}
	@Override
	@Transactional
	public int updateExBankType(Map map) throws Exception{
			ExBankType exBankType = (ExBankType)map.get("exBankType");
			return exBankTypeMapper.updateExBankType(exBankType);
	}
//	@Override
//	public ExBankType getExBankType(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exBankTypeMapper.getExBankType(exBankTransactionHisInfoId);
//	}
//	@Override
//	public ExBankType getExBankTypeDTO(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exBankTypeMapper.getExBankTypeDTO(exBankTransactionHisInfoId);
//	}
//	@Override
//	public List<ExBankType> getExBankTypeList(Map map) throws Exception{
//		ExBankType exBankType = (ExBankType)map.get("exBankType");
//		return exBankTypeMapper.getExBankTypeList(exBankType);
//	}
	@Override
	public Map getExBankTypePageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exBankTypeMapper.getExBankTypePageList(page);
		return resultMap;
	}
}
