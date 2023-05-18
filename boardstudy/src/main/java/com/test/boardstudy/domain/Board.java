package com.test.boardstudy.domain;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	private String title;
	private String contents;
	private Long hit;
	
	@ManyToOne
	@JoinColumn(name="member_no")
	private Member member;
}
