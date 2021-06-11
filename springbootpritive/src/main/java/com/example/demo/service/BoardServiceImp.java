package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService{
	
	@Inject
	BoardDAO boardDAO;
	
	public List<BoardVO> boardAllRecord(){
		
		return boardDAO.boardAllRecord();
	}

	@Override
	public int boardWrite(BoardVO vo) {
		
		return boardDAO.boardWrite(vo);
	}

	@Override
	public BoardVO boardSelect(int no) {
		
		return boardDAO.boardSelect(no);
	}

	@Override
	public int boardEditOk(BoardVO vo) {
		
		return boardDAO.boardEditOk(vo);
	}

	@Override
	public int boardDelete(int no, String userid) {
		
		return boardDAO.boardDelete(no, userid);
	}
}
