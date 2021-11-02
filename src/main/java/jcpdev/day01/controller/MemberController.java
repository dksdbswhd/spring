package jcpdev.day01.controller;

import jcpdev.day01.service.MemberService;
import jcpdev.dto.Member;

public class MemberController {
	private MemberService service;

	public MemberController(MemberService service) {
		//생성자에서 의존관계 주입
		//인터페이스 타입인 이유 : 필요와 상황에 따라 구현체를 다르게 주입할 수 있다.
		System.out.println("MemberController create./////////");
		this.service = service;
	}   
    
	public Member findMember(int idx) {
		return service.findMember(idx);
	}
	
}
