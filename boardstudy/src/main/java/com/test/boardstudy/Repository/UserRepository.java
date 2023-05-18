package com.test.boardstudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.boardstudy.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
