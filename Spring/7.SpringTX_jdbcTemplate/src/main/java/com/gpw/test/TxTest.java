package com.gpw.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.gpw.bean.Employee;
import com.gpw.dao.EmployeeDao;

public class TxTest {
	
	ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
	JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);

	@Test
	public void test() throws SQLException {
		DataSource bean = ioc.getBean(DataSource.class);
		Connection connection = bean.getConnection();
		System.out.println(connection);
		connection.close();
		
	}
	
	@Test
	public void test01() throws SQLException {
		System.out.println(jdbcTemplate);
	}
}
