package com.hutech.dailyexpenseinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.dailyexpenseinfo.model.DailyExpense;
@Repository
public interface DailyExpenseRepository extends JpaRepository<DailyExpense, Integer> {

}
