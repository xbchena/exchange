package com.iss.exchange.core.channel.service;

import com.iss.exchange.core.channel.entity.ExChannel;
import com.iss.exchange.core.channel.dto.ExChannelDTO;
import java.util.List;
import java.util.Map;
public interface ExChannelService {

	//增加
	public int addExChannel(Map map) throws Exception;

	//批量增加
	public int batchAddExChannel(Map map) throws Exception;

	//删除
	public int deleteExChannel(Map map) throws Exception;

	//批量删除
	public int batchDeleteExChannel(Map map) throws Exception;

	//修改
	public int updateExChannel(Map map) throws Exception;

//	//查询entity
//	public ExChannel getExChannel(Map map) throws Exception;
//
//	//查询dto
//	public ExChannelDTO getExChannelDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExChannelDTO> getExChannelList(Map map) throws Exception;

	//分页查询List
	public Map getExChannelPageList(Map map) throws Exception;

}
