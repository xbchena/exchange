package com.iss.exchange.core.common.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dto.ExAgencyDTO;
import com.iss.exchange.core.common.entity.ExAgency;

public interface ExAgencyMapper extends Mapper<ExAgency>, MySqlMapper<ExAgency> {

	int addExAgency(ExAgency exAgency);

	int batchAddExAgency(List<ExAgency> exAgencyList);

	int deleteExAgency(BigInteger exAccountId);

	int batchDeleteExAgency(List<BigInteger> exAccountIdList);

	int updateExAgency(ExAgency exAgency);

	ExAgency getExAgency(BigInteger exAccountId);

	ExAgencyDTO getExAgencyDTO(BigInteger exAccountId);

	List<ExAgencyDTO> getExAgencyList(ExAgency exAgency);

	List<ExAgency> getExAgencyPageList(Page<?> page);

}
