package com.devsam.quiz.app.Controller;

import com.devsam.quiz.app.Entity.Comment;
import com.devsam.quiz.app.Entity.Quiz;
import com.devsam.quiz.app.Service.CommentService;
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
    @Autowired
    private CommentService commentService;

    @PostMapping("/save")
    public Quiz saveQuiz(@RequestBody Quiz quiz) {
        return quizService.savequiz(quiz);
    }

    @GetMapping("/all")
    public List<Quiz> getAllQuiz() {
        return quizService.getAll();
    }
    @PostMapping("/quiz/{quizId}/comment/save")
    public Comment saveComment(@PathVariable Long quizId, @RequestBody Comment comment) {
        return commentService.saveComment(quizId, comment);
    }

    @GetMapping("/quiz/{quizId}/comments")
    public List<Comment> getCommentsByQuizId(@PathVariable Long quizId) {
        return commentService.getCommentsByQuizId(quizId);
    }

    @DeleteMapping("/delete")
    public void deleteAllQuizzes() {
        quizService.deleteAllQuizzes();
    }

}
