package com.aflac.dhub.serviceapi.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.io.Serializable;

/***
 *  This model class maps to the dhub-customer table in DynamoDB
 */

@DynamoDBTable(tableName = "hub-customer")
public class Customer1 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String aflacGlobalID;
    private String claim;
    private String firstName;
    private String lastName;
    private String sourceSystemCode;

    @DynamoDBHashKey(attributeName = "aflacGlobalID")
    public String getAflacGlobalID() {
        return aflacGlobalID;
    }

    public void setAflacGlobalID(String aflacGlobalID) {
        this.aflacGlobalID = aflacGlobalID;
    }

    @DynamoDBAttribute(attributeName = "Claim")
    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    @DynamoDBAttribute(attributeName = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @DynamoDBAttribute(attributeName = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @DynamoDBAttribute(attributeName = "SourceSystemCode")
    public String getSourceSystemCode() {
        return sourceSystemCode;
    }

    public void setSourceSystemCode(String sourceSystemCode) {
        this.sourceSystemCode = sourceSystemCode;
    }
}
