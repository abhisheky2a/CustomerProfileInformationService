package com.info.customer.telecom.kool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.info.customer.telecom.kool.feign.proxy.CustomerProfileInformationServiceProxy;
import com.info.customer.telecom.kool.model.CustInfo;
import com.info.customer.telecom.kool.repository.CustomerProfileInfoRepository;
import com.info.customer.telecom.kool.response.AccountInfoServiceResponse;
import com.info.customer.telecom.kool.response.CustInfoServiceResponse;

@Service
public class CustomerProfileInformationService {
	
	@Autowired
	CustomerProfileInfoRepository repository;
	
	@Autowired
	CustInfo custInfo;
	
	@Autowired
	CustInfoServiceResponse custInfoResponse;
	
	@Autowired
	CustomerProfileInformationServiceProxy proxy;
	
	@Autowired
	AccountInfoServiceResponse accountInfoResponse;
	
	public CustInfoServiceResponse getCustInfo(String custId)
	{
		if(repository.findById(custId).isPresent())
		{
			custInfo = repository.findById(custId).get();
			custInfoResponse.setCustInfo(custInfo);
			
			if(null != custInfo)
			{
				accountInfoResponse = proxy.getCustAccountAndBillInfo(custInfo.getCustId());
				if (null != accountInfoResponse)
					custInfoResponse.setAccountDetails(accountInfoResponse);
			}
		}
		
		return custInfoResponse;
	}

}
