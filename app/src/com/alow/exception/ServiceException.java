package com.alow.exception;

import java.io.Serializable;

public class ServiceException extends Exception implements Serializable {

	private static final long serialVersionUID = -4897617145675605496L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

}
