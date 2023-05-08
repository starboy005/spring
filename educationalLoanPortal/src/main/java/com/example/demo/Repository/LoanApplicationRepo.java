package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
