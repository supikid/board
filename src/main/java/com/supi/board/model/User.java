package com.supi.board.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name;
	private Timestamp createdAt;
	private Timestamp updatedAt;
}
