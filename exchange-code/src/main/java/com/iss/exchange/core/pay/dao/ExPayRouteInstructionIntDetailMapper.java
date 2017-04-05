package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionIntDetailDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionIntDetail;

public interface ExPayRouteInstructionIntDetailMapper extends Mapper<ExPayRouteInstructionIntDetail>, MySqlMapper<ExPayRouteInstructionIntDetail> {

	int addExPayRouteInstructionIntDetail(ExPayRouteInstructionIntDetail exPayRouteInstructionIntDetail);

	int batchAddExPayRouteInstructionIntDetail(List<ExPayRouteInstructionIntDetail> exPayRouteInstructionIntDetailList);

	int deleteExPayRouteInstructionIntDetail(BigInteger exPayRouteInstructionIntDetailId);

	int batchDeleteExPayRouteInstructionIntDetail(List<BigInteger> exPayRouteInstructionIntDetailIdList);

	int updateExPayRouteInstructionIntDetail(ExPayRouteInstructionIntDetail exPayRouteInstructionIntDetail);

	ExPayRouteInstructionIntDetail getExPayRouteInstructionIntDetail(BigInteger exPayRouteInstructionIntDetailId);

	ExPayRouteInstructionIntDetailDTO getExPayRouteInstructionIntDetailDTO(BigInteger exPayRouteInstructionIntDetailId);

	List<ExPayRouteInstructionIntDetailDTO> getExPayRouteInstructionIntDetailList(ExPayRouteInstructionIntDetail exPayRouteInstructionIntDetail);

	List<ExPayRouteInstructionIntDetail> getExPayRouteInstructionIntDetailPageList(Page<?> page);

}
