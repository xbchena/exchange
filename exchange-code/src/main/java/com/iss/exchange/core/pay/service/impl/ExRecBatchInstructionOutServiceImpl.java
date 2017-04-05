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
import com.iss.exchange.core.pay.dao.ExRecBatchInstructionOutMapper;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOut;
import com.iss.exchange.core.pay.service.ExRecBatchInstructionOutService;
@Service("exRecBatchInstructionOutService")
public class ExRecBatchInstructionOutServiceImpl implements ExRecBatchInstructionOutService {

	public static Logger logger = LoggerFactory.getLogger(ExRecBatchInstructionOutServiceImpl.class);
	@Autowired
	private ExRecBatchInstructionOutMapper exRecBatchInstructionOutMapper;
	@Override
	@Transactional
	public int addExRecBatchInstructionOut(Map map) throws Exception{
		ExRecBatchInstructionOut exRecBatchInstructionOut = (ExRecBatchInstructionOut)map.get("exRecBatchInstructionOut");
		return exRecBatchInstructionOutMapper.addExRecBatchInstructionOut(exRecBatchInstructionOut);
	}
	@Override
	@Transactional
	public int batchAddExRecBatchInstructionOut(Map map) throws Exception{
		List<ExRecBatchInstructionOut> exRecBatchInstructionOutList =(List<ExRecBatchInstructionOut>)map.get("exRecBatchInstructionOutList");
		return exRecBatchInstructionOutMapper.batchAddExRecBatchInstructionOut(exRecBatchInstructionOutList);
	}
	@Override
	@Transactional
	public int deleteExRecBatchInstructionOut(Map map) throws Exception{
		BigInteger exRecBatchInstrutctionOutId = (BigInteger)map.get("exRecBatchInstrutctionOutId");
		return exRecBatchInstructionOutMapper.deleteExRecBatchInstructionOut(exRecBatchInstrutctionOutId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecBatchInstructionOut(Map map) throws Exception{
		List exRecBatchInstructionOutIdList = (List)map.get("exRecBatchInstructionOutIdList");
		return exRecBatchInstructionOutMapper.batchDeleteExRecBatchInstructionOut(exRecBatchInstructionOutIdList);
	}
	@Override
	@Transactional
	public int updateExRecBatchInstructionOut(Map map) throws Exception{
			ExRecBatchInstructionOut exRecBatchInstructionOut = (ExRecBatchInstructionOut)map.get("exRecBatchInstructionOut");
			return exRecBatchInstructionOutMapper.updateExRecBatchInstructionOut(exRecBatchInstructionOut);
	}
//	@Override
//	public ExRecBatchInstructionOut getExRecBatchInstructionOut(Map map) throws Exception{
//		BigInteger exRecBatchInstrutctionOutId = (BigInteger)map.get("exRecBatchInstrutctionOutId");
//		return exRecBatchInstructionOutMapper.getExRecBatchInstructionOut(exRecBatchInstrutctionOutId);
//	}
//	@Override
//	public ExRecBatchInstructionOut getExRecBatchInstructionOutDTO(Map map) throws Exception{
//		BigInteger exRecBatchInstrutctionOutId = (BigInteger)map.get("exRecBatchInstrutctionOutId");
//		return exRecBatchInstructionOutMapper.getExRecBatchInstructionOutDTO(exRecBatchInstrutctionOutId);
//	}
//	@Override
//	public List<ExRecBatchInstructionOut> getExRecBatchInstructionOutList(Map map) throws Exception{
//		ExRecBatchInstructionOut exRecBatchInstructionOut = (ExRecBatchInstructionOut)map.get("exRecBatchInstructionOut");
//		return exRecBatchInstructionOutMapper.getExRecBatchInstructionOutList(exRecBatchInstructionOut);
//	}
	@Override
	public Map getExRecBatchInstructionOutPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecBatchInstructionOutMapper.getExRecBatchInstructionOutPageList(page);
		return resultMap;
	}
}
