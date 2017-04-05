package com.iss.exchange.core.account.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.account.dto.ExAccountDTO;
import com.iss.exchange.core.account.entity.ExAccount;

public interface ExAccountMapper extends Mapper<ExAccount>, MySqlMapper<ExAccount> {

	int addExAccount(ExAccount exAccount);

	int batchAddExAccount(List<ExAccount> exAccountList);

	int deleteExAccount(BigInteger exAccountId);

	int batchDeleteExAccount(List<BigInteger> exAccountIdList);

	int updateExAccount(ExAccount exAccount);

	ExAccount getExAccount(BigInteger exAccountId);

	ExAccountDTO getExAccountDTO(BigInteger exAccountId);

	List<ExAccountDTO> getExAccountList(ExAccount exAccount);

	List<ExAccount> getExAccountPageList(Page<?> page);

}
