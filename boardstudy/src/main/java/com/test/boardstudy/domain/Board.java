package com.test.boardstudy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.test.boardstudy.base.BaseTimeEntity;

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
public class Board extends BaseTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	private String title;
	private String contents;
	private Long hit;
}
