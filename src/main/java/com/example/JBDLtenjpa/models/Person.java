package com.example.JBDLtenjpa.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "my_person")
public class Person {

    /**
     * Hibernate converts all camel cases into a two words separated by -
     * ex. myFirstName --> my_first_name
     * Hibernate converts all the uppercases into lowercase
     */

    //below field will not be linked to DB table
    private static int counter;

    //@Id indicates field is the primary key
    @Id
    private Integer id; //automatically generated by server | FE need not send this

    //@Column allows us to change the name of the field
    @Column(name = "first_name", length = 30)
    private String firstName;
    private String lastName;
    private Integer age;
    private  String dob;

    //@Transient makes the field to not being linked to the table
    @Transient
    private String countryCode;

    //this kind of transient is for keys or sensitive data, it will store the default value, no the real value (key)
//    private transient String areaCode;
}

