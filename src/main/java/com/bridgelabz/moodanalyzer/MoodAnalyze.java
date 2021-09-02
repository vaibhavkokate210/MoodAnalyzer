package com.bridgelabz.moodanalyzer;

public class MoodAnalyze 
{
	public String analyseMood(String message)
	{
        if (message.toLowerCase().contains("happy"))
            return "HAPPY";
        else if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
