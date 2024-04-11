package com.example.test.demo.service;

import com.example.test.demo.dao.PersonDao;
import com.example.test.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }


    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }



    public Person getPersonById_2(UUID id) {

        return personDao.selectPersonByID_2(id);
    }



    public int deletePerson_2(UUID id)
    {
        return personDao.deletePersonById_2(id);
    }

    public int updatePerson_2(UUID id, Person newPerson)
    {
        return personDao.updatePersonById_2(id, newPerson);
    }
























    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonByID(id);

    }



    public int deletePerson(UUID id)
    {
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person newPerson)
    {
        return personDao.updatePersonById(id, newPerson);
    }


    public Person addPerson2_returnsPerson(String name) {

        return personDao.insertPerson2_returnsPerson(name);
    }



    public Person updatePerson_returnPerson(UUID id, Person newPerson)
    {
        return personDao.updatePersonById3_returnsPerson(id, newPerson);
    }

}
