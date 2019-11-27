package com.ramesh.examples.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ramesh.examples.main.model.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {

	public List<Expense> findByItem(String item);
	
	@Query("Select e from Expense  e where e.amount >= :amount")
	public List<Expense> listItemsWithPriceOver(@Param("amount")float amount);
}
