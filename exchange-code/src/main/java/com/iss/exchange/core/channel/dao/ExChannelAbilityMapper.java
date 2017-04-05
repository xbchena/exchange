package com.iss.exchange.core.channel.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.channel.dto.ExChannelAbilityDTO;
import com.iss.exchange.core.channel.entity.ExChannelAbility;

public interface ExChannelAbilityMapper extends Mapper<ExChannelAbility>, MySqlMapper<ExChannelAbility> {

	int addExChannelAbility(ExChannelAbility exChannelAbility);

	int batchAddExChannelAbility(List<ExChannelAbility> exChannelAbilityList);

	int deleteExChannelAbility(BigInteger exChannelAbilityId);

	int batchDeleteExChannelAbility(List<BigInteger> exChannelAbilityIdList);

	int updateExChannelAbility(ExChannelAbility exChannelAbility);

	ExChannelAbility getExChannelAbility(BigInteger exChannelAbilityId);

	ExChannelAbilityDTO getExChannelAbilityDTO(BigInteger exChannelAbilityId);

	List<ExChannelAbilityDTO> getExChannelAbilityList(ExChannelAbility exChannelAbility);

	List<ExChannelAbility> getExChannelAbilityPageList(Page<?> page);

}
