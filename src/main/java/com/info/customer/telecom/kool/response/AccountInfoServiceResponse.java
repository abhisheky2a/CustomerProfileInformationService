package com.info.customer.telecom.kool.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.info.customer.telecom.kool.model.AccountInfo;
import com.info.customer.telecom.kool.model.BillInfo;


@Component
public class AccountInfoServiceResponse {
	
	public AccountInfoServiceResponse() {}
	
	List<AccountInfo> accountInfo;
	
	List<BillInfo> billInfo;

	public List<AccountInfo> getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(List<AccountInfo> accountInfo) {
		this.accountInfo = accountInfo;
	}

	public List<BillInfo> getBillInfo() {
		return billInfo;
	}

	public void setBillInfo(List<BillInfo> billInfo) {
		this.billInfo = billInfo;
	}
	
	

}
