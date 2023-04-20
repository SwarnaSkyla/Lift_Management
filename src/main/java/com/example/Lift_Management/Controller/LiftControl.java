package com.example.Lift_Management.Controller;


import com.example.Lift_Management.EntryDto.LiftEntryDto;
import com.example.Lift_Management.Service.LiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lift")
public class LiftControl {

    @Autowired
    LiftService liftService;

    @PostMapping("/add")
    public String addLift(@RequestBody LiftEntryDto liftEntryDto){
        return liftService.addLift(liftEntryDto);
    }


}
