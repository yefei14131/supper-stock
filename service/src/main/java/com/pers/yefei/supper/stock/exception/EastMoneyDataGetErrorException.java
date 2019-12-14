package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class EastMoneyDataGetErrorException extends ServerBaseException {

	private static final long serialVersionUID = 1L;
	private static ResponseCodeEnum responseCodeEnum = ResponseCodeEnum.Get_EastMoney_Data_Error;


	public EastMoneyDataGetErrorException() {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason());
	}

	public EastMoneyDataGetErrorException(String message) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message);
	}

	public EastMoneyDataGetErrorException(String message, Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message, e);
	}

	public EastMoneyDataGetErrorException(Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason(), e);	}

}
