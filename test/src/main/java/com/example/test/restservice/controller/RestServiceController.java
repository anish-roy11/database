package com.example.test.restservice.controller;

import com.example.test.demo.model.Person;
import com.example.test.restservice.service.RestServiceImpl;
//import com.sun.istack.internal.NotNull;
//import com.sun.istack.NotNull;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.UUID;
import java.util.logging.Logger;
//import org.jetbrains.annotations.Nullable;

@RequestMapping("api/v1/rest")
@RestController
public class RestServiceController {

    private static final Logger logger = Logger.getLogger(RestServiceController.class.getName());

    @Autowired
    RestTemplate restTemplate;







    //Get method demo
    //below shown get controller is working -- better than /getproducts   one
    @RequestMapping(value = "/getpersonlist2", method= RequestMethod.GET)
        public ResponseEntity<Person[]> getPersonList2() {
        logger.info("logEntry:/getpersonlist2 url method");
        System.out.println("logEntry:/getpersonlist2 url method");
        RestServiceImpl restServiceImpl = new RestServiceImpl(restTemplate);
        return restServiceImpl.getPersonList2();

        /*
        System.out.println("logEntry:/template/products2 url method");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Person[]> responseEntity =  restTemplate.exchange("http://localhost:8080/api/v1/person/getAllPerson",
                   HttpMethod.GET,entity,Person[].class);
        return responseEntity;

         */
    }



    //POST method demo
    //below shown POST controller is working
    @RequestMapping(value = "/createperson2", method= RequestMethod.POST)
    public  ResponseEntity<Person>  createPerson2() {
        System.out.println("logEntry:/createperson2 url method");
        RestServiceImpl restServiceImpl = new RestServiceImpl(restTemplate);
        return restServiceImpl.createPerson2();

        /*
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

        System.out.println("log:before triggering Post call");
        ResponseEntity<Person> personResponseEntity =  restTemplate.exchange("http://localhost:8080/api/v1/person/addPerson2",
                HttpMethod.POST,entity,Person.class);
        return personResponseEntity;

         */
    }





    //PUT method demo
    //below shown PUT controller is
    @RequestMapping(value = "/updateperson2/{id}", method= RequestMethod.PUT)
    public ResponseEntity<Person> updateperson2(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Person personToUpdate){
        System.out.println("logEntry:/updateperson2/{id} url method");
        RestServiceImpl restServiceImpl = new RestServiceImpl(restTemplate);
        return restServiceImpl.updatePerson2(id, personToUpdate);

        /*
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

        System.out.println("log:before triggering Post call");
        ResponseEntity<Person> personResponseEntity =  restTemplate.exchange("http://localhost:8080/api/v1/person/addPerson2",
                HttpMethod.POST,entity,Person.class);
        return personResponseEntity;

         */
    }






    //GET method demo
    //below shown controller is working
    @RequestMapping(value = "/getpersonlist", method= RequestMethod.GET)
    public String getPersonList() {
        logger.info("logEntry:/getpersonlist url method");

        RestServiceImpl restServiceImpl = new RestServiceImpl(restTemplate);
        return restServiceImpl.getPersonList();
        /*
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange("http://localhost:8080/api/v1/person/getAllPerson", HttpMethod.GET, entity, String.class).getBody();

         */

    }


    //another form of Get method tht has parameters in input
    @GetMapping("/age")
    ResponseEntity<String> age(@RequestParam("yearOfBirth") int yearOfBirth) {

        return new ResponseEntity<>("Your age is " ,HttpStatus.OK);
    }


}

