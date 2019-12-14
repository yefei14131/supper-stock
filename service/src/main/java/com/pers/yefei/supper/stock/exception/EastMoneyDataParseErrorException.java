package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class EastMoneyDataParseErrorException extends ServerBaseException {

	private static final long serialVersionUID = 1L;
	private static ResponseCodeEnum responseCodeEnum = ResponseCodeEnum.Parse_EastMoney_Data_Error;


	public EastMoneyDataParseErrorException() {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason());
	}

	public EastMoneyDataParseErrorException(String message) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message);
	}

	public EastMoneyDataParseErrorException(String message, Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message, e);
	}

	public EastMoneyDataParseErrorException(Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason(), e);	}

}
