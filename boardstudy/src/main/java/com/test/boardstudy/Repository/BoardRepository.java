package com.test.boardstudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.boardstudy.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
