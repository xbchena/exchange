package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannelAbility;
public class ExChannelAbilityRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelAbility ExChannelAbility = new ExChannelAbility();

	private BigInteger ExChannelAbilityID;

	private List<BigInteger> ExChannelAbilityIDList;

	private List<? extends ExChannelAbility> ExChannelAbilityList = new ArrayList<ExChannelAbility>();

	public List<? extends ExChannelAbility> getExChannelAbilityList() {
		return ExChannelAbilityList;
	}
	public void setExChannelAbilityList(List<? extends ExChannelAbility> ExChannelAbilityList) {
		this.ExChannelAbilityList = ExChannelAbilityList;
	}
	public ExChannelAbility getExChannelAbility() {
		return ExChannelAbility;
	}
	public void setExChannelAbility(ExChannelAbility ExChannelAbility) {
		this.ExChannelAbility = ExChannelAbility;
	}
	public BigInteger getExChannelAbilityID() {
		return ExChannelAbilityID;
	}
	public void setEdgeTransID(BigInteger ExChannelAbilityID) {
		this.ExChannelAbilityID = ExChannelAbilityID;
	}
	public List<BigInteger> getExChannelAbilityIDList() {
		return ExChannelAbilityIDList;
	}
	public void setExChannelAbilityIDList(List<BigInteger> ExChannelAbilityIDList) {
		this.ExChannelAbilityIDList = ExChannelAbilityIDList;
	}
}