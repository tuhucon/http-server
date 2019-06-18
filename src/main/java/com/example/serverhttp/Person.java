package com.example.serverhttp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String country;
    String city;
    String wifeFirstName;
    String wifeLastName;
    int wifeAge;
    String wifeAddress;
    String wifeCountry;
    String wifeCity;
}
