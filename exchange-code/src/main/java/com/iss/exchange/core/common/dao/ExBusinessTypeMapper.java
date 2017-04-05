package com.iss.exchange.core.common.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dto.ExBusinessTypeDTO;
import com.iss.exchange.core.common.entity.ExBusinessType;

public interface ExBusinessTypeMapper extends Mapper<ExBusinessType>, MySqlMapper<ExBusinessType> {

	int addExBusinessType(ExBusinessType exBusinessType);

	int batchAddExBusinessType(List<ExBusinessType> exBusinessTypeList);

	int deleteExBusinessType(BigInteger exBankTransactionHisInfoId);

	int batchDeleteExBusinessType(List<BigInteger> exBankTransactionHisInfoIdList);

	int updateExBusinessType(ExBusinessType exBusinessType);

	ExBusinessType getExBusinessType(BigInteger exBankTransactionHisInfoId);

	ExBusinessTypeDTO getExBusinessTypeDTO(BigInteger exBankTransactionHisInfoId);

	List<ExBusinessTypeDTO> getExBusinessTypeList(ExBusinessType exBusinessType);

	List<ExBusinessType> getExBusinessTypePageList(Page<?> page);

}
