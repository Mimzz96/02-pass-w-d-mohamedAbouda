package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}

	@Test
	public void test2() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue(result.contains("#####################-- ANALYSIS OF THE INPUT DATA --#####################\n"));

	}

	@Test
	public void test3() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values1 = new ArrayList<>();
		ArrayList<String> values2 = new ArrayList<>();
		ArrayList<String> values3 = new ArrayList<>();
		ArrayList<String> values4 = new ArrayList<>();


		values1.addAll(Arrays.asList("GameName", "Name", "Aftername", "M", "24", "Stockholm"));
		String result1 = dataAnalysis.getResultStringNamesAndAge(values1);
		assertEquals(result1, "The first name is smaller or equals in size to the last name and the participant is 30 or younger");

		values2.addAll(Arrays.asList("GameName", "FirstName", "After", "M", "35", "Stockholm"));
		String result2 = dataAnalysis.getResultStringNamesAndAge(values2);
		assertEquals(result2, "The first name is greater or equals in size to the last name and the participant older than 30");

		values3.addAll(Arrays.asList("GameName", "Name", "Aftername", "M", "35", "Stockholm"));
		String result3 = dataAnalysis.getResultStringNamesAndAge(values3);
		assertEquals(result3, "No analysis was performed");

		values4.addAll(Arrays.asList("GameName", "FirstName", "After", "M", "24", "Stockholm"));
		String result4 = dataAnalysis.getResultStringNamesAndAge(values4);
		assertEquals(result4, "No analysis was performed");

	}
		@Test
	public void test4() {

			DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> values1 = new ArrayList<>();
			ArrayList<String> values2 = new ArrayList<>();
			ArrayList<String> values3 = new ArrayList<>();
			ArrayList<String> values4 = new ArrayList<>();


			values1.addAll(Arrays.asList("", "", "", "", "35", "city"));
			String result1 = dataAnalysis.getResulStringHomecityAndAge(values1);
			assertEquals(result1, "The name of the homecity is small and the participant is 30 or older");

			values2.addAll(Arrays.asList("", "", "", "", "24", "city"));
			String result2 = dataAnalysis.getResulStringHomecityAndAge(values2);
			assertEquals(result2, "The name of the homecity is small and the participant is younger than 30");

			values3.addAll(Arrays.asList("", "", "", "", "35", "citycity"));
			String result3 = dataAnalysis.getResulStringHomecityAndAge(values3);
			assertEquals(result3, "The name of the homecity is big and the participant is 30 or older");

			values4.addAll(Arrays.asList("", "", "", "", "24", "citycity"));
			String result4 = dataAnalysis.getResulStringHomecityAndAge(values4);
			assertEquals(result4, "The name of the homecity is big and the participant is younger than 30");

		}









}
