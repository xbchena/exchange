package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionIntDTO;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionInt;

public interface ExPaySingleInstructionIntMapper extends Mapper<ExPaySingleInstructionInt>, MySqlMapper<ExPaySingleInstructionInt> {

	int addExPaySingleInstructionInt(ExPaySingleInstructionInt exPaySingleInstructionInt);

	int batchAddExPaySingleInstructionInt(List<ExPaySingleInstructionInt> exPaySingleInstructionIntList);

	int deleteExPaySingleInstructionInt(BigInteger exPaySingleInstructionInId);

	int batchDeleteExPaySingleInstructionInt(List<BigInteger> exPaySingleInstructionInIdList);

	int updateExPaySingleInstructionInt(ExPaySingleInstructionInt exPaySingleInstructionInt);

	ExPaySingleInstructionInt getExPaySingleInstructionInt(BigInteger exPaySingleInstructionInId);

	ExPaySingleInstructionIntDTO getExPaySingleInstructionIntDTO(BigInteger exPaySingleInstructionInId);

	List<ExPaySingleInstructionIntDTO> getExPaySingleInstructionIntList(ExPaySingleInstructionInt exPaySingleInstructionInt);

	List<ExPaySingleInstructionInt> getExPaySingleInstructionIntPageList(Page<?> page);

}
