package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> boardAllRecord();

	public int boardWrite(BoardVO vo);
	
	public BoardVO boardSelect(int no);

	public int boardEditOk(BoardVO vo);

	public int boardDelete(int no, String id);
}
