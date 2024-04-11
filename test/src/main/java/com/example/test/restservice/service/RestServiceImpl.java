package com.example.test.restservice.service;

import com.example.test.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.UUID;
import java.util.logging.Logger;



public class RestServiceImpl {
    private static final Logger logger = Logger.getLogger(RestServiceImpl.class.getName());

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    RestTemplate restTemplate;

    public RestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RestServiceImpl() {
    }






    public ResponseEntity<Person[]> getPersonList2() {
        System.out.println("logEntry:getProductList2 method");
        logger.info("logEntry:getProductList2 method");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String url= "http://localhost:" + serverPort;
        url = url + "/api/v1/person/getAllPerson";

        ResponseEntity<Person[]> responseEntity =  restTemplate.exchange(url,HttpMethod.GET,entity,Person[].class);
        //ResponseEntity<Person[]> responseEntity =  restTemplate.exchange("http://localhost:8080/api/v1/person/getAllPerson",
          //      HttpMethod.GET,entity,Person[].class);

        return responseEntity;
    }






    public  ResponseEntity<Person>  createPerson2() {
        logger.info("logEntry:createPerson2 method");
        System.out.println("logEntry:RestServiceImpl.createPerson2 method");
        UUID id= UUID.randomUUID();
        Person person = new Person();
        person.setId(id);
        person.setName("name1");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        //HttpEntity <String> entity = new HttpEntity<String>(headers);
        HttpEntity<Person> entity = new HttpEntity<Person>(person,headers);
        //Person personResponseEntity = restTemplate.exchange(
        //      "http://localhost:8080/api/v1/person/addPerson2", HttpMethod.POST, entity, Person.class).getBody();

        // return "person created successfully";

        //ResponseEntity<Person> responseEntity = (ResponseEntity<Person>)personResponseEntity;

        String url= "http://localhost:" + serverPort;
        url = url + "/api/v1/person/addPerson2";

        System.out.println("log:before triggering Post call");
        ResponseEntity<Person> personResponseEntity =  restTemplate.exchange(url, HttpMethod.POST,entity,Person.class);
        //ResponseEntity<Person> personResponseEntity =  restTemplate.exchange("http://localhost:8080/api/v1/person/addPerson2",
          //      HttpMethod.POST,entity,Person.class);
        return personResponseEntity;
    }



    public  ResponseEntity<Person>  updatePerson2(UUID id, Person personToUpdate) {
        logger.info("logEntry:updatePerson2 method");
        //System.out.println("logEntry:RestServiceImpl.createPerson2 method");
        //UUID id= UUID.randomUUID();
        //Person person = new Person();
        //person.setId(id);
        //person.setName("name1");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Person> entity = new HttpEntity<Person>(personToUpdate,headers);
        String url= "http://localhost:" + serverPort;
        url = url + "/api/v1/person/updatePerson_returnPerson/";

        System.out.println("log:before triggering Update call");
        ResponseEntity<Person> personResponseEntity =  restTemplate.exchange(url + id, HttpMethod.PUT, entity, Person.class);

        //ResponseEntity<Person> personResponseEntity =  restTemplate.exchange("http://localhost:8080/api/v1/person/updatePerson_returnPerson/"+id,
        //        HttpMethod.PUT,entity,Person.class);
        return personResponseEntity;
    }


    public String getPersonList() {
        logger.info("logEntry:getPersonList method");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        String url= "http://localhost:" + serverPort;
        url = url + "/api/v1/person/getAllPerson";

        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        //return restTemplate.exchange("http://localhost:8080/api/v1/person/getAllPerson", HttpMethod.GET, entity, String.class).getBody();

    }



}
