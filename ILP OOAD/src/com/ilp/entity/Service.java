package com.ilp.entity;

public class Service {
	private String serviceId;
	private String serviceName;
	private double servicePrice;
	public Service (String serviceId, String serviceName, double servicePrice) {
		 this.serviceId =serviceId;
		 this.serviceName =serviceName;
		 this.servicePrice =servicePrice;
		 
	 }
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}
	
	
	
	
}
