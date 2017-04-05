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
import com.iss.exchange.core.common.dao.ExBusinessTypeMapper;
import com.iss.exchange.core.common.entity.ExBusinessType;
import com.iss.exchange.core.common.service.ExBusinessTypeService;
@Service("exBusinessTypeService")
public class ExBusinessTypeServiceImpl implements ExBusinessTypeService {

	public static Logger logger = LoggerFactory.getLogger(ExBusinessTypeServiceImpl.class);
	@Autowired
	private ExBusinessTypeMapper exBusinessTypeMapper;
	@Override
	@Transactional
	public int addExBusinessType(Map map) throws Exception{
		ExBusinessType exBusinessType = (ExBusinessType)map.get("exBusinessType");
		return exBusinessTypeMapper.addExBusinessType(exBusinessType);
	}
	@Override
	@Transactional
	public int batchAddExBusinessType(Map map) throws Exception{
		List<ExBusinessType> exBusinessTypeList =(List<ExBusinessType>)map.get("exBusinessTypeList");
		return exBusinessTypeMapper.batchAddExBusinessType(exBusinessTypeList);
	}
	@Override
	@Transactional
	public int deleteExBusinessType(Map map) throws Exception{
		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
		return exBusinessTypeMapper.deleteExBusinessType(exBankTransactionHisInfoId);
	}
	@Override
	@Transactional
	public int batchDeleteExBusinessType(Map map) throws Exception{
		List exBusinessTypeIdList = (List)map.get("exBusinessTypeIdList");
		return exBusinessTypeMapper.batchDeleteExBusinessType(exBusinessTypeIdList);
	}
	@Override
	@Transactional
	public int updateExBusinessType(Map map) throws Exception{
			ExBusinessType exBusinessType = (ExBusinessType)map.get("exBusinessType");
			return exBusinessTypeMapper.updateExBusinessType(exBusinessType);
	}
//	@Override
//	public ExBusinessType getExBusinessType(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exBusinessTypeMapper.getExBusinessType(exBankTransactionHisInfoId);
//	}
//	@Override
//	public ExBusinessType getExBusinessTypeDTO(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exBusinessTypeMapper.getExBusinessTypeDTO(exBankTransactionHisInfoId);
//	}
//	@Override
//	public List<ExBusinessType> getExBusinessTypeList(Map map) throws Exception{
//		ExBusinessType exBusinessType = (ExBusinessType)map.get("exBusinessType");
//		return exBusinessTypeMapper.getExBusinessTypeList(exBusinessType);
//	}
	@Override
	public Map getExBusinessTypePageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exBusinessTypeMapper.getExBusinessTypePageList(page);
		return resultMap;
	}
}
