package com.devsam.quiz.app.Repository;

import com.devsam.quiz.app.Entity.quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<quiz,Long> {
}
