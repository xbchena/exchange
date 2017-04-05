package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionOutDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionOut;

public interface ExRecRouteInstructionOutMapper extends Mapper<ExRecRouteInstructionOut>, MySqlMapper<ExRecRouteInstructionOut> {

	int addExRecRouteInstructionOut(ExRecRouteInstructionOut exRecRouteInstructionOut);

	int batchAddExRecRouteInstructionOut(List<ExRecRouteInstructionOut> exRecRouteInstructionOutList);

	int deleteExRecRouteInstructionOut(BigInteger exRecRouteInstrutctionOutId);

	int batchDeleteExRecRouteInstructionOut(List<BigInteger> exRecRouteInstrutctionOutIdList);

	int updateExRecRouteInstructionOut(ExRecRouteInstructionOut exRecRouteInstructionOut);

	ExRecRouteInstructionOut getExRecRouteInstructionOut(BigInteger exRecRouteInstrutctionOutId);

	ExRecRouteInstructionOutDTO getExRecRouteInstructionOutDTO(BigInteger exRecRouteInstrutctionOutId);

	List<ExRecRouteInstructionOutDTO> getExRecRouteInstructionOutList(ExRecRouteInstructionOut exRecRouteInstructionOut);

	List<ExRecRouteInstructionOut> getExRecRouteInstructionOutPageList(Page<?> page);

}
