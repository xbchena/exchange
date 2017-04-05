package com.iss.exchange.core.pay.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDetailDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOutDetail;

public interface ExPayRouteInstructionOutDetailMapper extends Mapper<ExPayRouteInstructionOutDetail>, MySqlMapper<ExPayRouteInstructionOutDetail> {

	int addExPayRouteInstructionOutDetail(ExPayRouteInstructionOutDetail exPayRouteInstructionOutDetail);

	int batchAddExPayRouteInstructionOutDetail(List<ExPayRouteInstructionOutDetail> exPayRouteInstructionOutDetailList);

	int deleteExPayRouteInstructionOutDetail(BigInteger exPayRouteInstrucrionOutDetailId);

	int batchDeleteExPayRouteInstructionOutDetail(List<BigInteger> exPayRouteInstrucrionOutDetailIdList);

	int updateExPayRouteInstructionOutDetail(ExPayRouteInstructionOutDetail exPayRouteInstructionOutDetail);

	ExPayRouteInstructionOutDetail getExPayRouteInstructionOutDetail(BigInteger exPayRouteInstrucrionOutDetailId);

	ExPayRouteInstructionOutDetailDTO getExPayRouteInstructionOutDetailDTO(BigInteger exPayRouteInstrucrionOutDetailId);

	List<ExPayRouteInstructionOutDetailDTO> getExPayRouteInstructionOutDetailList(ExPayRouteInstructionOutDetail exPayRouteInstructionOutDetail);

	List<ExPayRouteInstructionOutDetail> getExPayRouteInstructionOutDetailPageList(Page<?> page);

}
