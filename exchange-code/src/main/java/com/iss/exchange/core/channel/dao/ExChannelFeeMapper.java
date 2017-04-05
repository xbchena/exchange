package com.iss.exchange.core.channel.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.channel.dto.ExChannelFeeDTO;
import com.iss.exchange.core.channel.entity.ExChannelFee;

public interface ExChannelFeeMapper extends Mapper<ExChannelFee>, MySqlMapper<ExChannelFee> {

	int addExChannelFee(ExChannelFee exChannelFee);

	int batchAddExChannelFee(List<ExChannelFee> exChannelFeeList);

	int deleteExChannelFee(BigInteger exChannelAbilityId);

	int batchDeleteExChannelFee(List<BigInteger> exChannelAbilityIdList);

	int updateExChannelFee(ExChannelFee exChannelFee);

	ExChannelFee getExChannelFee(BigInteger exChannelAbilityId);

	ExChannelFeeDTO getExChannelFeeDTO(BigInteger exChannelAbilityId);

	List<ExChannelFeeDTO> getExChannelFeeList(ExChannelFee exChannelFee);

	List<ExChannelFee> getExChannelFeePageList(Page<?> page);

}
