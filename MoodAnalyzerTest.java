package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    //Repeat TC 1.1 = Given “I am in Sad Mood” message in Constructor Should Return SAD
    @Test
    public void checkWhenMessageSADThenShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("SAD",mood);
    }



    //Repeat TC 1.2 = Given “I am in Happy Mood” message in Constructor Should Return HAPPY

    @Test
    public void checkWhenMessageHAPPYThenShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
