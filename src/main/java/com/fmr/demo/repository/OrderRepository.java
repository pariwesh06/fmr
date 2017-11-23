package com.fmr.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository implements IOrderRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public JdbcTemplate getTemplate() {
		return jdbcTemplate;
	}

	@Override
	public void saveOrder() {
		jdbcTemplate.execute("INSERT INTO ORDER1  VALUES(1,'LAPTOP')");
	}
}
