package jcpdev.day01.dao;

import org.springframework.stereotype.Component;

import jcpdev.dto.Member;

@Component("memberDao")
public class MemberDaoImpl implements MemberDao {
	
	public MemberDaoImpl() {	//@Autowired 하려면 기본생성자가 필요합니다.
		
		System.out.println("MemberDaoImpl 기본생성자 create.///////////////////");
	}
	
	public MemberDaoImpl(String message) {
		//bean이 생성되는 순서를 확인하기 위해 작성한 출력문
		System.out.println("MemberDaoImpl create./////////////////");
		System.out.println(message);
	}
	
	public Member findMember(int idx) {
		System.out.println("MemberDaoImpl findMember()///////////////////");
		return new Member(idx,"honey@naver.com", "1212");
	}
	
}
