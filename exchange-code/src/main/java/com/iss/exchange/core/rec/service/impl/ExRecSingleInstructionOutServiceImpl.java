package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecSingleInstructionOut;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionOutDTO;
import com.iss.exchange.core.rec.dao.ExRecSingleInstructionOutMapper;
import com.iss.exchange.core.rec.service.ExRecSingleInstructionOutService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import java.util.List;
import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;
@Service("exRecSingleInstructionOutService")
public class ExRecSingleInstructionOutServiceImpl implements ExRecSingleInstructionOutService {

	public static Logger logger = LoggerFactory.getLogger(ExRecSingleInstructionOutServiceImpl.class);
	@Autowired
	private ExRecSingleInstructionOutMapper exRecSingleInstructionOutMapper;
	@Override
	@Transactional
	public int addExRecSingleInstructionOut(Map map) throws Exception{
		ExRecSingleInstructionOut exRecSingleInstructionOut = (ExRecSingleInstructionOut)map.get("exRecSingleInstructionOut");
		return exRecSingleInstructionOutMapper.addExRecSingleInstructionOut(exRecSingleInstructionOut);
	}
	@Override
	@Transactional
	public int batchAddExRecSingleInstructionOut(Map map) throws Exception{
		List<ExRecSingleInstructionOut> exRecSingleInstructionOutList =(List<ExRecSingleInstructionOut>)map.get("exRecSingleInstructionOutList");
		return exRecSingleInstructionOutMapper.batchAddExRecSingleInstructionOut(exRecSingleInstructionOutList);
	}
	@Override
	@Transactional
	public int deleteExRecSingleInstructionOut(Map map) throws Exception{
		BigInteger exRecSingleInstructionOutId = (BigInteger)map.get("exRecSingleInstructionOutId");
		return exRecSingleInstructionOutMapper.deleteExRecSingleInstructionOut(exRecSingleInstructionOutId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecSingleInstructionOut(Map map) throws Exception{
		List exRecSingleInstructionOutIdList = (List)map.get("exRecSingleInstructionOutIdList");
		return exRecSingleInstructionOutMapper.batchDeleteExRecSingleInstructionOut(exRecSingleInstructionOutIdList);
	}
	@Override
	@Transactional
	public int updateExRecSingleInstructionOut(Map map) throws Exception{
			ExRecSingleInstructionOut exRecSingleInstructionOut = (ExRecSingleInstructionOut)map.get("exRecSingleInstructionOut");
			return exRecSingleInstructionOutMapper.updateExRecSingleInstructionOut(exRecSingleInstructionOut);
	}
//	@Override
//	public ExRecSingleInstructionOut getExRecSingleInstructionOut(Map map) throws Exception{
//		BigInteger exRecSingleInstructionOutId = (BigInteger)map.get("exRecSingleInstructionOutId");
//		return exRecSingleInstructionOutMapper.getExRecSingleInstructionOut(exRecSingleInstructionOutId);
//	}
//	@Override
//	public ExRecSingleInstructionOut getExRecSingleInstructionOutDTO(Map map) throws Exception{
//		BigInteger exRecSingleInstructionOutId = (BigInteger)map.get("exRecSingleInstructionOutId");
//		return exRecSingleInstructionOutMapper.getExRecSingleInstructionOutDTO(exRecSingleInstructionOutId);
//	}
//	@Override
//	public List<ExRecSingleInstructionOut> getExRecSingleInstructionOutList(Map map) throws Exception{
//		ExRecSingleInstructionOut exRecSingleInstructionOut = (ExRecSingleInstructionOut)map.get("exRecSingleInstructionOut");
//		return exRecSingleInstructionOutMapper.getExRecSingleInstructionOutList(exRecSingleInstructionOut);
//	}
	@Override
	public Map getExRecSingleInstructionOutPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecSingleInstructionOutMapper.getExRecSingleInstructionOutPageList(page);
		return resultMap;
	}
}
