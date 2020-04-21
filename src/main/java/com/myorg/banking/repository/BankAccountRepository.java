package com.myorg.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myorg.banking.models.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount , Long>{

}
