package com.test.boardstudy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "board")
@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	private String title;
	private String contents;
	private long hit;
}
