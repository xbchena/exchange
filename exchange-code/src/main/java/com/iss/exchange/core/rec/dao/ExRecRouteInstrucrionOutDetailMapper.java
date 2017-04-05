package com.iss.exchange.core.rec.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.rec.dto.ExRecRouteInstrucrionOutDetailDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstrucrionOutDetail;

public interface ExRecRouteInstrucrionOutDetailMapper extends Mapper<ExRecRouteInstrucrionOutDetail>, MySqlMapper<ExRecRouteInstrucrionOutDetail> {

	int addExRecRouteInstrucrionOutDetail(ExRecRouteInstrucrionOutDetail exRecRouteInstrucrionOutDetail);

	int batchAddExRecRouteInstrucrionOutDetail(List<ExRecRouteInstrucrionOutDetail> exRecRouteInstrucrionOutDetailList);

	int deleteExRecRouteInstrucrionOutDetail(BigInteger exRecRouteInstrucrionOutDetailId);

	int batchDeleteExRecRouteInstrucrionOutDetail(List<BigInteger> exRecRouteInstrucrionOutDetailIdList);

	int updateExRecRouteInstrucrionOutDetail(ExRecRouteInstrucrionOutDetail exRecRouteInstrucrionOutDetail);

	ExRecRouteInstrucrionOutDetail getExRecRouteInstrucrionOutDetail(BigInteger exRecRouteInstrucrionOutDetailId);

	ExRecRouteInstrucrionOutDetailDTO getExRecRouteInstrucrionOutDetailDTO(BigInteger exRecRouteInstrucrionOutDetailId);

	List<ExRecRouteInstrucrionOutDetailDTO> getExRecRouteInstrucrionOutDetailList(ExRecRouteInstrucrionOutDetail exRecRouteInstrucrionOutDetail);

	List<ExRecRouteInstrucrionOutDetail> getExRecRouteInstrucrionOutDetailPageList(Page<?> page);

}
