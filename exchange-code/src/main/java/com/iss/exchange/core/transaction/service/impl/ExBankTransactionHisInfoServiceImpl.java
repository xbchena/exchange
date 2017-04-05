package com.iss.exchange.core.transaction.service.impl;

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
import com.iss.exchange.core.transaction.dao.ExBankTransactionHisInfoMapper;
import com.iss.exchange.core.transaction.entity.ExBankTransactionHisInfo;
import com.iss.exchange.core.transaction.service.ExBankTransactionHisInfoService;
@Service("exBankTransactionHisInfoService")
public class ExBankTransactionHisInfoServiceImpl implements ExBankTransactionHisInfoService {

	public static Logger logger = LoggerFactory.getLogger(ExBankTransactionHisInfoServiceImpl.class);
	@Autowired
	private ExBankTransactionHisInfoMapper exBankTransactionHisInfoMapper;
	@Override
	@Transactional
	public int addExBankTransactionHisInfo(Map map) throws Exception{
		ExBankTransactionHisInfo exBankTransactionHisInfo = (ExBankTransactionHisInfo)map.get("exBankTransactionHisInfo");
		return exBankTransactionHisInfoMapper.addExBankTransactionHisInfo(exBankTransactionHisInfo);
	}
	@Override
	@Transactional
	public int batchAddExBankTransactionHisInfo(Map map) throws Exception{
		List<ExBankTransactionHisInfo> exBankTransactionHisInfoList =(List<ExBankTransactionHisInfo>)map.get("exBankTransactionHisInfoList");
		return exBankTransactionHisInfoMapper.batchAddExBankTransactionHisInfo(exBankTransactionHisInfoList);
	}
	@Override
	@Transactional
	public int deleteExBankTransactionHisInfo(Map map) throws Exception{
		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
		return exBankTransactionHisInfoMapper.deleteExBankTransactionHisInfo(exBankTransactionHisInfoId);
	}
	@Override
	@Transactional
	public int batchDeleteExBankTransactionHisInfo(Map map) throws Exception{
		List exBankTransactionHisInfoIdList = (List)map.get("exBankTransactionHisInfoIdList");
		return exBankTransactionHisInfoMapper.batchDeleteExBankTransactionHisInfo(exBankTransactionHisInfoIdList);
	}
	@Override
	@Transactional
	public int updateExBankTransactionHisInfo(Map map) throws Exception{
			ExBankTransactionHisInfo exBankTransactionHisInfo = (ExBankTransactionHisInfo)map.get("exBankTransactionHisInfo");
			return exBankTransactionHisInfoMapper.updateExBankTransactionHisInfo(exBankTransactionHisInfo);
	}
//	@Override
//	public ExBankTransactionHisInfo getExBankTransactionHisInfo(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exBankTransactionHisInfoMapper.getExBankTransactionHisInfo(exBankTransactionHisInfoId);
//	}
//	@Override
//	public ExBankTransactionHisInfo getExBankTransactionHisInfoDTO(Map map) throws Exception{
//		BigInteger exBankTransactionHisInfoId = (BigInteger)map.get("exBankTransactionHisInfoId");
//		return exBankTransactionHisInfoMapper.getExBankTransactionHisInfoDTO(exBankTransactionHisInfoId);
//	}
//	@Override
//	public List<ExBankTransactionHisInfo> getExBankTransactionHisInfoList(Map map) throws Exception{
//		ExBankTransactionHisInfo exBankTransactionHisInfo = (ExBankTransactionHisInfo)map.get("exBankTransactionHisInfo");
//		return exBankTransactionHisInfoMapper.getExBankTransactionHisInfoList(exBankTransactionHisInfo);
//	}
	@Override
	public Map getExBankTransactionHisInfoPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exBankTransactionHisInfoMapper.getExBankTransactionHisInfoPageList(page);
		return resultMap;
	}
}
