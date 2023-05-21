package com.test.boardstudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.boardstudy.domain.Board;
import com.test.boardstudy.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	public List<Board> getContentsList() {
		return boardRepository.findAll();
	}

	public Board boardView(Long no) {
		return boardRepository.findByNo(no);
	}

	public Board write(Board board) {
		return boardRepository.save(board);
		
	}
}
