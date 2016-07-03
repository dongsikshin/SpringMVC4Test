package com.mvc.reply.repository;

import java.util.List;

import javax.swing.GroupLayout.SequentialGroup;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.reply.domain.Reply;

@Repository
public class ReplyDAOMybatis implements ReplyDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	public void insert(Reply reply) {
		sqlSessionTemplate.insert("Reply.insert", reply);		
	}

	@Override
	public List selectAll(int board_id) {
		return sqlSessionTemplate.selectList("Reply.selectAll", board_id);
	}

	@Override
	public Reply select(int reply_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Reply reply) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int reply_id) {
		// TODO Auto-generated method stub
		
	}

}
