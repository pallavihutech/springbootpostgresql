package com.hutech.dailyexpenseinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hutech.dailyexpenseinfo.jsonresponse.DailyExpenseJsonResponse;
import com.hutech.dailyexpenseinfo.model.DailyExpense;
import com.hutech.dailyexpenseinfo.service.DailyExpenseService;

@RestController

public class DailyExpenseController {
	@Autowired
	DailyExpenseService dailyExpenseService;

	@GetMapping("/expense")
	public List<DailyExpense> getExpense() {
		return dailyExpenseService.findAll();

	}

	@GetMapping("/expense/{id}")
	public Optional<DailyExpense> getExpenseById(@PathVariable int id) {
		return dailyExpenseService.getById(id);
	}

	@PostMapping("/createExp")
	public ResponseEntity<DailyExpense> saveExpense(@RequestBody DailyExpense dailyExp) {
		return new ResponseEntity<DailyExpense>(dailyExpenseService.save(dailyExp), HttpStatus.CREATED);

	}
//	@PutMapping("/updateExpense")
//	public ResponseEntity<DailyExpense> updateExpense(@RequestBody DailyExpense dailyExp)
//	{
//		return new ResponseEntity<DailyExpense>(dailyExpenseService.save(dailyExp),HttpStatus.ACCEPTED);
//		
//	}
	@DeleteMapping("/deleteExpense/{id}")
	public  DailyExpenseJsonResponse deleteExpense(@PathVariable int id)
	{
		  dailyExpenseService.deleteExpense(id);
		  return new DailyExpenseJsonResponse("Expense deleted",200);
		
	}
	@PutMapping("/update")
	public DailyExpenseJsonResponse updateExpense(@RequestBody DailyExpense dailyExpense)
	{
		dailyExpenseService.save(dailyExpense);
		return new DailyExpenseJsonResponse("Expense table updated Successfully",300);
		
	}
}