package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
/*
  //TC1.1: “I am in Sad Mood” message Should Return SAD
    @Test
    public void checkIfMessageShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals(result,"SAD");
    }
    //TC1.2: “I am in Any Mood” message Should Return HAPPY
    @Test
    public void checkIfMessageShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals(result,"HAPPY");
    }*/


    //Repeat TC 1.1 = “I am in Sad Mood” message in Constructor Should Return SAD
    @Test
    public void checkWhenMessageSADThenShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("SAD",mood);
    }


    //Repeat TC 1.2: “I am in Happy Mood” message in Constructor Should Return HAPPY

    @Test
    public void checkWhenMessageHAPPYThenShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

    //UC = Handle Exception if User Provides Invalid Mood - Like NULL
    //TC-2.1 = Given Null Mood Should Return Happy

    @Test
    public void giveNUllMoodItShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

}
