package com.devsam.quiz.app.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Quiz;
}
