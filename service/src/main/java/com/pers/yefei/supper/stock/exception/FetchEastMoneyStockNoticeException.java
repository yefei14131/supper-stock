package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class FetchEastMoneyStockNoticeException extends ServerBaseException {

	private static final long serialVersionUID = 1L;
	private static ResponseCodeEnum responseCodeEnum = ResponseCodeEnum.Fetch_EastMoney_Stock_Notice_Error;


	public FetchEastMoneyStockNoticeException() {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason());
	}

	public FetchEastMoneyStockNoticeException(String message) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message);
	}

	public FetchEastMoneyStockNoticeException(String message, Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason() + ":" + message, e);
	}

	public FetchEastMoneyStockNoticeException(Exception e) {
		super(responseCodeEnum.getCode(), responseCodeEnum.getReason(), e);	}

}
