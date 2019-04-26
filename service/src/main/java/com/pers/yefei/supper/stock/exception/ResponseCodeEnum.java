package com.pers.yefei.supper.stock.exception;


public enum ResponseCodeEnum {
	
	SUSCCESS(0,"success")
	, FAIL(1001,"系统繁忙，请稍后重试！")
	, WELCOME(2001, "欢迎使用MockServer")
	, UnknownOperator(2011, "未知条件运算符，条件运算符只能是 && || ")
	, CannotMatchRequest(2021, "请求不能匹配 ")
	, DATA_NOT_IN_DB(2031, "数据库找不到对应的记录")
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
