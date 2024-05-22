package com.devsam.quiz.app.Service;


import com.devsam.quiz.app.Entity.Quiz;
import com.devsam.quiz.app.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService implements QuizServiceImpl{
    @Autowired
    private QuizRepository quizRepository;
    @Override
    public Quiz savequiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        return quizRepository.findAll();
    }
    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }
}
