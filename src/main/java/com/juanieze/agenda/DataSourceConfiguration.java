package com.juanieze.agenda;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class DataSourceConfiguration {
	
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10371975?serverTimezone=UTC");
        dataSourceBuilder.username("sql10371975");
        dataSourceBuilder.password("NN3x5QMbH4");
        return dataSourceBuilder.build();
    }

}
