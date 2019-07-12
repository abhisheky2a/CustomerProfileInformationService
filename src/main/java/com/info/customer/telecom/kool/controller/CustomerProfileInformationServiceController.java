package com.info.customer.telecom.kool.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.info.customer.telecom.kool.response.CustInfoServiceResponse;
import com.info.customer.telecom.kool.service.CustomerProfileInformationService;

@RestController
public class CustomerProfileInformationServiceController {
	
	@Autowired
	CustomerProfileInformationService service;
	
	
	private Logger logger = LoggerFactory.getLogger(CustomerProfileInformationServiceController.class);
    
    @GetMapping("/customer-profile-info-service/customers/{custId}")
    public CustInfoServiceResponse getAccountsByCustId(@PathVariable String custId) {
       return service.getCustInfo(custId);
    }
    

}
