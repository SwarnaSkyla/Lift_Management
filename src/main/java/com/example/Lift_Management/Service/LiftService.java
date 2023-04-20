package com.example.Lift_Management.Service;


import com.example.Lift_Management.EntryDto.LiftEntryDto;
import com.example.Lift_Management.Models.Lift;
import com.example.Lift_Management.Repository.LiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiftService {
    @Autowired
    LiftRepository liftRepository;

    public String addLift(LiftEntryDto liftEntryDto){
        Lift lift=new Lift();
        lift.setLiftNo(liftEntryDto.getLiftNo());
        lift.setCapacity(liftEntryDto.getCapacity());
        lift.setNoOfPersons(liftEntryDto.getNoOfPersons());

        liftRepository.save(lift);
        return "Lift added successfully";

    }

    /*
    delete all passenegers with id less than 5

    find max no of people with wt X that cn travel in lift

    Find maxno of people with wt gretaer than 50 in given lift
     */

}
