package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class CannotMatchRequestException extends ServerBaseException {

	private static final long serialVersionUID = 1L;


	public CannotMatchRequestException() {
		super(ResponseCodeEnum.CannotMatchRequest.getCode(), ResponseCodeEnum.CannotMatchRequest.getReason());
	}

	public CannotMatchRequestException(String message) {
		super(ResponseCodeEnum.CannotMatchRequest.getCode(), ResponseCodeEnum.CannotMatchRequest.getReason() + ":" + message);
	}



	public CannotMatchRequestException(String message, Exception e) {
		super(ResponseCodeEnum.CannotMatchRequest.getCode(), ResponseCodeEnum.CannotMatchRequest.getReason() + ":" + message, e);
	}


	public CannotMatchRequestException(Exception e) {
		super(ResponseCodeEnum.CannotMatchRequest.getCode(), ResponseCodeEnum.CannotMatchRequest.getReason(), e);
	}

}
