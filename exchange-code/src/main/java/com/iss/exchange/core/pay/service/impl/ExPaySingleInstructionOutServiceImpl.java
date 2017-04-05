package com.iss.exchange.core.pay.service.impl;

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
import com.iss.exchange.core.pay.dao.ExPaySingleInstructionOutMapper;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionOut;
import com.iss.exchange.core.pay.service.ExPaySingleInstructionOutService;
@Service("exPaySingleInstructionOutService")
public class ExPaySingleInstructionOutServiceImpl implements ExPaySingleInstructionOutService {

	public static Logger logger = LoggerFactory.getLogger(ExPaySingleInstructionOutServiceImpl.class);
	@Autowired
	private ExPaySingleInstructionOutMapper exPaySingleInstructionOutMapper;
	@Override
	@Transactional
	public int addExPaySingleInstructionOut(Map map) throws Exception{
		ExPaySingleInstructionOut exPaySingleInstructionOut = (ExPaySingleInstructionOut)map.get("exPaySingleInstructionOut");
		return exPaySingleInstructionOutMapper.addExPaySingleInstructionOut(exPaySingleInstructionOut);
	}
	@Override
	@Transactional
	public int batchAddExPaySingleInstructionOut(Map map) throws Exception{
		List<ExPaySingleInstructionOut> exPaySingleInstructionOutList =(List<ExPaySingleInstructionOut>)map.get("exPaySingleInstructionOutList");
		return exPaySingleInstructionOutMapper.batchAddExPaySingleInstructionOut(exPaySingleInstructionOutList);
	}
	@Override
	@Transactional
	public int deleteExPaySingleInstructionOut(Map map) throws Exception{
		BigInteger exPaySingleInstructionOutId = (BigInteger)map.get("exPaySingleInstructionOutId");
		return exPaySingleInstructionOutMapper.deleteExPaySingleInstructionOut(exPaySingleInstructionOutId);
	}
	@Override
	@Transactional
	public int batchDeleteExPaySingleInstructionOut(Map map) throws Exception{
		List exPaySingleInstructionOutIdList = (List)map.get("exPaySingleInstructionOutIdList");
		return exPaySingleInstructionOutMapper.batchDeleteExPaySingleInstructionOut(exPaySingleInstructionOutIdList);
	}
	@Override
	@Transactional
	public int updateExPaySingleInstructionOut(Map map) throws Exception{
			ExPaySingleInstructionOut exPaySingleInstructionOut = (ExPaySingleInstructionOut)map.get("exPaySingleInstructionOut");
			return exPaySingleInstructionOutMapper.updateExPaySingleInstructionOut(exPaySingleInstructionOut);
	}
//	@Override
//	public ExPaySingleInstructionOut getExPaySingleInstructionOut(Map map) throws Exception{
//		BigInteger exPaySingleInstructionOutId = (BigInteger)map.get("exPaySingleInstructionOutId");
//		return exPaySingleInstructionOutMapper.getExPaySingleInstructionOut(exPaySingleInstructionOutId);
//	}
//	@Override
//	public ExPaySingleInstructionOut getExPaySingleInstructionOutDTO(Map map) throws Exception{
//		BigInteger exPaySingleInstructionOutId = (BigInteger)map.get("exPaySingleInstructionOutId");
//		return exPaySingleInstructionOutMapper.getExPaySingleInstructionOutDTO(exPaySingleInstructionOutId);
//	}
//	@Override
//	public List<ExPaySingleInstructionOut> getExPaySingleInstructionOutList(Map map) throws Exception{
//		ExPaySingleInstructionOut exPaySingleInstructionOut = (ExPaySingleInstructionOut)map.get("exPaySingleInstructionOut");
//		return exPaySingleInstructionOutMapper.getExPaySingleInstructionOutList(exPaySingleInstructionOut);
//	}
	@Override
	public Map getExPaySingleInstructionOutPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPaySingleInstructionOutMapper.getExPaySingleInstructionOutPageList(page);
		return resultMap;
	}
}
