package com.bridgelabz.moodanalyzer;

public class MoodAnalyze 
{
	public String analyseMood(String message)
	{
        if (message.toLowerCase().contains("happy"))
            return "happy";
        else if (message.toLowerCase().contains("sad"))
            return "sad";
        else
            return "happy";
    }
}
