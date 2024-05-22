package com.devsam.quiz.app.Service;

import com.devsam.quiz.app.Entity.Quiz;

import java.util.List;

public interface QuizServiceImpl {
    Quiz savequiz(Quiz quiz);

    List<Quiz> getAll();



    void deleteAllQuizzes();
}
