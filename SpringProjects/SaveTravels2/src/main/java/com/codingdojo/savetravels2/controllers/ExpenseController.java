package com.codingdojo.savetravels2.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.savetravels2.models.Expense;
import com.codingdojo.savetravels2.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;

	
	@GetMapping("/")
	public String index( ) {
		return "redirect:/savetravels";
	}
	
	@GetMapping("/savetravels")
	public String dashboard(@ModelAttribute("expense") Expense expense, Model model) {
		
		List<Expense> expenses = expenseService.allExpenses();
		
		model.addAttribute("expenses", expenses);

		return "index.jsp";
	}
	
	@GetMapping("/savetravels/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		
		Expense expense = expenseService.findExpense(id);
		
		model.addAttribute("expense", expense);

		return "show.jsp";
	}
	
	@PostMapping("/savetravels/submit")
	public String submit(
			@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result) {
        if (result.hasErrors()) {
            return "error.jsp";
        } else {
            expenseService.createExpense(expense);
            return "redirect:/savetravels";
        }
	}
	
	@GetMapping("/savetravels/create")
	public String create() {
		return "index.jsp";
	}
	
	@GetMapping("/error")
	public String error() {
		return "error.jsp";
	}
	
	@GetMapping("/savetravels/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model ) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PutMapping("/savetravels/{id}")
    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "error.jsp";
        } else {
            expenseService.updateExpense(expense);
            return "redirect:/savetravels";
        }
    }
	
	@DeleteMapping("/savetravels/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/savetravels";
	}

}
