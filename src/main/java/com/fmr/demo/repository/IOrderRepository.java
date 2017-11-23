package com.fmr.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;

public interface IOrderRepository {
	JdbcTemplate getTemplate();

	void saveOrder();
}