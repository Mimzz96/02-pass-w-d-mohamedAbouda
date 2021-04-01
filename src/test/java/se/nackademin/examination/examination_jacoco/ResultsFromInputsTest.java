package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);

		resultsFromInputs.setResultForAge(0);
		assertEquals("The result should be 10", resultsFromInputs.getResultForAge(), 0);

		resultsFromInputs.setResultForGender(0);
		assertEquals("The result should be 10", resultsFromInputs.getResultForGender(), 0);

		resultsFromInputs.setResultForHomeCity(0);
		assertEquals("The result should be 10", resultsFromInputs.getResultForHomeCity(), 0);


	}
}
