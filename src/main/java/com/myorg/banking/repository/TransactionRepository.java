package com.myorg.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myorg.banking.models.BankTransaction;

@Repository
public interface TransactionRepository extends JpaRepository<BankTransaction , Long>{

}
