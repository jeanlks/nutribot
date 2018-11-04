package com.nutribot.nutribot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    private int questionNum;
    String[] possibleQuestions;
    String[] possibleAnswers;
}
