package com.bridgelabs.indian_state_census_analyser;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {
	public static final String CSV_FILE_PATH = "E:\\RFP_Java_80\\indian-state-censuse-analyser\\data\\IndiaStateCensusData.csv";
	public static final String WRONG_CSV_FILE_PATH = "E:\\RFP_Java_80\\indian-state-censuse-analyser\\data\\NoIndiaStateCensusData.json";

	@Test
	public void givenFilePathShouldReturnNumberOfRecords() {
		try {
			StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			int numOfRecords = censusAnalyser.loadIndiaCensusData(CSV_FILE_PATH);
			Assert.assertEquals(29, numOfRecords);
		} catch (CensusAnalyserException | IOException e) {

		}
	}

	@Test
	public void givenWrongFilePathShouldReturnCustomException() throws IOException, CensusAnalyserException {
			StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			int numOfRecords = censusAnalyser.loadIndiaCensusData(WRONG_CSV_FILE_PATH);
			Assert.assertEquals(29, numOfRecords);
		
	}
}
