package com.bridgelabz.moodanalyzer;

public class MoodAnalyzeException extends Exception{
    enum ExceptionType {
        ENTER_NULL, ENTER_EMPTY
    }
    ExceptionType type;

    public MoodAnalyzeException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
