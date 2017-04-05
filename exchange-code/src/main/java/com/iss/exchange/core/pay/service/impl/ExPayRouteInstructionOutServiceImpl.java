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
import com.iss.exchange.core.pay.dao.ExPayRouteInstructionOutMapper;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOut;
import com.iss.exchange.core.pay.service.ExPayRouteInstructionOutService;
@Service("exPayRouteInstructionOutService")
public class ExPayRouteInstructionOutServiceImpl implements ExPayRouteInstructionOutService {

	public static Logger logger = LoggerFactory.getLogger(ExPayRouteInstructionOutServiceImpl.class);
	@Autowired
	private ExPayRouteInstructionOutMapper exPayRouteInstructionOutMapper;
	@Override
	@Transactional
	public int addExPayRouteInstructionOut(Map map) throws Exception{
		ExPayRouteInstructionOut exPayRouteInstructionOut = (ExPayRouteInstructionOut)map.get("exPayRouteInstructionOut");
		return exPayRouteInstructionOutMapper.addExPayRouteInstructionOut(exPayRouteInstructionOut);
	}
	@Override
	@Transactional
	public int batchAddExPayRouteInstructionOut(Map map) throws Exception{
		List<ExPayRouteInstructionOut> exPayRouteInstructionOutList =(List<ExPayRouteInstructionOut>)map.get("exPayRouteInstructionOutList");
		return exPayRouteInstructionOutMapper.batchAddExPayRouteInstructionOut(exPayRouteInstructionOutList);
	}
	@Override
	@Transactional
	public int deleteExPayRouteInstructionOut(Map map) throws Exception{
		BigInteger exPayRouteInstrutctionOutId = (BigInteger)map.get("exPayRouteInstrutctionOutId");
		return exPayRouteInstructionOutMapper.deleteExPayRouteInstructionOut(exPayRouteInstrutctionOutId);
	}
	@Override
	@Transactional
	public int batchDeleteExPayRouteInstructionOut(Map map) throws Exception{
		List exPayRouteInstructionOutIdList = (List)map.get("exPayRouteInstructionOutIdList");
		return exPayRouteInstructionOutMapper.batchDeleteExPayRouteInstructionOut(exPayRouteInstructionOutIdList);
	}
	@Override
	@Transactional
	public int updateExPayRouteInstructionOut(Map map) throws Exception{
			ExPayRouteInstructionOut exPayRouteInstructionOut = (ExPayRouteInstructionOut)map.get("exPayRouteInstructionOut");
			return exPayRouteInstructionOutMapper.updateExPayRouteInstructionOut(exPayRouteInstructionOut);
	}
//	@Override
//	public ExPayRouteInstructionOut getExPayRouteInstructionOut(Map map) throws Exception{
//		BigInteger exPayRouteInstrutctionOutId = (BigInteger)map.get("exPayRouteInstrutctionOutId");
//		return exPayRouteInstructionOutMapper.getExPayRouteInstructionOut(exPayRouteInstrutctionOutId);
//	}
//	@Override
//	public ExPayRouteInstructionOut getExPayRouteInstructionOutDTO(Map map) throws Exception{
//		BigInteger exPayRouteInstrutctionOutId = (BigInteger)map.get("exPayRouteInstrutctionOutId");
//		return exPayRouteInstructionOutMapper.getExPayRouteInstructionOutDTO(exPayRouteInstrutctionOutId);
//	}
//	@Override
//	public List<ExPayRouteInstructionOut> getExPayRouteInstructionOutList(Map map) throws Exception{
//		ExPayRouteInstructionOut exPayRouteInstructionOut = (ExPayRouteInstructionOut)map.get("exPayRouteInstructionOut");
//		return exPayRouteInstructionOutMapper.getExPayRouteInstructionOutList(exPayRouteInstructionOut);
//	}
	@Override
	public Map getExPayRouteInstructionOutPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exPayRouteInstructionOutMapper.getExPayRouteInstructionOutPageList(page);
		return resultMap;
	}
}
