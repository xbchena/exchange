package com.iss.exchange.core.common.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dto.ExBankTypeDTO;
import com.iss.exchange.core.common.entity.ExBankType;

public interface ExBankTypeMapper extends Mapper<ExBankType>, MySqlMapper<ExBankType> {

	int addExBankType(ExBankType exBankType);

	int batchAddExBankType(List<ExBankType> exBankTypeList);

	int deleteExBankType(BigInteger exBankTransactionHisInfoId);

	int batchDeleteExBankType(List<BigInteger> exBankTransactionHisInfoIdList);

	int updateExBankType(ExBankType exBankType);

	ExBankType getExBankType(BigInteger exBankTransactionHisInfoId);

	ExBankTypeDTO getExBankTypeDTO(BigInteger exBankTransactionHisInfoId);

	List<ExBankTypeDTO> getExBankTypeList(ExBankType exBankType);

	List<ExBankType> getExBankTypePageList(Page<?> page);

}
