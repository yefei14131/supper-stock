package com.pers.yefei.supper.stock.exception;


/**
 *
 */
public class UnknownOperatorException extends ServerBaseException {

	private static final long serialVersionUID = 1L;


	public UnknownOperatorException() {
		super(ResponseCodeEnum.UnknownOperator.getCode(), ResponseCodeEnum.UnknownOperator.getReason());
	}

	public UnknownOperatorException(String message) {
		super(ResponseCodeEnum.UnknownOperator.getCode(), ResponseCodeEnum.UnknownOperator.getReason() + ":" + message);
	}



	public UnknownOperatorException(String message, Exception e) {
		super(ResponseCodeEnum.UnknownOperator.getCode(), ResponseCodeEnum.UnknownOperator.getReason() + ":" + message, e);
	}


	public UnknownOperatorException(Exception e) {
		super(ResponseCodeEnum.UnknownOperator.getCode(), ResponseCodeEnum.UnknownOperator.getReason(), e);
	}

}
