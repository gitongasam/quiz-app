package com.devsam.quiz.app.Service;

import com.devsam.quiz.app.Entity.quiz;

import java.util.List;

public interface QuizServiceImpl {
    quiz savequiz(quiz quiz);

    List<quiz> getAll();
}
