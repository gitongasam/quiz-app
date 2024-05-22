package com.devsam.quiz.app.Service;

import com.devsam.quiz.app.Entity.Comment;
import com.devsam.quiz.app.Entity.Quiz;
import com.devsam.quiz.app.Repository.CommentRepository;
import com.devsam.quiz.app.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private QuizRepository quizRepository;

    public Comment saveComment(Long quizId, Comment comment) {
        Quiz quiz = quizRepository.findById(quizId).orElseThrow(() -> new RuntimeException("Quiz not found"));
        comment.setQuiz(quiz);
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByQuizId(Long quizId) {
        return commentRepository.findAllByQuizId(quizId);
    }
}
