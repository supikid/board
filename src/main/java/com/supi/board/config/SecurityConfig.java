package com.supi.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
				.antMatchers("/webjars/**") // セキュリティ対象外
				.antMatchers("/css/**") // セキュリティ対象外
				.antMatchers("/js/**") // セキュリティ対象外
				.antMatchers("/h2-console/**"); // セキュリティ対象外
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// ログイン要不要設定
		http.authorizeRequests()
				.antMatchers("/").permitAll() // ログイン不要
				.anyRequest().authenticated(); // ログイン必要

	}
}
