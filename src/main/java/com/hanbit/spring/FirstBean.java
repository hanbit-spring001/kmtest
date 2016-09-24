package com.hanbit.spring;

public class FirstBean {
	
	private SecondBean secondBean;
	
	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}
	
	public void callSecondBean() {
		secondBean.printName();
	}
}
