package com.example.demo.therepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.theatrebooking;

public interface theatrerepository extends JpaRepository<theatrebooking, String> {

}