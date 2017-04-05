package com.iss.exchange.core.channel.service;

import com.iss.exchange.core.channel.entity.ExChannelFee;
import com.iss.exchange.core.channel.dto.ExChannelFeeDTO;
import java.util.List;
import java.util.Map;
public interface ExChannelFeeService {

	//增加
	public int addExChannelFee(Map map) throws Exception;

	//批量增加
	public int batchAddExChannelFee(Map map) throws Exception;

	//删除
	public int deleteExChannelFee(Map map) throws Exception;

	//批量删除
	public int batchDeleteExChannelFee(Map map) throws Exception;

	//修改
	public int updateExChannelFee(Map map) throws Exception;

//	//查询entity
//	public ExChannelFee getExChannelFee(Map map) throws Exception;
//
//	//查询dto
//	public ExChannelFeeDTO getExChannelFeeDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExChannelFeeDTO> getExChannelFeeList(Map map) throws Exception;

	//分页查询List
	public Map getExChannelFeePageList(Map map) throws Exception;

}
