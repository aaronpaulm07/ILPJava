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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public ArrayList<Services> getServiceList() {
		return serviceList;
	}
	public void setServiceList(ArrayList<Services> serviceList) {
		this.serviceList = serviceList;
	}




}
