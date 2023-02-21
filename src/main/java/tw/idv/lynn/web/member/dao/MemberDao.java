package tw.idv.lynn.web.member.dao;

import tw.idv.lynn.core.dao.CoreDao;
import tw.idv.lynn.web.member.entity.Member;

public interface MemberDao extends CoreDao<Member, Integer> {
	
	Member selectByUsername(String username);
	
	Member selectForLogin(String username, String password);
}
