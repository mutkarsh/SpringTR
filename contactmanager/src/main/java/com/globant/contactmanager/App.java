package com.globant.contactmanager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.globant.contactmanager","com.globant.contactmanager.dao","com.globant.contactmanager.facade","com.globant.contactmanager.service","com.globant.contactmanager.model"} )
public class App 
{
    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
    	DriverManagerDataSource ds = new DriverManagerDataSource();
    	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	ds.setUrl("jdbc:mysql://localhost/globantdb");
    	ds.setUsername("root");
    	ds.setPassword("root");
    	return ds;
    }
    
    @Bean
    public JdbcTemplate getTemplate() {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
    	jdbcTemplate.setDataSource(dataSource());
    	return jdbcTemplate;
    }
}
