package com.example.test.demo.api;

import com.example.test.demo.model.Person;
import com.example.test.demo.service.PersonService;
import com.example.test.restservice.controller.RestServiceController;
//import com.sun.istack.internal.NotNull;
import javax.validation.constraints.NotNull;
//import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;


@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private static final Logger logger = Logger.getLogger(PersonController.class.getName());
    public final PersonService personService;


    @Autowired
    public PersonController(PersonService personService) {

        this.personService = personService;
    }



    @PostMapping("/addPerson_returnPerson")
    public Person addPerson2_returnsPerson(@Valid @NotNull @RequestBody Person person) {

        //System.out.println("logentry /addPerson2 url method");
        logger.info("logentry /addPerson2 url method");

        Person person3 = personService.addPerson2_returnsPerson(person.getName());
        return person3;
    }


    @PostMapping("/addPerson")
    public void addPerson(@Valid @NotNull @RequestBody Person person) {

       // System.out.println("logentry /addPerson url method");
        logger.info("logentry /addPerson url method");
        personService.addPerson(person);
    }



    @GetMapping("/getAllPerson")
    public List<Person> getAllPeople() {

       // System.out.println("logentry /getAllPerson method");
        logger.info("logentry /getAllPerson url method");
        return personService.getAllPeople();
    }



    @GetMapping("/getPersonById/{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
       // System.out.println("logentry /getPersonById/{id} url method");
        logger.info("logentry /getPersonById/{id} url method");
        return personService.getPersonById_2(id);
    }



    //@DeleteMapping(path = "{id}")
    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable("id") UUID id)
    {
        //personService.deletePerson(id);
       // System.out.println("logentry /delete/{id} url method");
        logger.info("logentry /delete/{id} url method");
        personService.deletePerson_2(id);
    }



    //@PutMapping(path = "{id}")
    @PutMapping("/update/{id}")
    public void updatePerson(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Person personToUpdate)
    {
        //System.out.println("logentry /update/{id} url method");
        logger.info("logentry /update/{id} url method");
        //personService.updatePerson(id, personToUpdate);
        personService.updatePerson_2(id, personToUpdate);
    }




    //@PutMapping(path = "{id}")
    @PutMapping("/updatePerson_returnPerson/{id}")
    public Person updatePerson_returnPerson(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Person personToUpdate)
    {
        //System.out.println("logentry /update/{id} url method");
        logger.info("logentry /updatePerson_returnPerson/{id} url method");
        //personService.updatePerson(id, personToUpdate);
        return personService.updatePerson_returnPerson(id, personToUpdate);
    }



/*
    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable("id") UUID id)
    {
        System.out.println("logentry /delete/{id} url method");
        personService.deletePerson_2(id);
    }




 */


/*

    @PutMapping("/update/{id}")
    public void updatePerson(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Person personToUpdate)
    {
        System.out.println("logentry /update/{id} url method");
        personService.updatePerson_2(id, personToUpdate);
    }



 */
















/*

    @GetMapping(path = "{id}" )
    public Person getPersonById2(@RequestParam UUID id) {
        return personService.getPersonById(id).orElse(null);
    }



 */

/*
    @DeleteMapping(path = "{id}")
    public void deletePersonById2(@PathVariable("id") UUID id)
    {
        personService.deletePerson(id);
    }



 */

/*


    @PutMapping(path = "{id}")
    public void updatePerson2(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Person personToUpdate)
    {
        personService.updatePerson(id, personToUpdate);

    }




 */


    @PostMapping(value = "/addPerson_returnPerson3", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person addPerson2_returnsPerson3(@Valid @NotNull @RequestBody Person person) {
        //System.out.println("logentry /addPerson2 url method");
        logger.info("logentry /addPerson_returnPerson3 url method");

        Person person3 = personService.addPerson2_returnsPerson(person.getName());
        return person3;
    }







}


