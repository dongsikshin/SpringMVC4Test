package com.mvc.reply.repository;

import java.util.List;

import com.mvc.reply.domain.Reply;

public interface ReplyDAO {
	public void insert(Reply reply);
	public List selectAll(int board_id);
	public Reply select(int reply_id);
	public void update(Reply reply);
	public void delete(int reply_id);	
}
