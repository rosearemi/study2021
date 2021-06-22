package com.market.service;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.market.repository.JdbcMemberRepository;
import com.market.repository.JdbcTemplateMemberRepository;
import com.market.repository.MemberRepository;
import com.market.repository.MemoryMemberRepository;


@Configuration
public class SpringConfig {

	private final DataSource dataSource;

	public SpringConfig(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository());
	}

	@Bean
	public MemberRepository memberRepository() {
//		 return new MemoryMemberRepository();
//		return new JdbcMemberRepository(dataSource);
		 return new JdbcTemplateMemberRepository(dataSource);
	}
}
