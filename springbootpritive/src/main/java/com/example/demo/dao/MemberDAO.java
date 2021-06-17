package com.example.demo.dao;

import com.example.demo.vo.MemberVO;

public interface MemberDAO {
	//로그인
	public MemberVO loginCheck(MemberVO vo);
}
