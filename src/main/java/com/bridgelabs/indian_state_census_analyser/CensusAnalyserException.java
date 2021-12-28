package com.bridgelabs.indian_state_census_analyser;
@SuppressWarnings("serial")
public class CensusAnalyserException extends Exception{
	public ExceptionType type;

	public enum ExceptionType {
		WRONG_CSV_FILE_PATH
	}

	public CensusAnalyserException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
