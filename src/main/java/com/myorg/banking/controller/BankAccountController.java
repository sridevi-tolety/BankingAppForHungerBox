package com.myorg.banking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.banking.models.BankAccount;
import com.myorg.banking.models.BankTransaction;
import com.myorg.banking.repository.BankAccountRepository;
import com.myorg.banking.repository.TransactionRepository;

@RestController
@RequestMapping("/banking")
public class BankAccountController {
	
	@Autowired
	BankAccountRepository brep;
	
	@Autowired
	TransactionRepository trep;
	
	@GetMapping("/getAllUsers")
	public List<BankAccount> getAllUsers(){
		return brep.findAll();
	}
	
	@PostMapping("/registerUser")
	public BankAccount registerUser(@RequestBody BankAccount user){
		System.out.println(Math.random());
		BankAccount savedAcct = brep.save(user);
		return savedAcct;		
	}
	
	@PostMapping("/makeTransaction")
	public BankTransaction makeTransaction(@RequestBody BankTransaction trans){		
		BankTransaction t = trep.save(trans);
		return t;		
	}
	
	@GetMapping("/lastTransactions/{accountnumber}/{numberoftransactions}")
	public List<BankTransaction> getLastTransactions(@PathVariable Long accountnumber, @PathVariable int numberoftransactions){
		return null;
	}
	
	@GetMapping("transStatement/{accountnumber}")
	public List<BankTransaction> getStatement(@PathVariable Long accountNumber){		
		return null;		
	}
	
	@GetMapping("/getTransactions")
	public List<BankTransaction> getTransactions(){
		return trep.findAll();
	}
	
	@GetMapping("/checkCardNumber/{cardnumber}")
	public boolean checkCardNumber(@PathVariable Long cardnumber){
		Optional<BankAccount> ba =brep.findByCardNumber(cardnumber);
		return ba.isPresent()?true : false;
	}
	

}
