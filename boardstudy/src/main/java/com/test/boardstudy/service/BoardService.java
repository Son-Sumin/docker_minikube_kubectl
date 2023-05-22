package com.test.boardstudy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.boardstudy.domain.Board;
import com.test.boardstudy.repository.BoardRepository;

@Service
@Transactional
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	// 게시글 리스트
	public List<Board> boardList() {
		return boardRepository.findAll();
	}

	// 게시글 작성 폼
	public Board boardView(Long no) {
		return boardRepository.findByNo(no);
	}

	// 게시글 작성
	public Board write(Board board) {
		return boardRepository.save(board);
	}

	// 게시글 삭제
	public void delete(Long no) {
		boardRepository.deleteByNo(no);
	}

	// 게시글 보기
	public Board view(Long no) {
		return boardRepository.findByNo(no);
	}
}
