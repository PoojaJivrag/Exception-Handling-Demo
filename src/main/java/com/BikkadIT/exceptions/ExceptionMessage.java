package com.BikkadIT.exceptions;

import java.time.LocalDateTime;

public class ExceptionMessage {

	private String code;
	
	private Object msg;
	
	private LocalDateTime localDateTime;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public Object getMsg() {
		return msg;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public void setMsg(Object msg) {
		this.msg = msg;
	}

}