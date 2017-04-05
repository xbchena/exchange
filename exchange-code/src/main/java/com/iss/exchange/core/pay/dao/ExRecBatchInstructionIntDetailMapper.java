package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDetailDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionIntDetail;

public interface ExRecBatchInstructionIntDetailMapper extends Mapper<ExRecBatchInstructionIntDetail>, MySqlMapper<ExRecBatchInstructionIntDetail> {

	int addExRecBatchInstructionIntDetail(ExRecBatchInstructionIntDetail exRecBatchInstructionIntDetail);

	int batchAddExRecBatchInstructionIntDetail(List<ExRecBatchInstructionIntDetail> exRecBatchInstructionIntDetailList);

	int deleteExRecBatchInstructionIntDetail(BigInteger exRecBatchInstructionIntDetailId);

	int batchDeleteExRecBatchInstructionIntDetail(List<BigInteger> exRecBatchInstructionIntDetailIdList);

	int updateExRecBatchInstructionIntDetail(ExRecBatchInstructionIntDetail exRecBatchInstructionIntDetail);

	ExRecBatchInstructionIntDetail getExRecBatchInstructionIntDetail(BigInteger exRecBatchInstructionIntDetailId);

	ExRecBatchInstructionIntDetailDTO getExRecBatchInstructionIntDetailDTO(BigInteger exRecBatchInstructionIntDetailId);

	List<ExRecBatchInstructionIntDetailDTO> getExRecBatchInstructionIntDetailList(ExRecBatchInstructionIntDetail exRecBatchInstructionIntDetail);

	List<ExRecBatchInstructionIntDetail> getExRecBatchInstructionIntDetailPageList(Page<?> page);

}
