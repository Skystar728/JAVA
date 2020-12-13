package member;

import java.util.HashMap;

public interface MemberService {
	boolean member_insert(MemberVO vo);
	MemberVO member_select(String id);
	MemberVO member_login(HashMap<String, String> map);
	boolean member_id_check(String id);
	boolean member_update(MemberVO vo);
	boolean member_delete(String id);
}