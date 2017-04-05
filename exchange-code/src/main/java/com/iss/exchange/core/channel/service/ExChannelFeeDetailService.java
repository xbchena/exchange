package com.iss.exchange.core.channel.service;

import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
import com.iss.exchange.core.channel.dto.ExChannelFeeDetailDTO;
import java.util.List;
import java.util.Map;
public interface ExChannelFeeDetailService {

	//增加
	public int addExChannelFeeDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExChannelFeeDetail(Map map) throws Exception;

	//删除
	public int deleteExChannelFeeDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExChannelFeeDetail(Map map) throws Exception;

	//修改
	public int updateExChannelFeeDetail(Map map) throws Exception;

//	//查询entity
//	public ExChannelFeeDetail getExChannelFeeDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExChannelFeeDetailDTO getExChannelFeeDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExChannelFeeDetailDTO> getExChannelFeeDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExChannelFeeDetailPageList(Map map) throws Exception;

}
