package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOut;

public interface ExPayRouteInstructionOutMapper extends Mapper<ExPayRouteInstructionOut>, MySqlMapper<ExPayRouteInstructionOut> {

	int addExPayRouteInstructionOut(ExPayRouteInstructionOut exPayRouteInstructionOut);

	int batchAddExPayRouteInstructionOut(List<ExPayRouteInstructionOut> exPayRouteInstructionOutList);

	int deleteExPayRouteInstructionOut(BigInteger exPayRouteInstrutctionOutId);

	int batchDeleteExPayRouteInstructionOut(List<BigInteger> exPayRouteInstrutctionOutIdList);

	int updateExPayRouteInstructionOut(ExPayRouteInstructionOut exPayRouteInstructionOut);

	ExPayRouteInstructionOut getExPayRouteInstructionOut(BigInteger exPayRouteInstrutctionOutId);

	ExPayRouteInstructionOutDTO getExPayRouteInstructionOutDTO(BigInteger exPayRouteInstrutctionOutId);

	List<ExPayRouteInstructionOutDTO> getExPayRouteInstructionOutList(ExPayRouteInstructionOut exPayRouteInstructionOut);

	List<ExPayRouteInstructionOut> getExPayRouteInstructionOutPageList(Page<?> page);

}
