package com.kulit.customer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Customer")
public class Customer {
 @Id
 private long id;
   private  String city;
    private  String country;
    private  String email;

    private String  login;
    private String name;
     private String password;
    private String  phoneNumber;
    private String  postcode;
     private String street;
    private String sumame;

    @Override
    public String toString() {
        return "Customer{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", postcode='" + postcode + '\'' +
                ", street='" + street + '\'' +
                ", sumame='" + sumame + '\'' +
                '}';
    }
}
