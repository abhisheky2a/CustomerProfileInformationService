package com.info.customer.telecom.kool.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "custInfo")
public class CustInfo {
	
	@Id
	@Field("_id")
	private String custId;
	@Field("cust_name")
	private String custName;
	@Field("cust_tier")
	private String custTier;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustTier() {
		return custTier;
	}
	public void setCustTier(String custTier) {
		this.custTier = custTier;
	}
	

}
