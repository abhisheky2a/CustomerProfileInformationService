package com.info.customer.telecom.kool.response;

import org.springframework.stereotype.Component;

import com.info.customer.telecom.kool.model.CustInfo;

@Component
public class CustInfoServiceResponse {
	
	CustInfo custInfo;
	AccountInfoServiceResponse accountDetails;
	
	public CustInfo getCustInfo() {
		return custInfo;
	}
	public void setCustInfo(CustInfo custInfo) {
		this.custInfo = custInfo;
	}
	public AccountInfoServiceResponse getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountInfoServiceResponse accountDetails) {
		this.accountDetails = accountDetails;
	}
	
	
	

}
