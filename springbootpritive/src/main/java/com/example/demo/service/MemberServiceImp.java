package com.example.demo.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDAO;
import com.example.demo.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{
	
	@Inject
	MemberDAO memberDAO;
	
	public MemberVO loginCheck(MemberVO vo) {
		
		return memberDAO.loginCheck(vo);
	}

}
