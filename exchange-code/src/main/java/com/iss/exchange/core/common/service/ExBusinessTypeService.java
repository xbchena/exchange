package com.iss.exchange.core.common.service;

import com.iss.exchange.core.common.entity.ExBusinessType;
import com.iss.exchange.core.common.dto.ExBusinessTypeDTO;
import java.util.List;
import java.util.Map;
public interface ExBusinessTypeService {

	//增加
	public int addExBusinessType(Map map) throws Exception;

	//批量增加
	public int batchAddExBusinessType(Map map) throws Exception;

	//删除
	public int deleteExBusinessType(Map map) throws Exception;

	//批量删除
	public int batchDeleteExBusinessType(Map map) throws Exception;

	//修改
	public int updateExBusinessType(Map map) throws Exception;
//
//	//查询entity
//	public ExBusinessType getExBusinessType(Map map) throws Exception;
//
//	//查询dto
//	public ExBusinessTypeDTO getExBusinessTypeDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExBusinessTypeDTO> getExBusinessTypeList(Map map) throws Exception;

	//分页查询List
	public Map getExBusinessTypePageList(Map map) throws Exception;

}
