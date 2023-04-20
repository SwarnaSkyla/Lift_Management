package com.example.Lift_Management.Controller;


import com.example.Lift_Management.EntryDto.CountPeople;
import com.example.Lift_Management.EntryDto.PersonEntry;
import com.example.Lift_Management.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Person")
public class PersonControl {

    @Autowired
    PersonService personService;


    @PostMapping("/add")
    public String addPerson(@RequestBody PersonEntry personEntry){
        return personService.addPerson(personEntry);

    }

    @DeleteMapping("/delete")
    public void deletePerson(@RequestParam("x") int x){
        personService.deletePerson(x);
    }
    @GetMapping("/get_count_in_lift")
    public int get_People_Lift(@RequestBody CountPeople countPeople){
        return personService.get_People_Lift(countPeople);
    }
    @GetMapping("get_no_by_X")
    public int getGreaterThanX(@RequestParam("x") int x,@RequestParam("lift") int lift){
        return personService.getGreaterThanX(x,lift);
    }
}
