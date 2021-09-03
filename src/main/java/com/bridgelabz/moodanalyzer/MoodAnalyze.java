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
	public String analyseMood() throws MoodAnalysisException
	{
		if(message==null)
		{
			throw new MoodAnalysisException("NULL_VALUE",ExceptionTypes.NULL_VALUE);
		}
        if (message.toLowerCase().contains("happy"))
            return "happy";
        else if (message.toLowerCase().contains("sad"))
            return "sad";
        else
            return "happy";
	}
		
    
}
