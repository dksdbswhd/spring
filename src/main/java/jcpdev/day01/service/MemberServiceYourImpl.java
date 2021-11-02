package jcpdev.day01.service;

import jcpdev.day01.dao.MemberDao;
import jcpdev.dto.Member;

public class MemberServiceYourImpl implements MemberService{
	private MemberDao dao;

	public MemberServiceYourImpl(MemberDao dao) {
		System.out.println("MemberService유어Impl create ///////////////////");
		this.dao = dao;
	}    
		
		public Member findMember(int idx) {
		System.out.println("MemberService유어Impl findMember() ///////////////////");
			return dao.findMember(idx*10);
		}	
}
