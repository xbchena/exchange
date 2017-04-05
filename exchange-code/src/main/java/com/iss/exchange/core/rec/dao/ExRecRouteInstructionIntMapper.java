package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionInt;

public interface ExRecRouteInstructionIntMapper extends Mapper<ExRecRouteInstructionInt>, MySqlMapper<ExRecRouteInstructionInt> {

	int addExRecRouteInstructionInt(ExRecRouteInstructionInt exRecRouteInstructionInt);

	int batchAddExRecRouteInstructionInt(List<ExRecRouteInstructionInt> exRecRouteInstructionIntList);

	int deleteExRecRouteInstructionInt(BigInteger exRecRouteInstructionInId);

	int batchDeleteExRecRouteInstructionInt(List<BigInteger> exRecRouteInstructionInIdList);

	int updateExRecRouteInstructionInt(ExRecRouteInstructionInt exRecRouteInstructionInt);

	ExRecRouteInstructionInt getExRecRouteInstructionInt(BigInteger exRecRouteInstructionInId);

	ExRecRouteInstructionIntDTO getExRecRouteInstructionIntDTO(BigInteger exRecRouteInstructionInId);

	List<ExRecRouteInstructionIntDTO> getExRecRouteInstructionIntList(ExRecRouteInstructionInt exRecRouteInstructionInt);

	List<ExRecRouteInstructionInt> getExRecRouteInstructionIntPageList(Page<?> page);

}
