package com.example.demo.model;

public class Estado {

	boolean error = false;
	String msg = "";
	String code = "200";
	
	
	public Estado() {
	}


	public Estado(boolean error, String msg, String code) {
		super();
		this.error = error;
		this.msg = msg;
		this.code = code;
	}


	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	@Override
	public String toString() {
		return "Estado [error=" + error + ", msg=" + msg + ", code=" + code + "]";
	}

	
	
}
