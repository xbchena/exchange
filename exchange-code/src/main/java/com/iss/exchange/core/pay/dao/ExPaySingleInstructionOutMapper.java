package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionOut;

public interface ExPaySingleInstructionOutMapper extends Mapper<ExPaySingleInstructionOut>, MySqlMapper<ExPaySingleInstructionOut> {

	int addExPaySingleInstructionOut(ExPaySingleInstructionOut exPaySingleInstructionOut);

	int batchAddExPaySingleInstructionOut(List<ExPaySingleInstructionOut> exPaySingleInstructionOutList);

	int deleteExPaySingleInstructionOut(BigInteger exPaySingleInstructionOutId);

	int batchDeleteExPaySingleInstructionOut(List<BigInteger> exPaySingleInstructionOutIdList);

	int updateExPaySingleInstructionOut(ExPaySingleInstructionOut exPaySingleInstructionOut);

	ExPaySingleInstructionOut getExPaySingleInstructionOut(BigInteger exPaySingleInstructionOutId);

	ExPaySingleInstructionOutDTO getExPaySingleInstructionOutDTO(BigInteger exPaySingleInstructionOutId);

	List<ExPaySingleInstructionOutDTO> getExPaySingleInstructionOutList(ExPaySingleInstructionOut exPaySingleInstructionOut);

	List<ExPaySingleInstructionOut> getExPaySingleInstructionOutPageList(Page<?> page);

}
