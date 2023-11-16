package com.ilp.entity;

import java.util.ArrayList;

public abstract class Product {
	private String productName;
	private String productCode;
	private ArrayList <Services> serviceList = new ArrayList <Services>();
	
	public Product(String productName, String productCode, ArrayList<Services> serviceList) {
//		super();
		this.productName = productName;
		this.productCode = productCode;
		this.serviceList = serviceList;
	}
private String getProductName() {
		return productName;
	}
private void setProductName(String productName) {
		this.productName = productName;
	}
private String getProductCode() {
		return productCode;
	}
private void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public ArrayList<Services> getServiceList() {
		return serviceList;
	}
	public void setServiceList(ArrayList<Services> serviceList) {
		this.serviceList = serviceList;
	}




}
