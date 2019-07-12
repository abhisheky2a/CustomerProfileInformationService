package com.info.customer.telecom.kool.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.info.customer.telecom.kool.model.CustInfo;

@Repository
public interface CustomerProfileInfoRepository extends MongoRepository<CustInfo, String>{
	

}