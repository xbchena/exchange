package com.iss.exchange.core.common;

import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.finanframe.exception.ExceptionEnums;

public enum ExchangeReturnCode implements ExceptionEnums{
	
	
	UPP_ACCOUNT_BUSTYPE_OR_ACCOUNTNO_NULL("业务类型和账号都不能为空",30001),
	
	CODE_TYPE_EMPTY("传入的codeType不能为空",30002),

	UPP_CHANNEL_ABILITY_ID_EMPTY("传入的uppChannelAbilityId不能为空",30003),
	
	UPP_CHANNEL_FEE_DETAIL_ID_EMPTY("传入的uppChannelFeeDetailId不能为空",30004),
	
	UPP_CHANNEL_FEE_DETAIL_WRONG_DATE("传入的数据有误",30005),
	
	UPP_CHANNEL_ABILITY_MAINTAIN_ID_EMPTY("传入的uppChannelAbilityMaintainId不能为空",30006),
	
	UPP_CHANNEL_FEE_DETAIL_MAINTAIN_ID_EMPTY("传入的uppChannelFeeDetailMaintainId不能为空",30007),
	
	UPP_CHANNEL_FEE_ID_EMPTY("传入的uppChannelFeeId不能为空",30008),
	
	UPP_ROUTE_STATUS_ERROR("路由记录状态未启用,不能修改或删除",30009),
	
	UPP_ROUTE_ADD_ERROR("路由信息已存在,不能新增",30010),
	
	UPP_CHANNEL_ABILITY_RECORDSTATUS("通道信息状态未启用,不允许编辑",30011),
	
	UPP_CHANNEL_FEE_RECORDSTATUS("计费信息状态未启用,不允许编辑",30012),
	
	FEE_RATE_NOT_CONFORM_RULE("加急加收费率只能是符号为正的数字",30013),
	
	MAXAMT_EACH_TRANS_NOT_CONFORM_RULE("每笔最大限额只能是正数，且位数不超过20位",30014),	
	
	MAXAMT_EACH_DAY_NOT_CONFORM_RULE("每日最大限额只能是正数，且位数不超过20位",30015),	
	
	MAXAMT_TRANS_BIGGER_DAY_RULE("每笔最大限额大于每日最大限额",30015),
	
    /**
     *成功
     */
    SUCCESS("成功", 10000),
    /**
     *平台服务异常
     */
    SYSTEM_ERROR("平台服务异常", 20000),

    /**
     * 平台服务暂停
     */
    SERVICE_SUSPEND("平台服务暂停", 20001),

    /**
     * 请求的接口不存在，请核对接口URL地址
     */
    SERVICE_NOT_EXIST("请求的接口不存在，请核对接口URL地址",20002),

    /**
     * 接入方网络地址绑定校验失败
     */
    CLIENT_ADDRESS_BINDING_FAIL("接入方网络地址绑定校验失败",20003),

    /**
     * 接入方Token校验失败
     */
    CLIENT_TOKEN_CHECK_FAIL("接入方Token校验失败",20004),

    /**
     * 接入方访问的接口未经授权
     */
    SERVICE_NOT_ALLOWED("接入方访问的接口未经授权",20005),

    /**
     * 接入方访问过于频繁
     */
    CLIENT_ACCESS_OVERLOAD("接入方访问过于频繁",20006),

    /**
     * 服务处理超时
     */
    SERVICE_PROCESS_OVERTIME("服务处理超时",20007),

    /**
     * 请求消息无法解析
     */
    MESSAGE_CANNOT_BE_PARSED("请求消息无法解析",20010),
    /**
     * 请求消息参数格式错误
     */
    MESSAGE_PARAM_FORMAT_ERROR("请求消息参数格式错误",20011),

    /**
     * 请求消息缺少必输项
     */
    MESSAGE_PARAM_MISSING_ERROR("请求消息缺少必输项",20012),

    /**
     * 加密数据无法正常解密
     */
    DATA_CANNOT_BE_DECRYPTED("加密数据无法正常解密",20013),

    /**
     * 加密数据无法正常解密
     */
    ACCOUNT_NOT_EXIST("加密数据无法正常解密",20013),

    /**
     * 该会员已被暂停服务
     */
    ACCOUNT_STOP_SERVICE("该会员已被暂停服务",20021),

    /**
     * 该会员不存在请求的该类信息
     */
    ACCOUNT_INFO_NOT_EXIST("该会员不存在请求的该类信息",20022),

    /**
     * 登录账户不存在
     */
    LOGIN_ACCOUNT_NOT_EXIST("登录账户不存在",20023),

    /**
     * 用户状态异常
     */
    LOGIN_ACCOUNT_STATUS_ERROR("用户状态异常",20024),


    /**
     * 不能重复操作
     */
    REDO_NOT_ALLOWED("不能重复操作",20025),
	
	/**
     * 没有上传文件
     */
    REQUEST_NO_UPLOADFILE("没有上传文件",20026),
	
	
	/**
     * 上传文件格式错误，请按照模板要求上传
     */
	UPLOADFILE_FORMAT_ERROR("上传文件格式错误，请按照模板要求上传",20027),
	
	/**
     * 上传文件的记录数超出范围
     */
	UPLOADFILE_RECORDNUMER_EXCEED("上传文件的记录数超出范围",20028),
	
	/**
     * 没有发现下载资源
     */
	NOT_FIND_RESOURCE("没有发现下载资源",20029),
	
	/**
     * 上传文件的记录数超出范围
     */
	UPLOADFILE_EMPTY("上传文件内容为空",20030),

	/**
     * 下载的记录数超出范围
     */
	DOWNLOADFILE_RECORDNUMER_EXCEED("下载的记录数超出范围",20031),
	
	
	PAGE_NUM_SIZE_WRONG("传入的分页大小、页码数都不能为空。",20032);
	
    /**
     * 序列化参数
     */
    private static final long serialVersionUID = -2375443325185277247L;




    /**
     * AMS-10000  风格的
     * @return
     */
    public String getCode()
    {
        return BaseResponse.projectName + index;
    }


    private String name;

    private int index;

    // 构造方法
    private ExchangeReturnCode(String name, int index) {
        this.name = name;
        this.index = index;
    }
  
    public static ExchangeReturnCode GetValue(int _id)
    {
        ExchangeReturnCode[] As = ExchangeReturnCode.values();
        for(int i = 0; i < As.length; i++)
        {
            if(As[i].index ==(_id))
                return As[i];
        }
        return ExchangeReturnCode.SYSTEM_ERROR;
    }




	// 覆盖方法
    @Override
    public String toString() {
        return   this.name;
    }
    @Override
	public int getIndex() {
		return 0;
	}
	@Override
    public String getName() {
        return name;
    }	
}

 