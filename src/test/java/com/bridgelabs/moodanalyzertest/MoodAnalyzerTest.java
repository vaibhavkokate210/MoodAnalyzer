package com.bridgelabs.moodanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyze;

public class MoodAnalyzerTest 
{
	MoodAnalyze moodAnalyzer = new MoodAnalyze();

    @Test
    public void respondMood_Sad_Or_Happpy()
    {
        String result = moodAnalyzer.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY", result);
    }
}
