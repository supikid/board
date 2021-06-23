package com.supi.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.supi.board.model.Question;

@Mapper
public interface QuestionMapper {
	// ユーザー情報取得
	public List<Question> findAll(int limit, int offset);
}
