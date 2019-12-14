package com.pers.yefei.supper.stock.exception;


public enum ResponseCodeEnum {
	
	SUSCCESS(0,"success")
	, FAIL(1001,"系统繁忙，请稍后重试！")
	, Parse_EastMoney_Data_Error(2011, "解析东方财富数据异常")
	, Get_EastMoney_Data_Error(2012, "获取东方财富数据异常")
	, DATA_NOT_IN_DB(2021, "数据库找不到对应的记录")
	;

	
	 private final int code;
	 private final String reason;
	 
	 ResponseCodeEnum(int code, String reason) {
	    this.code = code;
	    this.reason= reason;
	 }

	 public int getCode(){
		 return this.code;
	 }
	 public String getReason(){
		 return this.reason;
	 }
}
