package io.zipcoder.crudapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/people")
public class PersonController {
    public Person createPerson(Person p){
        return null;
    }
    public Person getPerson(int id){
        return null;
    }
    public List<Person> getPerson(){
        return null;
    }
    public Person update(Person p){
        return null;
    }
    public void delete(int id){

    }
}
