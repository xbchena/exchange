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
import com.iss.exchange.core.pay.dao.ExPayBatchInstructionOutMapper;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionOut;
import com.iss.exchange.core.pay.service.ExPayBatchInstructionOutService;
@Service("exPayBatchInstructionOutService")
public class ExPayBatchInstructionOutServiceImpl implements ExPayBatchInstructionOutService {

	public static Logger logger = LoggerFactory.getLogger(ExPayBatchInstructionOutServiceImpl.class);
	@Autowired
	private ExPayBatchInstructionOutMapper exPayBatchInstructionOutMapper;
	@Override
	@Transactional
	public int addExPayBatchInstructionOut(Map map) throws Exception{
		ExPayBatchInstructionOut exPayBatchInstructionOut = (ExPayBatchInstructionOut)map.get("exPayBatchInstructionOut");
		return exPayBatchInstructionOutMapper.addExPayBatchInstructionOut(exPayBatchInstructionOut);
	}
	@Override
	@Transactional
	public int batchAddExPayBatchInstructionOut(Map map) throws Exception{
		List<ExPayBatchInstructionOut> exPayBatchInstructionOutList =(List<ExPayBatchInstructionOut>)map.get("exPayBatchInstructionOutList");
		return exPayBatchInstructionOutMapper.batchAddExPayBatchInstructionOut(exPayBatchInstructionOutList);
	}
	@Override
	@Transactional
	public int deleteExPayBatchInstructionOut(Map map) throws Exception{
		BigInteger exPayBatchInstrutctionOutId = (BigInteger)map.get("exPayBatchInstrutctionOutId");
		return exPayBatchInstructionOutMapper.deleteExPayBatchInstructionOut(exPayBatchInstrutctionOutId);
	}
	@Override
	@Transactional
	public int batchDeleteExPayBatchInstructionOut(Map map) throws Exception{
		List exPayBatchInstructionOutIdList = (List)map.get("exPayBatchInstructionOutIdList");
		return exPayBatchInstructionOutMapper.batchDeleteExPayBatchInstructionOut(exPayBatchInstructionOutIdList);
	}
	@Override
	@Transactional
	public int updateExPayBatchInstructionOut(Map map) throws Exception{
			ExPayBatchInstructionOut exPayBatchInstructionOut = (ExPayBatchInstructionOut)map.get("exPayBatchInstructionOut");
			return exPayBatchInstructionOutMapper.updateExPayBatchInstructionOut(exPayBatchInstructionOut);
	}
//	@Override
//	public ExPayBatchInstructionOut getExPayBatchInstructionOut(Map map) throws Exception{
//		BigInteger exPayBatchInstrutctionOutId = (BigInteger)map.get("exPayBatchInstrutctionOutId");
//		return exPayBatchInstructionOutMapper.getExPayBatchInstructionOut(exPayBatchInstrutctionOutId);
//	}
//	@Override
//	public ExPayBatchInstructionOut getExPayBatchInstructionOutDTO(Map map) throws Exception{
//		BigInteger exPayBatchInstrutctionOutId = (BigInteger)map.get("exPayBatchInstrutctionOutId");
//		return exPayBatchInstructionOutMapper.getExPayBatchInstructionOutDTO(exPayBatchInstrutctionOutId);
//	}
//	@Override
//	public List<ExPayBatchInstructionOut> getExPayBatchInstructionOutList(Map map) throws Exception{
//		ExPayBatchInstructionOut exPayBatchInstructionOut = (ExPayBatchInstructionOut)map.get("exPayBatchInstructionOut");
//		return exPayBatchInstructionOutMapper.getExPayBatchInstructionOutList(exPayBatchInstructionOut);
//	}
	@Override
	public Map getExPayBatchInstructionOutPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPayBatchInstructionOutMapper.getExPayBatchInstructionOutPageList(page);
		return resultMap;
	}
}
