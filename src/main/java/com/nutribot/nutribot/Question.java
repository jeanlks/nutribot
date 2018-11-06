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
    protected int questionNum;
    protected String[] possibleQuestions;
    protected String[] possibleAnswers;
    protected String[] imageLocation;

    public Question(int questionNum, String[] possibleQuestions, String[] possibleAnswers) {
        this.questionNum = questionNum;
        this.possibleQuestions = possibleQuestions;
        this.possibleAnswers = possibleAnswers;
    }

    public Question(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}
