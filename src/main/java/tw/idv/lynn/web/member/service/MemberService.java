package tw.idv.lynn.web.member.service;

import java.util.List;

import tw.idv.lynn.core.service.CoreService;
import tw.idv.lynn.web.member.entity.Member;

public interface MemberService extends CoreService{

	Member register(Member member);

	Member login(Member member);
	
	Member edit(Member member);
	
	List<Member> findAll();
	
	boolean remove(Integer id);
	
	boolean save(Member member);
}