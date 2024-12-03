package com.hibernate.pr.service;

import com.hibernate.pr.entity.Question;
import com.hibernate.pr.repo.QuestionRepo;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepo questionRepo;

    public Question saveQuestion(Question question){
        Question questionSave = questionRepo.save(question);
        return questionSave;
    }

    public Question getQuestion(int id){
        Optional<Question> questionOptional = questionRepo.findById(id);
        return questionOptional.get();
    }

    public void deleteQuestion(int id){
        questionRepo.findById(id).ifPresent(question -> {
            questionRepo.deleteById(id);
        });
    }
}
