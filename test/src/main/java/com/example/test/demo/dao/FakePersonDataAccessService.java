package com.example.test.demo.dao;

import com.example.test.demo.api.PersonController;
import com.example.test.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

    private static final Logger logger = Logger.getLogger(FakePersonDataAccessService.class.getName());
    private static List<Person> DB = new ArrayList<>();


    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonByID(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }




    @Override
    public Person selectPersonByID_2(UUID id) {

        Person person=null;
        Person personToBeReturned=null;
        for(int i = 0; i <= DB.size(); i++)
        {
            person = DB.get(i);
            if(person.getId().equals(id))
            {
                personToBeReturned = DB.get(i);
                break;
            }

        }
        return personToBeReturned;

    }

    @Override
    public int updatePersonById_2(UUID id, Person person) {
        Person localPerson=null;
        Person personToBeReturned=null;
        boolean idFound = false;

        for(int i = 0; i < DB.size(); i++)
        {
            localPerson = DB.get(i);
            if(localPerson.getId().equals(id))
            {
                DB.set(i, person);
                idFound = true;
                break;
            }

        }

        if(idFound == true)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public int deletePersonById_2(UUID id) {
        Person person=null;
        boolean idFound = false;

        for(int i = 0; i <= DB.size(); i++)
        {
            person = DB.get(i);
            if(person.getId().equals(id))
            {
                DB.remove(i);
                idFound = true;
                break;
            }

        }
        if(idFound == true)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }



    @Override
    public Person insertPerson2_returnsPerson(String name) {
        UUID id = UUID.randomUUID();

        //Person person = new Person(id,name);
        Person person = new Person();
        person.setName(name);
        person.setId(id);

        DB.add(person);
        return person;
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe = selectPersonByID(id);
        if (personMaybe.isPresent()) {
            DB.remove(personMaybe.get());
            return 1;
        }
        else
        {
            return 0;
        }
    }




    @Override
    public int updatePersonById(UUID id, Person person) {
        int indexOfPersonToDelete = DB.indexOf(person);
        if(indexOfPersonToDelete >= 0)
        {
            DB.set(indexOfPersonToDelete, person);
            return 1;
        }
        else
        {
            return 0;
        }


    }





    @Override
    public Person updatePersonById3_returnsPerson(UUID id, Person person) {
        logger.info("logEntry:updatePersonById3_returnsPerson method");
        Person localPerson=null;
        Person personToBeReturned=null;
        boolean idFound = false;

        for(int i = 0; i < DB.size(); i++)
        {
            localPerson = DB.get(i);
            if(localPerson.getId().equals(id))
            {

                logger.info("inside  if(localPerson.getId().equals(id))");
                DB.set(i, person);
                idFound = true;
                break;
            }

        }

        if(idFound == true)
        {
            return person;
        }
        else
        {
            return localPerson;
        }
        //return null;
    }
}
