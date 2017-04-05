package com.iss.exchange.core.common.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.common.dto.ExBankSerialRuleDTO;
import com.iss.exchange.core.common.entity.ExBankSerialRule;

public interface ExBankSerialRuleMapper extends Mapper<ExBankSerialRule>, MySqlMapper<ExBankSerialRule> {

	int addExBankSerialRule(ExBankSerialRule exBankSerialRule);

	int batchAddExBankSerialRule(List<ExBankSerialRule> exBankSerialRuleList);

	int deleteExBankSerialRule(BigInteger exBankSerialRuleId);

	int batchDeleteExBankSerialRule(List<BigInteger> exBankSerialRuleIdList);

	int updateExBankSerialRule(ExBankSerialRule exBankSerialRule);

	ExBankSerialRule getExBankSerialRule(BigInteger exBankSerialRuleId);

	ExBankSerialRuleDTO getExBankSerialRuleDTO(BigInteger exBankSerialRuleId);

	List<ExBankSerialRuleDTO> getExBankSerialRuleList(ExBankSerialRule exBankSerialRule);

	List<ExBankSerialRule> getExBankSerialRulePageList(Page<?> page);

}
