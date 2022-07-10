package com.codingdojo.savetravels2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.savetravels2.models.Expense;
import com.codingdojo.savetravels2.repositories.ExpenseRepo;

@Service
public class ExpenseService {

    private final ExpenseRepo expenseRepo;
    
    public ExpenseService(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }
    
    public List<Expense> allExpenses() {
        return (List<Expense>) expenseRepo.findAll();
    }
    // creates a expense
    public Expense createExpense(Expense b) {
        return expenseRepo.save(b);
    }
    // retrieves a expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepo.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    
    // updateExpense will take in a Expense object and save it to our database
    // our repository will automatically update an existing Expense object if their IDs match
    public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
    // to delete a expense, we simply pass in the expense ID and if our repository finds it, the expense will be deleted
	public void deleteExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			expenseRepo.deleteById(id);
		}
	}

}
