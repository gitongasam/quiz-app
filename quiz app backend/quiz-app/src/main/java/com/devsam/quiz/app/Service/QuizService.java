package com.devsam.quiz.app.Service;


import com.devsam.quiz.app.Entity.quiz;
import com.devsam.quiz.app.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService implements QuizServiceImpl{
    @Autowired
    private QuizRepository quizRepository;
    @Override
    public quiz savequiz(quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<quiz> getAll() {
        return quizRepository.findAll();
    }
}
