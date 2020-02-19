package com.devops.aquarium.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

//@JsonIgnoreProperties(value = {"numSS"}) //Listing attributes to not send in the JSON file
@Entity
public class Employee {

    //Employee's Personal File fields
    @Id
    //@GeneratedValue
    //@Min(value = 1)
    private int id;
    //@Length(min=1, max=40)
    private String firstName;
    //@Length(min=3, max=40)
    private String lastName;
    //Privacy-related attributes
    //@Length(min=1, max=5, message="Wrong Numéro de Sécu")
    private String birthdate;
    private String address;
    private long secuNum;
    private String password;

//Additional attributes
    //private List<String> sectors;
    //private List<String> pools;
    //private List<String> activities;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, String address) {
        this.id=id; this.firstName=firstName; this.lastName=lastName; this.address=address;
    }

    public int getId() { return this.id; }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBirthdate() { return birthdate; }
    public void setBirthdate(String birthday) { this.birthdate = birthday; }
    public String getAddress() { return this.address; }
    public void setAddress(String address) { this.address = address; }
    public long getSecuNum() { return secuNum; }
    public void setSecuNum(long numSecu) { this.secuNum = numSecu; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", secuNum=" + secuNum +
                ", password='" + password + '\'' +
                '}';
    }
}
