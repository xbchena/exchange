package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDetailDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOutDetail;

public interface ExRecBatchInstructionOutDetailMapper extends Mapper<ExRecBatchInstructionOutDetail>, MySqlMapper<ExRecBatchInstructionOutDetail> {

	int addExRecBatchInstructionOutDetail(ExRecBatchInstructionOutDetail exRecBatchInstructionOutDetail);

	int batchAddExRecBatchInstructionOutDetail(List<ExRecBatchInstructionOutDetail> exRecBatchInstructionOutDetailList);

	int deleteExRecBatchInstructionOutDetail(BigInteger exRecBatchInstrucrionOutDetailId);

	int batchDeleteExRecBatchInstructionOutDetail(List<BigInteger> exRecBatchInstrucrionOutDetailIdList);

	int updateExRecBatchInstructionOutDetail(ExRecBatchInstructionOutDetail exRecBatchInstructionOutDetail);

	ExRecBatchInstructionOutDetail getExRecBatchInstructionOutDetail(BigInteger exRecBatchInstrucrionOutDetailId);

	ExRecBatchInstructionOutDetailDTO getExRecBatchInstructionOutDetailDTO(BigInteger exRecBatchInstrucrionOutDetailId);

	List<ExRecBatchInstructionOutDetailDTO> getExRecBatchInstructionOutDetailList(ExRecBatchInstructionOutDetail exRecBatchInstructionOutDetail);

	List<ExRecBatchInstructionOutDetail> getExRecBatchInstructionOutDetailPageList(Page<?> page);

}
