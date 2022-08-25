package com.hutech.dailyexpenseinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hutech.dailyexpenseinfo.model.DailyExpense;
import com.hutech.dailyexpenseinfo.repository.DailyExpenseRepository;

@Service
public class DailyExpenseService {
	@Autowired
	DailyExpenseRepository dailyExpenseRepository;

	public List<DailyExpense> getAllExpense() {

		return dailyExpenseRepository.findAll();
	}

	public Optional<DailyExpense> getById(int id) {

		return dailyExpenseRepository.findById(id);
	}

	public DailyExpense save(DailyExpense dailyExp) {

		return dailyExpenseRepository.save(dailyExp);
	}

	public String deleteExpense(int id) {
		dailyExpenseRepository.deleteById(id);
		return "deleted";

	}

	public List<DailyExpense> findAll() {

		return dailyExpenseRepository.findAll();
	}

}
