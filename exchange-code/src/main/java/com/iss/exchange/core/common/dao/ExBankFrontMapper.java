package com.iss.exchange.core.common.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dto.ExBankFrontDTO;
import com.iss.exchange.core.common.entity.ExBankFront;

public interface ExBankFrontMapper extends Mapper<ExBankFront>, MySqlMapper<ExBankFront> {

	int addExBankFront(ExBankFront exBankFront);

	int batchAddExBankFront(List<ExBankFront> exBankFrontList);

	int deleteExBankFront(BigInteger exBankFrontId);

	int batchDeleteExBankFront(List<BigInteger> exBankFrontIdList);

	int updateExBankFront(ExBankFront exBankFront);

	ExBankFront getExBankFront(BigInteger exBankFrontId);

	ExBankFrontDTO getExBankFrontDTO(BigInteger exBankFrontId);

	List<ExBankFrontDTO> getExBankFrontList(ExBankFront exBankFront);

	List<ExBankFront> getExBankFrontPageList(Page<?> page);

}
