package com.example.Lift_Management.Models;


import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int weight;

    @ManyToOne
    @JoinColumn
    private Lift lift;//THIS IS PARENT

    public Person() {
    }

    public Person(int weight, Lift lift) {
        this.weight = weight;
        this.lift = lift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }
}
