package com.example.Lift_Management.Service;


import com.example.Lift_Management.EntryDto.CountPeople;
import com.example.Lift_Management.EntryDto.PersonEntry;
import com.example.Lift_Management.Models.Lift;
import com.example.Lift_Management.Models.Person;
import com.example.Lift_Management.Repository.LiftRepository;
import com.example.Lift_Management.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    LiftRepository liftRepository;

    public String addPerson(PersonEntry personEntry){

        int liftNo=personEntry.getLiftNo();
        Lift lift=liftRepository.findById(liftNo).get();

        Person p=new Person();
        p.setId(personEntry.getPersonId());
        p.setWeight(personEntry.getPersonWt());
        p.setLift(lift);

        List<Person> persons=lift.getPersonList();
        persons.add(p);

        liftRepository.save(lift);
        return "Person Added";



    }

    public void deletePerson(int x){
        personRepository.deletePerson(x);
    }

    public int get_People_Lift(CountPeople countPeople){

        Lift lift=liftRepository.findById(countPeople.getLiftNo()).get();
        int weight=countPeople.getWeight();
        int liftcap=lift.getCapacity();
        int count=liftcap/weight;
        return count;



    }
    public int getGreaterThanX(int x,int liftNo){

        Lift lift=liftRepository.findById(liftNo).get();



       int count=0;
       List<Person> personList=lift.getPersonList();
       for(Person p:personList){
           if(p.getWeight()>x){
               count++;
           }
       }
       return count;

    }
}
