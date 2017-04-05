package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDetailDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionIntDetail;

public interface ExRecRouteInstructionIntDetailMapper extends Mapper<ExRecRouteInstructionIntDetail>, MySqlMapper<ExRecRouteInstructionIntDetail> {

	int addExRecRouteInstructionIntDetail(ExRecRouteInstructionIntDetail exRecRouteInstructionIntDetail);

	int batchAddExRecRouteInstructionIntDetail(List<ExRecRouteInstructionIntDetail> exRecRouteInstructionIntDetailList);

	int deleteExRecRouteInstructionIntDetail(BigInteger exRecRouteInstructionIntDetailId);

	int batchDeleteExRecRouteInstructionIntDetail(List<BigInteger> exRecRouteInstructionIntDetailIdList);

	int updateExRecRouteInstructionIntDetail(ExRecRouteInstructionIntDetail exRecRouteInstructionIntDetail);

	ExRecRouteInstructionIntDetail getExRecRouteInstructionIntDetail(BigInteger exRecRouteInstructionIntDetailId);

	ExRecRouteInstructionIntDetailDTO getExRecRouteInstructionIntDetailDTO(BigInteger exRecRouteInstructionIntDetailId);

	List<ExRecRouteInstructionIntDetailDTO> getExRecRouteInstructionIntDetailList(ExRecRouteInstructionIntDetail exRecRouteInstructionIntDetail);

	List<ExRecRouteInstructionIntDetail> getExRecRouteInstructionIntDetailPageList(Page<?> page);

}
