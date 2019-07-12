package com.info.customer.telecom.kool.feign.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.info.customer.telecom.kool.response.AccountInfoServiceResponse;



@Component
//@FeignClient(name="bill-info-service", url="localhost:8031")
//@FeignClient(name="bill-info-service")
@FeignClient(name="kool-telecom-api-gateway")
@RibbonClient(name="account-info-service")
public interface CustomerProfileInformationServiceProxy {
	
 
  @GetMapping("/account-info-service/account-info-service/searchAccountsAndBillsByCustomerId/{custId}")
  public AccountInfoServiceResponse getCustAccountAndBillInfo(@PathVariable("custId") String custId);

}