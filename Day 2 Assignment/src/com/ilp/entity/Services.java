package com.ilp.entity;

public class Services {
	private String serviceCode;
	private String serviceName;
	private double Rate;
		
	public Services(String serviceCode, String serviceName, double rate) {
//		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		Rate = rate;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
	
}
