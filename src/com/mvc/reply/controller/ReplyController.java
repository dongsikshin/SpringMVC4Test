package com.mvc.reply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.reply.domain.Reply;
import com.mvc.reply.service.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	//´ñ±Û µî·Ï 
	@RequestMapping("/regist.do")
	public @ResponseBody String regist(Reply reply){
		
		replyService.insert(reply);
		
		return "ok";
	}
	
	//´ñ±Û¸ñ·Ï!!
	@RequestMapping("/list.do")
	public @ResponseBody List selectAll(int board_id){
		List list=replyService.selectAll(board_id);
		return list;
	}
	
	/*
	@RequestMapping("/list.do")
	public String selectAll(Model model, int board_id){
		List list=replyService.selectAll(board_id);
		model.addAttribute("list", list);
		return "board/replyList";
	}
 */	
}





