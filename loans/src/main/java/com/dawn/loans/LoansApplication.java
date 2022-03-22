package com.dawn.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@RefreshScope
@ComponentScans({@ComponentScan("com.dawn.loans.controller")})
@EnableJpaRepositories("com.dawn.loans.repository")
@EntityScan("com.dawn.loans.model")
public class LoansApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoansApplication.class, args);
  }
}
