package com.aflac.dhub.serviceapi.repo;

import com.aflac.dhub.serviceapi.model.Customer;
import com.aflac.dhub.serviceapi.model.Customer1;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *  DynamoDB repository class for CRUD operations
 */

@Repository
public class DynamoDBRepo {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    /**
     * This method fetches the customer details for the given aflacGlobalID
     * @param aflacGlobalID
     */
    public Customer1 fetchCustomerDetails(String aflacGlobalID){
       // dynamoDBMapper.load(Customer.class, aflacGlobalID);
        return dynamoDBMapper.load(Customer1.class, aflacGlobalID);
    }
}
