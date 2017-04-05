package com.iss.exchange.core.pay.service;

import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOutDetail;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDetailDTO;
import java.util.List;
import java.util.Map;
public interface ExRecBatchInstructionOutDetailService {

	//增加
	public int addExRecBatchInstructionOutDetail(Map map) throws Exception;

	//批量增加
	public int batchAddExRecBatchInstructionOutDetail(Map map) throws Exception;

	//删除
	public int deleteExRecBatchInstructionOutDetail(Map map) throws Exception;

	//批量删除
	public int batchDeleteExRecBatchInstructionOutDetail(Map map) throws Exception;

	//修改
	public int updateExRecBatchInstructionOutDetail(Map map) throws Exception;

//	//查询entity
//	public ExRecBatchInstructionOutDetail getExRecBatchInstructionOutDetail(Map map) throws Exception;
//
//	//查询dto
//	public ExRecBatchInstructionOutDetailDTO getExRecBatchInstructionOutDetailDTO(Map map) throws Exception;
//
//	//查询List
//	public List<ExRecBatchInstructionOutDetailDTO> getExRecBatchInstructionOutDetailList(Map map) throws Exception;

	//分页查询List
	public Map getExRecBatchInstructionOutDetailPageList(Map map) throws Exception;

}
