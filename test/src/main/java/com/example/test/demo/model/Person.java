package com.example.test.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {

    private UUID id = null;

    //String id_String = null;

    @NotBlank
    private String name = null;

    //constructor
    public Person() {
        id = UUID.randomUUID();
        //id_String = null;
        name = null;
    }

    //constructor
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name= name;
    }

    //getter
    public UUID getId() {
        return id;
    }

    //getter
    public String getName() {
        return name;
    }








    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
