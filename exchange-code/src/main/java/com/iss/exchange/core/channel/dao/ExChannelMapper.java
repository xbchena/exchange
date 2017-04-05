package com.iss.exchange.core.channel.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.channel.dto.ExChannelDTO;
import com.iss.exchange.core.channel.entity.ExChannel;

public interface ExChannelMapper extends Mapper<ExChannel>, MySqlMapper<ExChannel> {

	int addExChannel(ExChannel exChannel);

	int batchAddExChannel(List<ExChannel> exChannelList);

	int deleteExChannel(BigInteger exBankTransactionHisInfoId);

	int batchDeleteExChannel(List<BigInteger> exBankTransactionHisInfoIdList);

	int updateExChannel(ExChannel exChannel);

	ExChannel getExChannel(BigInteger exBankTransactionHisInfoId);

	ExChannelDTO getExChannelDTO(BigInteger exBankTransactionHisInfoId);

	List<ExChannelDTO> getExChannelList(ExChannel exChannel);

	List<ExChannel> getExChannelPageList(Page<?> page);

}
