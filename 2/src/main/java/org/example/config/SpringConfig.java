package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.example.service")
@EnableTransactionManagement
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class,JdbcConfig.class})
public class SpringConfig {

}
