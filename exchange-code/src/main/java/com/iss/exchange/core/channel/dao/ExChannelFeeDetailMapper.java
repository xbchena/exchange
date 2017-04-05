package com.iss.exchange.core.channel.dao;

import java.math.BigInteger;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.github.pagehelper.Page;
import com.iss.exchange.core.channel.dto.ExChannelFeeDetailDTO;
import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;

public interface ExChannelFeeDetailMapper extends Mapper<ExChannelFeeDetail>, MySqlMapper<ExChannelFeeDetail> {

	int addExChannelFeeDetail(ExChannelFeeDetail exChannelFeeDetail);

	int batchAddExChannelFeeDetail(List<ExChannelFeeDetail> exChannelFeeDetailList);

	int deleteExChannelFeeDetail(BigInteger uppChannelFeeDetailId);

	int batchDeleteExChannelFeeDetail(List<BigInteger> uppChannelFeeDetailIdList);

	int updateExChannelFeeDetail(ExChannelFeeDetail exChannelFeeDetail);

	ExChannelFeeDetail getExChannelFeeDetail(BigInteger uppChannelFeeDetailId);

	ExChannelFeeDetailDTO getExChannelFeeDetailDTO(BigInteger uppChannelFeeDetailId);

	List<ExChannelFeeDetailDTO> getExChannelFeeDetailList(ExChannelFeeDetail exChannelFeeDetail);

	List<ExChannelFeeDetail> getExChannelFeeDetailPageList(Page<?> page);

}
