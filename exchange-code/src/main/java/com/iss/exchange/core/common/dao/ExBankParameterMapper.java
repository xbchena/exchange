package com.iss.exchange.core.common.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dto.ExBankParameterDTO;
import com.iss.exchange.core.common.entity.ExBankParameter;

public interface ExBankParameterMapper extends Mapper<ExBankParameter>, MySqlMapper<ExBankParameter> {

	int addExBankParameter(ExBankParameter exBankParameter);

	int batchAddExBankParameter(List<ExBankParameter> exBankParameterList);

	int deleteExBankParameter(BigInteger exBankParameterId);

	int batchDeleteExBankParameter(List<BigInteger> exBankParameterIdList);

	int updateExBankParameter(ExBankParameter exBankParameter);

	ExBankParameter getExBankParameter(BigInteger exBankParameterId);

	ExBankParameterDTO getExBankParameterDTO(BigInteger exBankParameterId);

	List<ExBankParameterDTO> getExBankParameterList(ExBankParameter exBankParameter);

	List<ExBankParameter> getExBankParameterPageList(Page<?> page);

}
