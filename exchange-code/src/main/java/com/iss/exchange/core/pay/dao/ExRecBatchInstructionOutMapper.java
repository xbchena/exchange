package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOut;

public interface ExRecBatchInstructionOutMapper extends Mapper<ExRecBatchInstructionOut>, MySqlMapper<ExRecBatchInstructionOut> {

	int addExRecBatchInstructionOut(ExRecBatchInstructionOut exRecBatchInstructionOut);

	int batchAddExRecBatchInstructionOut(List<ExRecBatchInstructionOut> exRecBatchInstructionOutList);

	int deleteExRecBatchInstructionOut(BigInteger exRecBatchInstrutctionOutId);

	int batchDeleteExRecBatchInstructionOut(List<BigInteger> exRecBatchInstrutctionOutIdList);

	int updateExRecBatchInstructionOut(ExRecBatchInstructionOut exRecBatchInstructionOut);

	ExRecBatchInstructionOut getExRecBatchInstructionOut(BigInteger exRecBatchInstrutctionOutId);

	ExRecBatchInstructionOutDTO getExRecBatchInstructionOutDTO(BigInteger exRecBatchInstrutctionOutId);

	List<ExRecBatchInstructionOutDTO> getExRecBatchInstructionOutList(ExRecBatchInstructionOut exRecBatchInstructionOut);

	List<ExRecBatchInstructionOut> getExRecBatchInstructionOutPageList(Page<?> page);

}
