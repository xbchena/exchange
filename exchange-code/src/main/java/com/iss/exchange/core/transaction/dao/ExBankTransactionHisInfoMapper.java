package com.iss.exchange.core.transaction.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.transaction.dto.ExBankTransactionHisInfoDTO;
import com.iss.exchange.core.transaction.entity.ExBankTransactionHisInfo;

public interface ExBankTransactionHisInfoMapper extends Mapper<ExBankTransactionHisInfo>, MySqlMapper<ExBankTransactionHisInfo> {

	int addExBankTransactionHisInfo(ExBankTransactionHisInfo exBankTransactionHisInfo);

	int batchAddExBankTransactionHisInfo(List<ExBankTransactionHisInfo> exBankTransactionHisInfoList);

	int deleteExBankTransactionHisInfo(BigInteger exBankTransactionHisInfoId);

	int batchDeleteExBankTransactionHisInfo(List<BigInteger> exBankTransactionHisInfoIdList);

	int updateExBankTransactionHisInfo(ExBankTransactionHisInfo exBankTransactionHisInfo);

	ExBankTransactionHisInfo getExBankTransactionHisInfo(BigInteger exBankTransactionHisInfoId);

	ExBankTransactionHisInfoDTO getExBankTransactionHisInfoDTO(BigInteger exBankTransactionHisInfoId);

	List<ExBankTransactionHisInfoDTO> getExBankTransactionHisInfoList(ExBankTransactionHisInfo exBankTransactionHisInfo);

	List<ExBankTransactionHisInfo> getExBankTransactionHisInfoPageList(Page<?> page);

}
