package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
     /*//TC1.1: “I am in Sad Mood” message Should Return SAD
    @Test
    public void checkIfMessageShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals(result,"SAD");
    }
    //TC1.2: “I am in Any Mood” message Should Return HAPPY
    @Test
    public void checkIfMessageShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals(result,"HAPPY");
    }*/


    //Repeat TC 1.1: “I am in Sad Mood” message in Constructor Should Return SAD
   /* @Test
    public void checkWhenMessageSADThenShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
    //Repeat TC 1.2 = Given “I am in Happy Mood” message in Constructor Should Return HAPPY
    @Test
    public void checkWhenMessageHAPPYThenShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    //UC = Handle Exception if User Provides Invalid Mood - Like NULL
    //TC-2.1: Null Mood Should Return Happy
    @Test
    public void giveNUllMoodItShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("HAPPY",mood);
    }
    */

    //TC 3.1: NULL Mood Should Throw MoodAnalysisException
    @Test
    public void giveNullMoodShouldThrowException() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalyzeException e) {
            Assert.assertEquals("Please enter valid Message...",e.getMessage());
        }
    }
}
