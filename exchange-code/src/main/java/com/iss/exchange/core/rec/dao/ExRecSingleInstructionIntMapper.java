package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionIntDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionInt;

public interface ExRecSingleInstructionIntMapper extends Mapper<ExRecSingleInstructionInt>, MySqlMapper<ExRecSingleInstructionInt> {

	int addExRecSingleInstructionInt(ExRecSingleInstructionInt exRecSingleInstructionInt);

	int batchAddExRecSingleInstructionInt(List<ExRecSingleInstructionInt> exRecSingleInstructionIntList);

	int deleteExRecSingleInstructionInt(BigInteger exRecSingleInstructionInId);

	int batchDeleteExRecSingleInstructionInt(List<BigInteger> exRecSingleInstructionInIdList);

	int updateExRecSingleInstructionInt(ExRecSingleInstructionInt exRecSingleInstructionInt);

	ExRecSingleInstructionInt getExRecSingleInstructionInt(BigInteger exRecSingleInstructionInId);

	ExRecSingleInstructionIntDTO getExRecSingleInstructionIntDTO(BigInteger exRecSingleInstructionInId);

	List<ExRecSingleInstructionIntDTO> getExRecSingleInstructionIntList(ExRecSingleInstructionInt exRecSingleInstructionInt);

	List<ExRecSingleInstructionInt> getExRecSingleInstructionIntPageList(Page<?> page);

}
