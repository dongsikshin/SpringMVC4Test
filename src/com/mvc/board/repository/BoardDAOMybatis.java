package com.mvc.board.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.board.domain.Board;

@Repository
public class BoardDAOMybatis implements BoardDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List selectAll() {
		return sqlSessionTemplate.selectList("Board.selectGroup");
	}

	@Override
	public Board select(int board_id) {
		return sqlSessionTemplate.selectOne("Board.selectOne", board_id);
	}

	@Override
	public void insert(Board board) {
		sqlSessionTemplate.insert("Board.insert", board);
	}

	@Override
	public void update(Board board) {
		sqlSessionTemplate.update("Board.update", board);
	}

	@Override
	public void delete(int board_id) {
		sqlSessionTemplate.delete("Board.delete", board_id);		
	}

}
