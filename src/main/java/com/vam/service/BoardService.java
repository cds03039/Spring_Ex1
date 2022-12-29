package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {

	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
}
