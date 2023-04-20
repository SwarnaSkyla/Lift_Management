package com.example.Lift_Management.Models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="lifts")
public class Lift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int liftNo;

    private int capacity;

    private int noOfPersons;

    @OneToMany(mappedBy = "lift",cascade = CascadeType.ALL)
    private List<Person> personList=new ArrayList<>();


    public Lift() {
    }

    public Lift(int capacity, int noOfPersons, List<Person> personList) {
        this.capacity = capacity;
        this.noOfPersons = noOfPersons;
        this.personList = personList;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
