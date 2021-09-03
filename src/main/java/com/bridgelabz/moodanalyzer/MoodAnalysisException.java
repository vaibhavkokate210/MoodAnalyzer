package com.bridgelabz.moodanalyzer;

public class MoodAnalysisException extends Exception 
{
	public ExceptionTypes type;
	public MoodAnalysisException(String message,ExceptionTypes types) 
	{
		super(message);
		this.type=types;
	}
}
