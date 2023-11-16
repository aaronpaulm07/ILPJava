package com.ilp.entity;

public class SavingAccount extends Account {
private String roi;

public SavingAccount(String accountNo, String accountName, double accountBalance, String roi) {
	super(accountNo, accountName, accountBalance);
	this.roi = roi;
}

public String getRoi() {
	return roi;
}

public void setRoi(String roi) {
	this.roi = roi;
}

}
