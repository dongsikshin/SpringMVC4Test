package com.mvc.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.reply.domain.Reply;
import com.mvc.reply.repository.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyDAO replyDAO;
		
	public void insert(Reply reply) {
		replyDAO.insert(reply);
	}
	
	public List selectAll(int board_id) {
		return replyDAO.selectAll(board_id);
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
