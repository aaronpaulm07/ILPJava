package com.ilp.entity;

public class Services {
	private String serviceCode;
	private String serviceName;
	private double rate;
		
	public Services(String serviceCode, String serviceName, double rate) {
//		super();
   		this.serviceCode = serviceCode;
   		this.serviceName = serviceName;
   		rate = rate;
   	}
private String getServiceCode() {
		return serviceCode;
	}
private void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
private String getServiceName() {
		return serviceName;
	}
private void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
private double getRate() {
		return rate;
	}
private void setRate(double rate) {
		rate = rate;
	}
	
}
