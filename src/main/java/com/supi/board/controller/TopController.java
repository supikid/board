package com.supi.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.supi.board.model.Question;
import com.supi.board.service.QuestionService;

@Controller
public class TopController {
	
	@Autowired
	private QuestionService qs;
	
	@GetMapping("/")
	public String index(Model model) {
		// 質問の取得
		List<Question> questions = qs.getQuestions(10, 0);
		model.addAttribute("questions", questions);
		// ビューの指定
		return "top";
	}
}
