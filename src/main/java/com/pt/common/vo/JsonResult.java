package com.pt.common.vo;

public class JsonResult {
	
	/**
	 * 状态码,0表示错误，1表示正确
	 */
	private int state;
	
	/**
	 * 状态码对应的信息,默认值为ok
	 */
	private String message="ok";
	
	/**
	 * 正确的数据进行封装，例如将查询到的数据封装
	 */
	private Object data;
	
	public JsonResult(){}
	
	public JsonResult(String message){
		this.message=message;
	}
	/**
	 * 初始化正确的数据
	 * @param data
	 */
	public JsonResult(Object data){
		this.data=data;
	}
	/**
	 * 如果出现异常，将异常进行封装
	 * @param e
	 */
	public JsonResult(Throwable e){
		this.message=e.getMessage();
		this.state=0;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
