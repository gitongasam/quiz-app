package com.devsam.quiz.app.Controller;

import com.devsam.quiz.app.Entity.quiz;
import com.devsam.quiz.app.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
@CrossOrigin 
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/save")
    public quiz quiz(@RequestBody quiz quiz){
        return quizService.savequiz(quiz);
    }

    @GetMapping("/all")
    public List<quiz> getAllQuiz(){
        return quizService.getAll();
    }
}
