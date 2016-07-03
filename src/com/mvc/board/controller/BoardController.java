package com.mvc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.board.domain.Board;
import com.mvc.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list.do")
	public String selectAll(Model model){
		
		List list=boardService.selectAll();
		model.addAttribute("list",list);
		
		return "board/list";
	}
	
	@RequestMapping("/detail.do")
	public String select(int board_id, Model model){
		Board board=boardService.select(board_id);
		model.addAttribute("board", board);
		return "board/detail";
	}
	
	
	@RequestMapping("/write.do")
	public String insert(){
		//System.out.println("insert() »£√‚µ !!");
		boardService.insert(null);
		
		return null;
	}
}







