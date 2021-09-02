package com.bridgelabs.moodanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyze;

public class MoodAnalyzerTest 
{
	MoodAnalyze moodAnalyzer = new MoodAnalyze(null);

    @Test
    public void respondMood_Sad_Or_Happpy()
    {
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("happy", result);
    }
}
