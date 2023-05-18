package com.test.boardstudy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.boardstudy.Repository.BoardRepository;

@Service
@Transactional
public class BoardService {
	private final BoardRepository boardRepository;
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
}
