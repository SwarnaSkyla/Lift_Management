package com.example.Lift_Management.EntryDto;

public class LiftEntryDto {
    private int liftNo;

    private int capacity;

    private int noOfPersons;

    public LiftEntryDto() {
    }

    public LiftEntryDto(int liftNo, int capacity, int noOfPersons) {
        this.liftNo = liftNo;
        this.capacity = capacity;
        this.noOfPersons = noOfPersons;
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
}
