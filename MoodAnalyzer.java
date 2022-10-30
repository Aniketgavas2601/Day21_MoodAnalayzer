package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    //default constructor
    public MoodAnalyzer() {
    }

    //parameterize constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyzeException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyzeException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyzeException(MoodAnalyzeException.ExceptionType.ENTER_EMPTY,"Please enter valid Message...");

            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzeException(MoodAnalyzeException.ExceptionType.ENTER_NULL,"Please enter valid Message...");
        }
    }
}
