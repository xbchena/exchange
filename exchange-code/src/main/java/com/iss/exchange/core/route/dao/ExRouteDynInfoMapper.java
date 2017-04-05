package com.iss.exchange.core.route.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.route.dto.ExRouteDynInfoDTO;
import com.iss.exchange.core.route.entity.ExRouteDynInfo;

public interface ExRouteDynInfoMapper extends Mapper<ExRouteDynInfo>, MySqlMapper<ExRouteDynInfo> {

	int addExRouteDynInfo(ExRouteDynInfo exRouteDynInfo);

	int batchAddExRouteDynInfo(List<ExRouteDynInfo> exRouteDynInfoList);

	int deleteExRouteDynInfo(BigInteger exRouteInfoId);

	int batchDeleteExRouteDynInfo(List<BigInteger> exRouteInfoIdList);

	int updateExRouteDynInfo(ExRouteDynInfo exRouteDynInfo);

	ExRouteDynInfo getExRouteDynInfo(BigInteger exRouteInfoId);

	ExRouteDynInfoDTO getExRouteDynInfoDTO(BigInteger exRouteInfoId);

	List<ExRouteDynInfoDTO> getExRouteDynInfoList(ExRouteDynInfo exRouteDynInfo);

	List<ExRouteDynInfo> getExRouteDynInfoPageList(Page<?> page);

}
