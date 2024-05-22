package com.devsam.quiz.app.Repository;

import com.devsam.quiz.app.Entity.Quiz;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
    @EntityGraph(attributePaths = {"comments"})
    List<Quiz> findAll();
}
