package com.codingdojo.savetravels2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.savetravels2.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long>{

}
