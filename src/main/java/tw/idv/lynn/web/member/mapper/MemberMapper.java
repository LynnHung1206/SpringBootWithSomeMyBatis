package tw.idv.lynn.web.member.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import tw.idv.lynn.web.member.entity.Member;

@Mapper
public interface MemberMapper {
	List<Member> selectAll();
}
