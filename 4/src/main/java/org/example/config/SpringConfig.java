package org.example.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@ComponentScan("org.example.service")
@EnableTransactionManagement
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class,JdbcConfig.class,})
public class SpringConfig {

}
