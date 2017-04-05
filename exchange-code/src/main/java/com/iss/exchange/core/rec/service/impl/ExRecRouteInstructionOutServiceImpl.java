package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecRouteInstructionOut;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionOutDTO;
import com.iss.exchange.core.rec.dao.ExRecRouteInstructionOutMapper;
import com.iss.exchange.core.rec.service.ExRecRouteInstructionOutService;
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
@Service("exRecRouteInstructionOutService")
public class ExRecRouteInstructionOutServiceImpl implements ExRecRouteInstructionOutService {

	public static Logger logger = LoggerFactory.getLogger(ExRecRouteInstructionOutServiceImpl.class);
	@Autowired
	private ExRecRouteInstructionOutMapper exRecRouteInstructionOutMapper;
	@Override
	@Transactional
	public int addExRecRouteInstructionOut(Map map) throws Exception{
		ExRecRouteInstructionOut exRecRouteInstructionOut = (ExRecRouteInstructionOut)map.get("exRecRouteInstructionOut");
		return exRecRouteInstructionOutMapper.addExRecRouteInstructionOut(exRecRouteInstructionOut);
	}
	@Override
	@Transactional
	public int batchAddExRecRouteInstructionOut(Map map) throws Exception{
		List<ExRecRouteInstructionOut> exRecRouteInstructionOutList =(List<ExRecRouteInstructionOut>)map.get("exRecRouteInstructionOutList");
		return exRecRouteInstructionOutMapper.batchAddExRecRouteInstructionOut(exRecRouteInstructionOutList);
	}
	@Override
	@Transactional
	public int deleteExRecRouteInstructionOut(Map map) throws Exception{
		BigInteger exRecRouteInstrutctionOutId = (BigInteger)map.get("exRecRouteInstrutctionOutId");
		return exRecRouteInstructionOutMapper.deleteExRecRouteInstructionOut(exRecRouteInstrutctionOutId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecRouteInstructionOut(Map map) throws Exception{
		List exRecRouteInstructionOutIdList = (List)map.get("exRecRouteInstructionOutIdList");
		return exRecRouteInstructionOutMapper.batchDeleteExRecRouteInstructionOut(exRecRouteInstructionOutIdList);
	}
	@Override
	@Transactional
	public int updateExRecRouteInstructionOut(Map map) throws Exception{
			ExRecRouteInstructionOut exRecRouteInstructionOut = (ExRecRouteInstructionOut)map.get("exRecRouteInstructionOut");
			return exRecRouteInstructionOutMapper.updateExRecRouteInstructionOut(exRecRouteInstructionOut);
	}
//	@Override
//	public ExRecRouteInstructionOut getExRecRouteInstructionOut(Map map) throws Exception{
//		BigInteger exRecRouteInstrutctionOutId = (BigInteger)map.get("exRecRouteInstrutctionOutId");
//		return exRecRouteInstructionOutMapper.getExRecRouteInstructionOut(exRecRouteInstrutctionOutId);
//	}
//	@Override
//	public ExRecRouteInstructionOut getExRecRouteInstructionOutDTO(Map map) throws Exception{
//		BigInteger exRecRouteInstrutctionOutId = (BigInteger)map.get("exRecRouteInstrutctionOutId");
//		return exRecRouteInstructionOutMapper.getExRecRouteInstructionOutDTO(exRecRouteInstrutctionOutId);
//	}
//	@Override
//	public List<ExRecRouteInstructionOut> getExRecRouteInstructionOutList(Map map) throws Exception{
//		ExRecRouteInstructionOut exRecRouteInstructionOut = (ExRecRouteInstructionOut)map.get("exRecRouteInstructionOut");
//		return exRecRouteInstructionOutMapper.getExRecRouteInstructionOutList(exRecRouteInstructionOut);
//	}
	@Override
	public Map getExRecRouteInstructionOutPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecRouteInstructionOutMapper.getExRecRouteInstructionOutPageList(page);
		return resultMap;
	}
}
