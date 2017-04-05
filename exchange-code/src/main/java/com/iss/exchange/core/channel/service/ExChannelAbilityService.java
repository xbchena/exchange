package com.iss.exchange.core.channel.service;

import com.iss.exchange.core.channel.entity.ExChannelAbility;
import com.iss.exchange.core.channel.dto.ExChannelAbilityDTO;
import java.util.List;
import java.util.Map;
public interface ExChannelAbilityService {

	//增加
	public int addExChannelAbility(Map map) throws Exception;

	//批量增加
	public int batchAddExChannelAbility(Map map) throws Exception;

	//删除
	public int deleteExChannelAbility(Map map) throws Exception;

	//批量删除
	public int batchDeleteExChannelAbility(Map map) throws Exception;

	//修改
	public int updateExChannelAbility(Map map) throws Exception;

//	//查询entity
//	public ExChannelAbility getExChannelAbility(Map map) throws Exception;
//
//	//查询dto
//	public ExChannelAbilityDTO getExChannelAbilityDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExChannelAbilityDTO> getExChannelAbilityList(Map map) throws Exception;

	//分页查询List
	public Map getExChannelAbilityPageList(Map map) throws Exception;

}
