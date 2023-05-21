package com.test.boardstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.boardstudy.domain.Board;
import com.test.boardstudy.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
//  게시글 리스트
	@GetMapping({"", "/list"})
	public String list(Model model) {
		model.addAttribute("boardList", boardService.getContentsList());
		return "board/list";
	}
	
//	게시글 작성 폼
	@GetMapping("/board/write")
	public String boardWriteForm(Board board) {
		return "board/write";
	}
	
//	게시글 작성
	@PostMapping("/board/write")
	public Board boardWrite(@ModelAttribute Board board) {
		board.setHit(0L);
		return boardService.boardView(board.getNo());
	}
}
