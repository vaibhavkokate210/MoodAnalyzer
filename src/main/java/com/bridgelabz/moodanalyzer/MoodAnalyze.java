package com.bridgelabz.moodanalyzer;

public class MoodAnalyze 
{
	String message;
	public MoodAnalyze()
	{
		
	}
	public MoodAnalyze(String message)
	{
		this.message=message;
	}
	public String analyseMood()
	{
		try
		{
        if (message.toLowerCase().contains("happy"))
            return "happy";
        else if (message.toLowerCase().contains("sad"))
            return "sad";
        else
            return "happy";
		}
		catch(NullPointerException ne)
		{
			return null;
		}
    }
}
