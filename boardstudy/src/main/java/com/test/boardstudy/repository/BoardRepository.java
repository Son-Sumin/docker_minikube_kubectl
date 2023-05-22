package com.test.boardstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.boardstudy.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

	Board findByNo(Long no);

	void deleteByNo(Long no);

}
