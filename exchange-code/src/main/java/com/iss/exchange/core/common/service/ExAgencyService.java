package com.iss.exchange.core.common.service;

import com.iss.exchange.core.common.entity.ExAgency;
import com.iss.exchange.core.common.dto.ExAgencyDTO;
import java.util.List;
import java.util.Map;
public interface ExAgencyService {

	//增加
	public int addExAgency(Map map) throws Exception;

	//批量增加
	public int batchAddExAgency(Map map) throws Exception;

	//删除
	public int deleteExAgency(Map map) throws Exception;

	//批量删除
	public int batchDeleteExAgency(Map map) throws Exception;

	//修改
	public int updateExAgency(Map map) throws Exception;

//	//查询entity
//	public ExAgency getExAgency(Map map) throws Exception;
//
//	//查询dto
//	public ExAgencyDTO getExAgencyDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExAgencyDTO> getExAgencyList(Map map) throws Exception;

	//分页查询List
	public Map getExAgencyPageList(Map map) throws Exception;

}
