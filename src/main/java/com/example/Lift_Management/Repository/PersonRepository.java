package com.example.Lift_Management.Repository;

import com.example.Lift_Management.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {


    @Query(value="delete from person p where p.id<x ",nativeQuery = true)
    void deletePerson(int x);

}
