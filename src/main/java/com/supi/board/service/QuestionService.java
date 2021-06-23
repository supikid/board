package com.supi.board.service;

import java.util.List;

import com.supi.board.model.Question;

public interface QuestionService {

	public List<Question> getQuestions(int limit, int offset);

}
