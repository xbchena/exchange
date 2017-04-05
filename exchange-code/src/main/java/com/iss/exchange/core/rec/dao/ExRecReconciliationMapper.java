package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecReconciliationDTO;
import com.iss.exchange.core.rec.entity.ExRecReconciliation;

public interface ExRecReconciliationMapper extends Mapper<ExRecReconciliation>, MySqlMapper<ExRecReconciliation> {

	int addExRecReconciliation(ExRecReconciliation exRecReconciliation);

	int batchAddExRecReconciliation(List<ExRecReconciliation> exRecReconciliationList);

	int deleteExRecReconciliation(BigInteger exRecReconciliationId);

	int batchDeleteExRecReconciliation(List<BigInteger> exRecReconciliationIdList);

	int updateExRecReconciliation(ExRecReconciliation exRecReconciliation);

	ExRecReconciliation getExRecReconciliation(BigInteger exRecReconciliationId);

	ExRecReconciliationDTO getExRecReconciliationDTO(BigInteger exRecReconciliationId);

	List<ExRecReconciliationDTO> getExRecReconciliationList(ExRecReconciliation exRecReconciliation);

	List<ExRecReconciliation> getExRecReconciliationPageList(Page<?> page);

}
