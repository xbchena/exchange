package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannel;
public class ExChannelRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExChannel ExChannel = new ExChannel();

	private BigInteger ExChannelID;

	private List<BigInteger> ExChannelIDList;

	private List<? extends ExChannel> ExChannelList = new ArrayList<ExChannel>();

	public List<? extends ExChannel> getExChannelList() {
		return ExChannelList;
	}
	public void setExChannelList(List<? extends ExChannel> ExChannelList) {
		this.ExChannelList = ExChannelList;
	}
	public ExChannel getExChannel() {
		return ExChannel;
	}
	public void setExChannel(ExChannel ExChannel) {
		this.ExChannel = ExChannel;
	}
	public BigInteger getExChannelID() {
		return ExChannelID;
	}
	public void setEdgeTransID(BigInteger ExChannelID) {
		this.ExChannelID = ExChannelID;
	}
	public List<BigInteger> getExChannelIDList() {
		return ExChannelIDList;
	}
	public void setExChannelIDList(List<BigInteger> ExChannelIDList) {
		this.ExChannelIDList = ExChannelIDList;
	}
}