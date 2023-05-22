package com.test.boardstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.boardstudy.domain.Board;
import com.test.boardstudy.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
    // 게시글 리스트
	@RequestMapping({"", "/list"})
	public String list(Model model) {
		model.addAttribute("boardList", boardService.getContentsList());
		return "board/list";
	}
	
	// 게시글 작성 폼
	@RequestMapping(value = "/board/write", method=RequestMethod.GET)
	public String boardWrite() {
		return "board/write";
	}
	
	// 게시글 작성
	@RequestMapping(value = "/board/write", method=RequestMethod.POST)
	public String boardWrite(Board board) {
		boardService.write(board);
		return "redirect:/board";
	}
}
