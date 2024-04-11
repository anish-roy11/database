package com.example.test.demo.dao;

import com.example.test.demo.model.Person;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    default int insertPerson(Person person)
    {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    int insertPerson(UUID id, Person person);

    List<Person> selectAllPeople();

    Optional<Person> selectPersonByID(UUID id);

    int updatePersonById(UUID id, Person person);

    int deletePersonById(UUID id);




    Person selectPersonByID_2(UUID id);

    int updatePersonById_2(UUID id, Person person);

    int deletePersonById_2(UUID id);

    Person insertPerson2_returnsPerson(String name);

    Person updatePersonById3_returnsPerson(UUID id, Person person);

}
