package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecSingleInstructionInt;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionIntDTO;
import com.iss.exchange.core.rec.dao.ExRecSingleInstructionIntMapper;
import com.iss.exchange.core.rec.service.ExRecSingleInstructionIntService;
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
@Service("exRecSingleInstructionIntService")
public class ExRecSingleInstructionIntServiceImpl implements ExRecSingleInstructionIntService {

	public static Logger logger = LoggerFactory.getLogger(ExRecSingleInstructionIntServiceImpl.class);
	@Autowired
	private ExRecSingleInstructionIntMapper exRecSingleInstructionIntMapper;
	@Override
	@Transactional
	public int addExRecSingleInstructionInt(Map map) throws Exception{
		ExRecSingleInstructionInt exRecSingleInstructionInt = (ExRecSingleInstructionInt)map.get("exRecSingleInstructionInt");
		return exRecSingleInstructionIntMapper.addExRecSingleInstructionInt(exRecSingleInstructionInt);
	}
	@Override
	@Transactional
	public int batchAddExRecSingleInstructionInt(Map map) throws Exception{
		List<ExRecSingleInstructionInt> exRecSingleInstructionIntList =(List<ExRecSingleInstructionInt>)map.get("exRecSingleInstructionIntList");
		return exRecSingleInstructionIntMapper.batchAddExRecSingleInstructionInt(exRecSingleInstructionIntList);
	}
	@Override
	@Transactional
	public int deleteExRecSingleInstructionInt(Map map) throws Exception{
		BigInteger exRecSingleInstructionInId = (BigInteger)map.get("exRecSingleInstructionInId");
		return exRecSingleInstructionIntMapper.deleteExRecSingleInstructionInt(exRecSingleInstructionInId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecSingleInstructionInt(Map map) throws Exception{
		List exRecSingleInstructionIntIdList = (List)map.get("exRecSingleInstructionIntIdList");
		return exRecSingleInstructionIntMapper.batchDeleteExRecSingleInstructionInt(exRecSingleInstructionIntIdList);
	}
	@Override
	@Transactional
	public int updateExRecSingleInstructionInt(Map map) throws Exception{
			ExRecSingleInstructionInt exRecSingleInstructionInt = (ExRecSingleInstructionInt)map.get("exRecSingleInstructionInt");
			return exRecSingleInstructionIntMapper.updateExRecSingleInstructionInt(exRecSingleInstructionInt);
	}
//	@Override
//	public ExRecSingleInstructionInt getExRecSingleInstructionInt(Map map) throws Exception{
//		BigInteger exRecSingleInstructionInId = (BigInteger)map.get("exRecSingleInstructionInId");
//		return exRecSingleInstructionIntMapper.getExRecSingleInstructionInt(exRecSingleInstructionInId);
//	}
//	@Override
//	public ExRecSingleInstructionInt getExRecSingleInstructionIntDTO(Map map) throws Exception{
//		BigInteger exRecSingleInstructionInId = (BigInteger)map.get("exRecSingleInstructionInId");
//		return exRecSingleInstructionIntMapper.getExRecSingleInstructionIntDTO(exRecSingleInstructionInId);
//	}
//	@Override
//	public List<ExRecSingleInstructionInt> getExRecSingleInstructionIntList(Map map) throws Exception{
//		ExRecSingleInstructionInt exRecSingleInstructionInt = (ExRecSingleInstructionInt)map.get("exRecSingleInstructionInt");
//		return exRecSingleInstructionIntMapper.getExRecSingleInstructionIntList(exRecSingleInstructionInt);
//	}
	@Override
	public Map getExRecSingleInstructionIntPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecSingleInstructionIntMapper.getExRecSingleInstructionIntPageList(page);
		return resultMap;
	}
}
