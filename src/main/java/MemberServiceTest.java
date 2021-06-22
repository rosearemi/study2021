//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.fail;
//import static org.junit.jupiter.api.Assertions.fail;
//
//import org.junit.jupiter.api.Test;
//
//import com.market.domain.Member;
//import com.market.service.MemberService;
//
//public class MemberServiceTest {
//	
//	MemberService memberService = new MemberService();
//	
//	@Test
//	void 회원가입() {
//		//given
//		Member member = new Member();
//		member.setName("Hello");
//		
//		//when
//		Long saveId = memberService.join(member);
//		
//		//then
//		Member findMember = memberService.findOne(saveId).get();
//		assertThat(member.getName()).isEqualTo(findMember.getName());
//	}
//	
//	@Test
//	public void 중복_회원_예외() {
//		Member member1 = new Member();
//		member1.setName("spring");
//	
//		Member member2 = new Member();
//		member2.setName("spring");
//		
//		memberService.join(member1);
//		try {
//			memberService.join(member2);
//			fail();
//		} catch (IllegalStateException e) {
//			assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원이빈다.");
//		}
//	}
//	
//	
//	@Test
//	void findMembers() {
//		
//	}
//	
//	@Test
//	void findOne() {
//		
//	}
//	
//}
