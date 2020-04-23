package com.jmc.springsecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {

		List<UserDetails> users = new ArrayList<>();
		
		UserDetails u1 = User.withDefaultPasswordEncoder().username("jcvd9").password("root").roles("USER").build();
		UserDetails u2 = User.withDefaultPasswordEncoder().username("jimin").password("gold").roles("USER").build();
		UserDetails u3 = User.withDefaultPasswordEncoder().username("jiminC").password("silver").roles("USER").build();
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		return new InMemoryUserDetailsManager(users);

		/*
		users.add(User.withDefaultPasswordEncoder().username("kindson").password("root").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("jadon").password("pass").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("solace").password("pass").roles("USER").build());
		
		return new InMemoryUserDetailsManager(users);
		*/
		
	}
	
	
}
	
	

