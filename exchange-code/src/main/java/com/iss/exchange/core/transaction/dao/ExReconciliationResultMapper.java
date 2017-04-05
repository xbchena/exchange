package com.iss.exchange.core.transaction.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.transaction.dto.ExReconciliationResultDTO;
import com.iss.exchange.core.transaction.entity.ExReconciliationResult;

public interface ExReconciliationResultMapper extends Mapper<ExReconciliationResult>, MySqlMapper<ExReconciliationResult> {

	int addExReconciliationResult(ExReconciliationResult exReconciliationResult);

	int batchAddExReconciliationResult(List<ExReconciliationResult> exReconciliationResultList);

	int deleteExReconciliationResult(BigInteger exReconciliationResultId);

	int batchDeleteExReconciliationResult(List<BigInteger> exReconciliationResultIdList);

	int updateExReconciliationResult(ExReconciliationResult exReconciliationResult);

	ExReconciliationResult getExReconciliationResult(BigInteger exReconciliationResultId);

	ExReconciliationResultDTO getExReconciliationResultDTO(BigInteger exReconciliationResultId);

	List<ExReconciliationResultDTO> getExReconciliationResultList(ExReconciliationResult exReconciliationResult);

	List<ExReconciliationResult> getExReconciliationResultPageList(Page<?> page);

}
