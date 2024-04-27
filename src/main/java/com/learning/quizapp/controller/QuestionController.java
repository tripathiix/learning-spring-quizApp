package com.learning.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question") // specifying the path
public class QuestionController {
    @GetMapping("allQuestions")
    public String getAllQuestions(){
        return "Hi, there are your questions";
    }

}
