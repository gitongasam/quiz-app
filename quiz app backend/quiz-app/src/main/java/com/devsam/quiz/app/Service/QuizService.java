package com.devsam.quiz.app.Service;


import com.devsam.quiz.app.Entity.Comment;
import com.devsam.quiz.app.Entity.Quiz;
import com.devsam.quiz.app.Repository.CommentRepository;
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
    @Autowired
    private CommentRepository commentRepository;


    @Override
    public List<Quiz> getAll() {
        return quizRepository.findAll();
    }

    @Override
    public void deleteAllQuizzes() {
        List<Comment> comments = commentRepository.findAll();
        commentRepository.deleteAll(comments);

        // Then delete the quiz
        quizRepository.deleteAll();
    }


    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }
}
