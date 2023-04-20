package com.example.Lift_Management.EntryDto;

public class CountPeople {
    private int liftNo;
    private int weight;

    public CountPeople() {
    }

    public CountPeople(int liftNo, int weight) {
        this.liftNo = liftNo;
        this.weight = weight;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
