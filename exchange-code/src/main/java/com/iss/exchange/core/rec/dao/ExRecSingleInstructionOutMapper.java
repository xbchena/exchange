package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionOutDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionOut;

public interface ExRecSingleInstructionOutMapper extends Mapper<ExRecSingleInstructionOut>, MySqlMapper<ExRecSingleInstructionOut> {

	int addExRecSingleInstructionOut(ExRecSingleInstructionOut exRecSingleInstructionOut);

	int batchAddExRecSingleInstructionOut(List<ExRecSingleInstructionOut> exRecSingleInstructionOutList);

	int deleteExRecSingleInstructionOut(BigInteger exRecSingleInstructionOutId);

	int batchDeleteExRecSingleInstructionOut(List<BigInteger> exRecSingleInstructionOutIdList);

	int updateExRecSingleInstructionOut(ExRecSingleInstructionOut exRecSingleInstructionOut);

	ExRecSingleInstructionOut getExRecSingleInstructionOut(BigInteger exRecSingleInstructionOutId);

	ExRecSingleInstructionOutDTO getExRecSingleInstructionOutDTO(BigInteger exRecSingleInstructionOutId);

	List<ExRecSingleInstructionOutDTO> getExRecSingleInstructionOutList(ExRecSingleInstructionOut exRecSingleInstructionOut);

	List<ExRecSingleInstructionOut> getExRecSingleInstructionOutPageList(Page<?> page);

}
