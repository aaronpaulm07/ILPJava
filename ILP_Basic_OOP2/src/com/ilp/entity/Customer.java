package com.ilp.entity;

public class Customer {
	private String customerID;
	private String customerName;
	private String customerMobileNumber;
	private String customerDOB;
	private String customerPincode;
	private String customerOpenDate;
	
	public void setCustomerID(String customerID)
	{
		this.customerID=customerID;
	}
	public String getCustomerID()
	{
		return customerID;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerMobileNumber(String customerMobileNumber)
	{
		this.customerMobileNumber=customerMobileNumber;
	}
	public String getCustomerMobileNumber()
	{
		return customerMobileNumber;
	}
	public void setCustomerDOB(String customerDOB)
	{
		this.customerDOB=customerDOB;
	}
	public String getCustomerDOB()
	{
		return customerMobileNumber;
	}public void setCustomerPincode(String customerPincode)
	{
		this.customerPincode=customerPincode;
	}
	public String getCustomerPincode()
	{
		return customerPincode;
	}public void setCustomerOpenDate(String customerOpenDate)
	{
		this.customerOpenDate=customerOpenDate;
	}
	public String getCustomerOpenDate()
	{
		return customerOpenDate;
	}
}
