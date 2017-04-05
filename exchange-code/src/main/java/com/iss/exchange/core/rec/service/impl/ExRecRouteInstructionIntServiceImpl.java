package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecRouteInstructionInt;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDTO;
import com.iss.exchange.core.rec.dao.ExRecRouteInstructionIntMapper;
import com.iss.exchange.core.rec.service.ExRecRouteInstructionIntService;
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
@Service("exRecRouteInstructionIntService")
public class ExRecRouteInstructionIntServiceImpl implements ExRecRouteInstructionIntService {

	public static Logger logger = LoggerFactory.getLogger(ExRecRouteInstructionIntServiceImpl.class);
	@Autowired
	private ExRecRouteInstructionIntMapper exRecRouteInstructionIntMapper;
	@Override
	@Transactional
	public int addExRecRouteInstructionInt(Map map) throws Exception{
		ExRecRouteInstructionInt exRecRouteInstructionInt = (ExRecRouteInstructionInt)map.get("exRecRouteInstructionInt");
		return exRecRouteInstructionIntMapper.addExRecRouteInstructionInt(exRecRouteInstructionInt);
	}
	@Override
	@Transactional
	public int batchAddExRecRouteInstructionInt(Map map) throws Exception{
		List<ExRecRouteInstructionInt> exRecRouteInstructionIntList =(List<ExRecRouteInstructionInt>)map.get("exRecRouteInstructionIntList");
		return exRecRouteInstructionIntMapper.batchAddExRecRouteInstructionInt(exRecRouteInstructionIntList);
	}
	@Override
	@Transactional
	public int deleteExRecRouteInstructionInt(Map map) throws Exception{
		BigInteger exRecRouteInstructionInId = (BigInteger)map.get("exRecRouteInstructionInId");
		return exRecRouteInstructionIntMapper.deleteExRecRouteInstructionInt(exRecRouteInstructionInId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecRouteInstructionInt(Map map) throws Exception{
		List exRecRouteInstructionIntIdList = (List)map.get("exRecRouteInstructionIntIdList");
		return exRecRouteInstructionIntMapper.batchDeleteExRecRouteInstructionInt(exRecRouteInstructionIntIdList);
	}
	@Override
	@Transactional
	public int updateExRecRouteInstructionInt(Map map) throws Exception{
			ExRecRouteInstructionInt exRecRouteInstructionInt = (ExRecRouteInstructionInt)map.get("exRecRouteInstructionInt");
			return exRecRouteInstructionIntMapper.updateExRecRouteInstructionInt(exRecRouteInstructionInt);
	}
//	@Override
//	public ExRecRouteInstructionInt getExRecRouteInstructionInt(Map map) throws Exception{
//		BigInteger exRecRouteInstructionInId = (BigInteger)map.get("exRecRouteInstructionInId");
//		return exRecRouteInstructionIntMapper.getExRecRouteInstructionInt(exRecRouteInstructionInId);
//	}
//	@Override
//	public ExRecRouteInstructionInt getExRecRouteInstructionIntDTO(Map map) throws Exception{
//		BigInteger exRecRouteInstructionInId = (BigInteger)map.get("exRecRouteInstructionInId");
//		return exRecRouteInstructionIntMapper.getExRecRouteInstructionIntDTO(exRecRouteInstructionInId);
//	}
//	@Override
//	public List<ExRecRouteInstructionInt> getExRecRouteInstructionIntList(Map map) throws Exception{
//		ExRecRouteInstructionInt exRecRouteInstructionInt = (ExRecRouteInstructionInt)map.get("exRecRouteInstructionInt");
//		return exRecRouteInstructionIntMapper.getExRecRouteInstructionIntList(exRecRouteInstructionInt);
//	}
	@Override
	public Map getExRecRouteInstructionIntPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecRouteInstructionIntMapper.getExRecRouteInstructionIntPageList(page);
		return resultMap;
	}
}
