package com.test.boardstudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.boardstudy.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
