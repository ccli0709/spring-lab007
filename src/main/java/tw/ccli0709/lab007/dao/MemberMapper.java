package tw.ccli0709.lab007.dao;

import java.util.List;
import tw.ccli0709.lab007.entity.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    Member selectByPrimaryKey(Long id);

    List<Member> selectAll();

    int updateByPrimaryKey(Member record);
}