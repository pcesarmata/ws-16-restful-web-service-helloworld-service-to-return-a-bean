package com.cesarmata.bean;

import javax.annotation.ManagedBean;

/**
 * @author Cesar Mata
 */
public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getHelloWorld() {
		return message;
	}

	public void setHelloWorld(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
}