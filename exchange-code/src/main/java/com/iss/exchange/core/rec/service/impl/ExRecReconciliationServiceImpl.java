package com.iss.exchange.core.rec.service.impl;

import com.iss.exchange.core.rec.entity.ExRecReconciliation;
import com.iss.exchange.core.rec.dto.ExRecReconciliationDTO;
import com.iss.exchange.core.rec.dao.ExRecReconciliationMapper;
import com.iss.exchange.core.rec.service.ExRecReconciliationService;
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
@Service("exRecReconciliationService")
public class ExRecReconciliationServiceImpl implements ExRecReconciliationService {

	public static Logger logger = LoggerFactory.getLogger(ExRecReconciliationServiceImpl.class);
	@Autowired
	private ExRecReconciliationMapper exRecReconciliationMapper;
	@Override
	@Transactional
	public int addExRecReconciliation(Map map) throws Exception{
		ExRecReconciliation exRecReconciliation = (ExRecReconciliation)map.get("exRecReconciliation");
		return exRecReconciliationMapper.addExRecReconciliation(exRecReconciliation);
	}
	@Override
	@Transactional
	public int batchAddExRecReconciliation(Map map) throws Exception{
		List<ExRecReconciliation> exRecReconciliationList =(List<ExRecReconciliation>)map.get("exRecReconciliationList");
		return exRecReconciliationMapper.batchAddExRecReconciliation(exRecReconciliationList);
	}
	@Override
	@Transactional
	public int deleteExRecReconciliation(Map map) throws Exception{
		BigInteger exRecReconciliationId = (BigInteger)map.get("exRecReconciliationId");
		return exRecReconciliationMapper.deleteExRecReconciliation(exRecReconciliationId);
	}
	@Override
	@Transactional
	public int batchDeleteExRecReconciliation(Map map) throws Exception{
		List exRecReconciliationIdList = (List)map.get("exRecReconciliationIdList");
		return exRecReconciliationMapper.batchDeleteExRecReconciliation(exRecReconciliationIdList);
	}
	@Override
	@Transactional
	public int updateExRecReconciliation(Map map) throws Exception{
			ExRecReconciliation exRecReconciliation = (ExRecReconciliation)map.get("exRecReconciliation");
			return exRecReconciliationMapper.updateExRecReconciliation(exRecReconciliation);
	}
//	@Override
//	public ExRecReconciliation getExRecReconciliation(Map map) throws Exception{
//		BigInteger exRecReconciliationId = (BigInteger)map.get("exRecReconciliationId");
//		return exRecReconciliationMapper.getExRecReconciliation(exRecReconciliationId);
//	}
//	@Override
//	public ExRecReconciliation getExRecReconciliationDTO(Map map) throws Exception{
//		BigInteger exRecReconciliationId = (BigInteger)map.get("exRecReconciliationId");
//		return exRecReconciliationMapper.getExRecReconciliationDTO(exRecReconciliationId);
//	}
//	@Override
//	public List<ExRecReconciliation> getExRecReconciliationList(Map map) throws Exception{
//		ExRecReconciliation exRecReconciliation = (ExRecReconciliation)map.get("exRecReconciliation");
//		return exRecReconciliationMapper.getExRecReconciliationList(exRecReconciliation);
//	}
	@Override
	public Map getExRecReconciliationPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exRecReconciliationMapper.getExRecReconciliationPageList(page);
		return resultMap;
	}
}
