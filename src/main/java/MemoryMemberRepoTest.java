import java.util.List;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.market.domain.Member;
import com.market.repository.MemberRepository;
import com.market.repository.MemoryMemberRepository;

class MemoryMemberRepoTest {

	
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach
	public void afterEach() {
		repository.clearStore();
	}
	
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("spring");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get();
//		Assertions.assertEquals(member, result);
//		Assertions.assertThat(member).isEqu
	}
	
	
	@Test
	public void findByName() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member2);
		
		repository.findByName("spring1");
		
		Member result = repository.findByName("spring1").get();
		
		assertThat(member1).isEqualTo(result);
//		Assertions.assertEquals(member1, result);
	}
	
	@Test
	public void findAll() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		
		Assertions.assertEquals(result.size(), 2);
		
	}

}
