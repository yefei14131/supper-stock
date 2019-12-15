package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class EastMoneyDataGetException extends ServerBaseException {

	private static final long serialVersionUID = 1L;
	private static ResponseCodeEnum responseCodeEnum = ResponseCodeEnum.Get_EastMoney_Data_Error;


	public EastMoneyDataGetException() {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason());
	}

	public EastMoneyDataGetException(String message) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message);
	}

	public EastMoneyDataGetException(String message, Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message, e);
	}

	public EastMoneyDataGetException(Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason(), e);	}

}
