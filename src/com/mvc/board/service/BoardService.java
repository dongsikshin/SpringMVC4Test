package com.mvc.board.service;

import java.util.List;

import com.mvc.board.domain.Board;

public interface BoardService {
	public void insert(Board board);
	public List selectAll();
	public Board select(int board_id);
	public void update(Board board);
	public void delete(int board_id);
	
}
