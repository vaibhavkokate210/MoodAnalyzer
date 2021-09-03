package com.bridgelabs.moodanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.ExceptionTypes;
import com.bridgelabz.moodanalyzer.MoodAnalysisException;
import com.bridgelabz.moodanalyzer.MoodAnalyze;

public class MoodAnalyzerTest 
{
	MoodAnalyze moodAnalyzer = new MoodAnalyze("I am happy");

    @Test
    public void respondMood_Sad_Or_Happpy()
    {
        String result=null;
		try 
		{
			result = moodAnalyzer.analyseMood();
		}
		catch (MoodAnalysisException e) 
		{
			
		     Assert.assertEquals(ExceptionTypes.NULL_VALUE, e.type);
		 }
    }
}
