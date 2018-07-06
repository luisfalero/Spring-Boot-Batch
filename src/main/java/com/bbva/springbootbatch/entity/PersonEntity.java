package com.bbva.springbootbatch.entity;

import lombok.Data;

@Data
public class PersonEntity {

    private Long presonId;
    private String lastName;
    private String firstName;

    @Override
    public String toString() {
        return "PersonEntity{" +
                "presonId=" + presonId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
