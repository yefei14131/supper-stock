package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class DingTalkSignException extends ServerBaseException {

	private static final long serialVersionUID = 1L;
	private static ResponseCodeEnum responseCodeEnum = ResponseCodeEnum.DingTalk_Sign_Error;


	public DingTalkSignException() {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason());
	}

	public DingTalkSignException(String message) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message);
	}

	public DingTalkSignException(String message, Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message, e);
	}

	public DingTalkSignException(Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason(), e);	}

}
