package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionInt;

public interface ExPayBatchInstructionIntMapper extends Mapper<ExPayBatchInstructionInt>, MySqlMapper<ExPayBatchInstructionInt> {

	int addExPayBatchInstructionInt(ExPayBatchInstructionInt exPayBatchInstructionInt);

	int batchAddExPayBatchInstructionInt(List<ExPayBatchInstructionInt> exPayBatchInstructionIntList);

	int deleteExPayBatchInstructionInt(BigInteger exPayBatchInstructionInId);

	int batchDeleteExPayBatchInstructionInt(List<BigInteger> exPayBatchInstructionInIdList);

	int updateExPayBatchInstructionInt(ExPayBatchInstructionInt exPayBatchInstructionInt);

	ExPayBatchInstructionInt getExPayBatchInstructionInt(BigInteger exPayBatchInstructionInId);

	ExPayBatchInstructionIntDTO getExPayBatchInstructionIntDTO(BigInteger exPayBatchInstructionInId);

	List<ExPayBatchInstructionIntDTO> getExPayBatchInstructionIntList(ExPayBatchInstructionInt exPayBatchInstructionInt);

	List<ExPayBatchInstructionInt> getExPayBatchInstructionIntPageList(Page<?> page);

}
