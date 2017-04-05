package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionOut;

public interface ExPayBatchInstructionOutMapper extends Mapper<ExPayBatchInstructionOut>, MySqlMapper<ExPayBatchInstructionOut> {

	int addExPayBatchInstructionOut(ExPayBatchInstructionOut exPayBatchInstructionOut);

	int batchAddExPayBatchInstructionOut(List<ExPayBatchInstructionOut> exPayBatchInstructionOutList);

	int deleteExPayBatchInstructionOut(BigInteger exPayBatchInstrutctionOutId);

	int batchDeleteExPayBatchInstructionOut(List<BigInteger> exPayBatchInstrutctionOutIdList);

	int updateExPayBatchInstructionOut(ExPayBatchInstructionOut exPayBatchInstructionOut);

	ExPayBatchInstructionOut getExPayBatchInstructionOut(BigInteger exPayBatchInstrutctionOutId);

	ExPayBatchInstructionOutDTO getExPayBatchInstructionOutDTO(BigInteger exPayBatchInstrutctionOutId);

	List<ExPayBatchInstructionOutDTO> getExPayBatchInstructionOutList(ExPayBatchInstructionOut exPayBatchInstructionOut);

	List<ExPayBatchInstructionOut> getExPayBatchInstructionOutPageList(Page<?> page);

}
