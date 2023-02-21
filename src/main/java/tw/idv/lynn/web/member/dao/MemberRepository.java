package tw.idv.lynn.web.member.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tw.idv.lynn.web.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> , MemberOperation{

	Member findByUsername(String username);
	Member findByUsernameAndPassword(String username,String password);
//	上下一樣
	@Query(value = "SELECT * FROM MEMBER WHERE USERNAME = :username AND PASSWORD = :password",
			nativeQuery = true)
	Member selectForLogin(String username,String password);
	
}
