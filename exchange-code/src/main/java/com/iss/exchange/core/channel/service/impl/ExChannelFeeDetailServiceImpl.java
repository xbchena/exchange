package com.iss.exchange.core.channel.service.impl;

import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
import com.iss.exchange.core.channel.dto.ExChannelFeeDetailDTO;
import com.iss.exchange.core.channel.dao.ExChannelFeeDetailMapper;
import com.iss.exchange.core.channel.service.ExChannelFeeDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import java.util.List;
import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;
@Service("exChannelFeeDetailService")
public class ExChannelFeeDetailServiceImpl implements ExChannelFeeDetailService {

	public static Logger logger = LoggerFactory.getLogger(ExChannelFeeDetailServiceImpl.class);
	@Autowired
	private ExChannelFeeDetailMapper exChannelFeeDetailMapper;
	@Override
	@Transactional
	public int addExChannelFeeDetail(Map map) throws Exception{
		ExChannelFeeDetail exChannelFeeDetail = (ExChannelFeeDetail)map.get("exChannelFeeDetail");
		return exChannelFeeDetailMapper.addExChannelFeeDetail(exChannelFeeDetail);
	}
	@Override
	@Transactional
	public int batchAddExChannelFeeDetail(Map map) throws Exception{
		List<ExChannelFeeDetail> exChannelFeeDetailList =(List<ExChannelFeeDetail>)map.get("exChannelFeeDetailList");
		return exChannelFeeDetailMapper.batchAddExChannelFeeDetail(exChannelFeeDetailList);
	}
	@Override
	@Transactional
	public int deleteExChannelFeeDetail(Map map) throws Exception{
		BigInteger uppChannelFeeDetailId = (BigInteger)map.get("uppChannelFeeDetailId");
		return exChannelFeeDetailMapper.deleteExChannelFeeDetail(uppChannelFeeDetailId);
	}
	@Override
	@Transactional
	public int batchDeleteExChannelFeeDetail(Map map) throws Exception{
		List exChannelFeeDetailIdList = (List)map.get("exChannelFeeDetailIdList");
		return exChannelFeeDetailMapper.batchDeleteExChannelFeeDetail(exChannelFeeDetailIdList);
	}
	@Override
	@Transactional
	public int updateExChannelFeeDetail(Map map) throws Exception{
			ExChannelFeeDetail exChannelFeeDetail = (ExChannelFeeDetail)map.get("exChannelFeeDetail");
			return exChannelFeeDetailMapper.updateExChannelFeeDetail(exChannelFeeDetail);
	}
//	@Override
//	public ExChannelFeeDetail getExChannelFeeDetail(Map map) throws Exception{
//		BigInteger uppChannelFeeDetailId = (BigInteger)map.get("uppChannelFeeDetailId");
//		return exChannelFeeDetailMapper.getExChannelFeeDetail(uppChannelFeeDetailId);
//	}
//	@Override
//	public ExChannelFeeDetail getExChannelFeeDetailDTO(Map map) throws Exception{
//		BigInteger uppChannelFeeDetailId = (BigInteger)map.get("uppChannelFeeDetailId");
//		return exChannelFeeDetailMapper.getExChannelFeeDetailDTO(uppChannelFeeDetailId);
//	}
//	@Override
//	public List<ExChannelFeeDetail> getExChannelFeeDetailList(Map map) throws Exception{
//		ExChannelFeeDetail exChannelFeeDetail = (ExChannelFeeDetail)map.get("exChannelFeeDetail");
//		return exChannelFeeDetailMapper.getExChannelFeeDetailList(exChannelFeeDetail);
//	}
	@Override
	public Map getExChannelFeeDetailPageList(Map map) throws Exception{

		Map resultMap = new HashMap();

		Page page = (Page)map.get("page");

		exChannelFeeDetailMapper.getExChannelFeeDetailPageList(page);
		return resultMap;
	}
}
