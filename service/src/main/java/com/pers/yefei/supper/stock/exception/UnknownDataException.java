package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class UnknownDataException extends ServerBaseException {

	private static final long serialVersionUID = 1L;


	public UnknownDataException() {
		super(ResponseCodeEnum.DATA_NOT_IN_DB.getCode(), ResponseCodeEnum.DATA_NOT_IN_DB.getReason());
	}

	public UnknownDataException(String message) {
		super(ResponseCodeEnum.DATA_NOT_IN_DB.getCode(), ResponseCodeEnum.DATA_NOT_IN_DB.getReason() + ":" + message);
	}



	public UnknownDataException(String message, Exception e) {
		super(ResponseCodeEnum.DATA_NOT_IN_DB.getCode(), ResponseCodeEnum.DATA_NOT_IN_DB.getReason() + ":" + message, e);
	}


	public UnknownDataException(Exception e) {
		super(ResponseCodeEnum.DATA_NOT_IN_DB.getCode(), ResponseCodeEnum.DATA_NOT_IN_DB.getReason(), e);
	}

}
