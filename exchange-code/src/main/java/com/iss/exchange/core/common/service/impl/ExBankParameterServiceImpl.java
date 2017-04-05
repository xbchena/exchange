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
import com.iss.exchange.core.common.dao.ExBankParameterMapper;
import com.iss.exchange.core.common.entity.ExBankParameter;
import com.iss.exchange.core.common.service.ExBankParameterService;
@Service("exBankParameterService")
public class ExBankParameterServiceImpl implements ExBankParameterService {

	public static Logger logger = LoggerFactory.getLogger(ExBankParameterServiceImpl.class);
	@Autowired
	private ExBankParameterMapper exBankParameterMapper;
	@Override
	@Transactional
	public int addExBankParameter(Map map) throws Exception{
		ExBankParameter exBankParameter = (ExBankParameter)map.get("exBankParameter");
		return exBankParameterMapper.addExBankParameter(exBankParameter);
	}
	@Override
	@Transactional
	public int batchAddExBankParameter(Map map) throws Exception{
		List<ExBankParameter> exBankParameterList =(List<ExBankParameter>)map.get("exBankParameterList");
		return exBankParameterMapper.batchAddExBankParameter(exBankParameterList);
	}
	@Override
	@Transactional
	public int deleteExBankParameter(Map map) throws Exception{
		BigInteger exBankParameterId = (BigInteger)map.get("exBankParameterId");
		return exBankParameterMapper.deleteExBankParameter(exBankParameterId);
	}
	@Override
	@Transactional
	public int batchDeleteExBankParameter(Map map) throws Exception{
		List exBankParameterIdList = (List)map.get("exBankParameterIdList");
		return exBankParameterMapper.batchDeleteExBankParameter(exBankParameterIdList);
	}
	@Override
	@Transactional
	public int updateExBankParameter(Map map) throws Exception{
			ExBankParameter exBankParameter = (ExBankParameter)map.get("exBankParameter");
			return exBankParameterMapper.updateExBankParameter(exBankParameter);
	}
//	@Override
//	public ExBankParameter getExBankParameter(Map map) throws Exception{
//		BigInteger exBankParameterId = (BigInteger)map.get("exBankParameterId");
//		return exBankParameterMapper.getExBankParameter(exBankParameterId);
//	}
//	@Override
//	public ExBankParameter getExBankParameterDTO(Map map) throws Exception{
//		BigInteger exBankParameterId = (BigInteger)map.get("exBankParameterId");
//		return exBankParameterMapper.getExBankParameterDTO(exBankParameterId);
//	}
//	@Override
//	public List<ExBankParameter> getExBankParameterList(Map map) throws Exception{
//		ExBankParameter exBankParameter = (ExBankParameter)map.get("exBankParameter");
//		return exBankParameterMapper.getExBankParameterList(exBankParameter);
//	}
	@Override
	public Map getExBankParameterPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exBankParameterMapper.getExBankParameterPageList(page);
		return resultMap;
	}
}
