package com.test.boardstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value = "/write", method=RequestMethod.GET)
	public String boardWrite() {
		return "board/write";
	}
	
	// 게시글 작성
	@RequestMapping(value = "/write", method=RequestMethod.POST)
	public String boardWrite(Board board) {
		boardService.write(board);
		return "redirect:/board";
	}
	
	// 게시글 삭제
	@RequestMapping(value = "/delete/{no}", method=RequestMethod.POST)
	public String boardDelete(@PathVariable("no") Long no) {
		boardService.delete(no);
		return "redirect:/board";
	}
}
