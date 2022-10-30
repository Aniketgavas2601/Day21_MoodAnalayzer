package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    //TC1.1: “I am in Sad Mood” message Should Return SAD
    @Test
    public void checkIfMessageShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyzeMood("I am in Sad Mood");
        Assert.assertEquals(result,"SAD");
    }

    //TC1.2: “I am in Any Mood” message Should Return HAPPY
    @Test
    public void checkIfMessageShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyzeMood("I am in Any Mood");
        Assert.assertEquals(result,"HAPPY");
    }
}
