/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author crist
 */
@Configuration
@ComponentScan("ro.telacad.*")
public class ProjectConfig {
    
    @Bean
    public DataSource dataSource(){ // folosim interfata ca abstractizare
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/spring_jdbc");
        dataSource.setUsername("root");
        dataSource.setPassword("852123");
        return dataSource;
    }
    
}
