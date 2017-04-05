package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionInt;

public interface ExRecBatchInstructionIntMapper extends Mapper<ExRecBatchInstructionInt>, MySqlMapper<ExRecBatchInstructionInt> {

	int addExRecBatchInstructionInt(ExRecBatchInstructionInt exRecBatchInstructionInt);

	int batchAddExRecBatchInstructionInt(List<ExRecBatchInstructionInt> exRecBatchInstructionIntList);

	int deleteExRecBatchInstructionInt(BigInteger exRecBatchInstructionInId);

	int batchDeleteExRecBatchInstructionInt(List<BigInteger> exRecBatchInstructionInIdList);

	int updateExRecBatchInstructionInt(ExRecBatchInstructionInt exRecBatchInstructionInt);

	ExRecBatchInstructionInt getExRecBatchInstructionInt(BigInteger exRecBatchInstructionInId);

	ExRecBatchInstructionIntDTO getExRecBatchInstructionIntDTO(BigInteger exRecBatchInstructionInId);

	List<ExRecBatchInstructionIntDTO> getExRecBatchInstructionIntList(ExRecBatchInstructionInt exRecBatchInstructionInt);

	List<ExRecBatchInstructionInt> getExRecBatchInstructionIntPageList(Page<?> page);

}
