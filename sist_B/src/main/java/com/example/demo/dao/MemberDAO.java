
package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	public int insert() {
		System.out.println("등록하였습니다.");
		return 1;
	}
}
