package com.supi.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supi.board.model.Question;
import com.supi.board.repository.QuestionMapper;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionMapper mapper;

	@Override
	public List<Question> getQuestions(int limit, int offset) {
		return mapper.findAll(limit, offset);
	}
}
