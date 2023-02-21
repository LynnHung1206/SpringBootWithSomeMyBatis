package tw.idv.lynn.web.member.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.idv.lynn.web.member.dao.MemberRepository;
import tw.idv.lynn.web.member.entity.Member;
import tw.idv.lynn.web.member.mapper.MemberMapper;
import tw.idv.lynn.web.member.service.MemberService;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
//	private MemberDao dao;
	private MemberRepository memberRepo;
	
	@Autowired
	private MemberMapper mapper;
	
	@Transactional
	@Override
	public Member register(Member member) {
//			beginTransaction();
		if (member.getUsername() == null) {
			member.setMessage("帳號未輸入");
			member.setSuccessful(false);
			throw new RuntimeException("帳號未輸入");
		}

		if (member.getPassword() == null) {
			member.setMessage("密碼未輸入");
			member.setSuccessful(false);
			throw new RuntimeException("密碼未輸入");
		}

		if (member.getNickname() == null) {
			member.setMessage("暱稱未輸入");
			member.setSuccessful(false);
			throw new RuntimeException("暱稱未輸入");
		}

		if (memberRepo.findByUsername(member.getUsername()) != null) {
			member.setMessage("帳號重複");
			member.setSuccessful(false);
			throw new RuntimeException("帳號重複");
		}

		member.setRoleId(2);
		member = memberRepo.save(member);
		if (member == null) {
			member = new Member();
			member.setMessage("註冊錯誤，請聯絡客服!");
			member.setSuccessful(false);
			throw new RuntimeException("註冊錯誤，請聯絡客服!");
		}

		member.setMessage("註冊成功");
		member.setSuccessful(true);
		return member;

	}
	@Transactional
	@Override
	public Member login(Member member) {
		final String username = member.getUsername();
		final String password = member.getPassword();

		if (username == null) {
			member.setMessage("帳號未輸入");
			member.setSuccessful(false);
			return member;
		}

		if (password == null) {
			member.setMessage("密碼未輸入");
			member.setSuccessful(false);
			return member;
		}

		member = memberRepo.selectForLogin(username, password);
		if (member == null) {
			member = new Member();
			member.setMessage("帳號或密碼錯誤");
			member.setSuccessful(false);
			return member;
		}

		member.setMessage("登入成功");
		member.setSuccessful(true);
		return member;
	}

	@Transactional
	@Override
	public Member edit(Member member) {
		final Member oMember = memberRepo.findByUsername(member.getUsername());
		member.setPass(oMember.getPass());
		member.setRoleId(oMember.getRoleId());
		member.setUpdater(member.getUsername());
		final int resultCount = memberRepo.update(member);
		member.setSuccessful(resultCount > 0);
		member.setMessage(resultCount > 0 ? "修改成功" : "修改失敗");
		return member;
	}

	@Override
	public List<Member> findAll() {
//		return memberRepo.findAll();
		return mapper.selectAll();
	}
	@Transactional
	@Override
	public boolean remove(Integer id) {

//			beginTransaction();
		memberRepo.deleteById(id);
		return true;
	}
	@Transactional
	@Override
	public boolean save(Member member) {
		return memberRepo.update(member) > 0;
	}

}
