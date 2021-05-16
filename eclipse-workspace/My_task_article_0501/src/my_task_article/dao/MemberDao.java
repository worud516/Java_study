package my_task_article.dao;


import java.util.ArrayList;
import java.util.List;

import my_task_article.dto.Member;

public class MemberDao {
	public List<Member> members;

	public MemberDao() {
		members = new ArrayList<>();
	}
}
