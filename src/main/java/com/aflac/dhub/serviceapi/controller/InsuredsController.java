package com.aflac.dhub.serviceapi.controller;

import com.aflac.dhub.serviceapi.model.Customer;
import com.aflac.dhub.serviceapi.model.Customer1;
import com.aflac.dhub.serviceapi.repo.DynamoDBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 *  DigitalHub ServiceAPI controller
 *
 */

@RestController
@RequestMapping("/s-insured-hub")
public class InsuredsController {

    @Autowired
    private DynamoDBRepo dynamoDBRepo;

    /***
     *
     * This method is used for status check of the microservice
     * @return String
     */
    @GetMapping("/v1/health")
    public String status(){
        return "Insureds Service is up and running !!!";
    }
    @GetMapping(path = "/v1/insureds/{insuredId}")
    public String getInsuredsByGuid(@PathVariable String insuredId){
        return "Get Insureds by InsuredId!" + insuredId;
    }
    
    @GetMapping("/v1/insureds")
    public String getAllInsureds(){
        return "Get all Insureds!";
    }
    /**
     *
     * This method fetches the customer details for the given aflacGlobalID from DynamoDB
     * @param aflacGlobalID
     * @return
     */
    @GetMapping
    public ResponseEntity<Customer1> fetchCustomerDetails(@RequestParam String aflacGlobalID){

        return new ResponseEntity<Customer1>(dynamoDBRepo.fetchCustomerDetails(aflacGlobalID), HttpStatus.OK);
    }

}
