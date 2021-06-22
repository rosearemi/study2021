package com.market.repository;

//import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.market.domain.Member;

class MemoryMemberRepositoryTest {
	
	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("spring");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get();
		Assertions.assertEquals(member, null);
	}
	
}
