package com.aflac.dhub.serviceapi.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.io.Serializable;

/***
 *  This model class maps to the dhub-customer table in DynamoDB
 */

@DynamoDBTable(tableName = "dhub-customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String aflacGlobalID;
    private String sSN;
    private String sourceGenderCode;
    private String dateOfBirth;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nameSuffix;
    private String partyFullName;

    @DynamoDBAttribute
    public String getAflacGlobalID() {
        return aflacGlobalID;
    }

    public void setAflacGlobalID(String aflacGlobalID) {
        this.aflacGlobalID = aflacGlobalID;
    }

    @DynamoDBAttribute
    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    @DynamoDBAttribute
    public String getSourceGenderCode() {
        return sourceGenderCode;
    }

    public void setSourceGenderCode(String sourceGenderCode) {
        this.sourceGenderCode = sourceGenderCode;
    }

    @DynamoDBAttribute
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @DynamoDBAttribute
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @DynamoDBAttribute
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @DynamoDBAttribute
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @DynamoDBAttribute
    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    @DynamoDBAttribute
    public String getPartyFullName() {
        return partyFullName;
    }

    public void setPartyFullName(String partyFullName) {
        this.partyFullName = partyFullName;
    }
}
