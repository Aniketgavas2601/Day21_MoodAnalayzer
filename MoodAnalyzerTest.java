package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void checkIfMessageShouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = moodAnalyser.analyzeMood("I am in Sad Mood");
        Assert.assertEquals(result, "SAD");
    }
}
