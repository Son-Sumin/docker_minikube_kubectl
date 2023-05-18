package com.test.boardstudy.controller;

import org.springframework.stereotype.Controller;

import com.test.boardstudy.service.BoardService;

@Controller
public class BoardController {
	private final BoardService boardService;
	
	private BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
}
