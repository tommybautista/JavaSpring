package com.codingdojo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	// adding the expense repository as a dependency
    private final ExpenseRepository repo;
    
    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }
    // returns all the expenses
    public List<Expense> all() {
        return repo.findAll();
    }
    // creates an expense
    public Expense create(Expense b) {
        return repo.save(b);
    }
    // updates an expense
    public Expense update(Expense b) {
        return repo.save(b);
    }
    // retrieves an expense
    public Expense find(Long id) {
        Optional<Expense> optional = repo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
    public void delete(Long id) {
    	repo.deleteById(id);
    }

}