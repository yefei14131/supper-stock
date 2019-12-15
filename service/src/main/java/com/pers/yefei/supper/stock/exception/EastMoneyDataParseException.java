package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class EastMoneyDataParseException extends ServerBaseException {

	private static final long serialVersionUID = 1L;
	private static ResponseCodeEnum responseCodeEnum = ResponseCodeEnum.Parse_EastMoney_Data_Error;


	public EastMoneyDataParseException() {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason());
	}

	public EastMoneyDataParseException(String message) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message);
	}

	public EastMoneyDataParseException(String message, Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message, e);
	}

	public EastMoneyDataParseException(Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason(), e);	}

}
