package com.iss.exchange.core.route.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.route.dto.ExRouteStaticInfoDTO;
import com.iss.exchange.core.route.entity.ExRouteStaticInfo;

public interface ExRouteStaticInfoMapper extends Mapper<ExRouteStaticInfo>, MySqlMapper<ExRouteStaticInfo> {

	int addExRouteStaticInfo(ExRouteStaticInfo exRouteStaticInfo);

	int batchAddExRouteStaticInfo(List<ExRouteStaticInfo> exRouteStaticInfoList);

	int deleteExRouteStaticInfo(BigInteger exRouteStaticInfoId);

	int batchDeleteExRouteStaticInfo(List<BigInteger> exRouteStaticInfoIdList);

	int updateExRouteStaticInfo(ExRouteStaticInfo exRouteStaticInfo);

	ExRouteStaticInfo getExRouteStaticInfo(BigInteger exRouteStaticInfoId);

	ExRouteStaticInfoDTO getExRouteStaticInfoDTO(BigInteger exRouteStaticInfoId);

	List<ExRouteStaticInfoDTO> getExRouteStaticInfoList(ExRouteStaticInfo exRouteStaticInfo);

	List<ExRouteStaticInfo> getExRouteStaticInfoPageList(Page<?> page);

}
