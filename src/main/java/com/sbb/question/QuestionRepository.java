package com.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findFirstBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);
}
