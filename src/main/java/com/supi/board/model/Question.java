package com.supi.board.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Question {
	private int id;
	private String code;
	private String content;
	private int userId;
	private Timestamp postedAt;
	private Timestamp createdAt;
	private Timestamp updatedAt;

}
