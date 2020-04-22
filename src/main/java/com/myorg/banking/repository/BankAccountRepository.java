package com.myorg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myorg.banking.models.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount , Long>{
	
	@Query(value = "select * from bank_account where cardnumber =?1, ntiveQuery = true")
	Optional<BankAccount> findByCardNumber(Long cardnumber);

}
