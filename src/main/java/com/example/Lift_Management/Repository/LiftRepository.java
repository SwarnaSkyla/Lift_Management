package com.example.Lift_Management.Repository;

import com.example.Lift_Management.Models.Lift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiftRepository extends JpaRepository<Lift,Integer> {
}
