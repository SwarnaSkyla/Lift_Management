package com.example.Lift_Management.EntryDto;

public class PersonEntry {

    private int personId;
    private int personWt;
    private int liftNo;

    public PersonEntry() {
    }

    public PersonEntry(int personId, int personWt, int liftNo) {
        this.personId = personId;
        this.personWt = personWt;
        this.liftNo = liftNo;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonWt() {
        return personWt;
    }

    public void setPersonWt(int personWt) {
        this.personWt = personWt;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }
}
