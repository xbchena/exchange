package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDetailDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionIntDetail;

public interface ExPayBatchInstructionIntDetailMapper extends Mapper<ExPayBatchInstructionIntDetail>, MySqlMapper<ExPayBatchInstructionIntDetail> {

	int addExPayBatchInstructionIntDetail(ExPayBatchInstructionIntDetail exPayBatchInstructionIntDetail);

	int batchAddExPayBatchInstructionIntDetail(List<ExPayBatchInstructionIntDetail> exPayBatchInstructionIntDetailList);

	int deleteExPayBatchInstructionIntDetail(BigInteger exPayBatchInstructionIntDetailId);

	int batchDeleteExPayBatchInstructionIntDetail(List<BigInteger> exPayBatchInstructionIntDetailIdList);

	int updateExPayBatchInstructionIntDetail(ExPayBatchInstructionIntDetail exPayBatchInstructionIntDetail);

	ExPayBatchInstructionIntDetail getExPayBatchInstructionIntDetail(BigInteger exPayBatchInstructionIntDetailId);

	ExPayBatchInstructionIntDetailDTO getExPayBatchInstructionIntDetailDTO(BigInteger exPayBatchInstructionIntDetailId);

	List<ExPayBatchInstructionIntDetailDTO> getExPayBatchInstructionIntDetailList(ExPayBatchInstructionIntDetail exPayBatchInstructionIntDetail);

	List<ExPayBatchInstructionIntDetail> getExPayBatchInstructionIntDetailPageList(Page<?> page);

}
