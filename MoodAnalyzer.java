package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    //default constructor
    public MoodAnalyzer(){

    }

    //parameterize constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood () {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
