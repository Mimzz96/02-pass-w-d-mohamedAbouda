package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);

		int i2 = game.calculateOutPutBasedOnNames("Silva", "Rafael");
		assertEquals("The result should be 0", i2, 0);

		int i3 = game.calculateOutPutBasedOnNames("Silva", "Silva");
		assertEquals("The result should be 2", i3, 2);
	}

	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals(i,0);

		int i2 = game.calculateOutPutBasedOnGender('F');
		assertEquals(i2,1);

		int i3 = game.calculateOutPutBasedOnGender('A');
		assertEquals(i3,2);

	}

	@Test
	public void testMethod3(){

		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(24);
		assertEquals(i,0);

		int i2 = game.calculateOutPutBasedOnAge(35);
		assertEquals(i2,1);

	}

	@Test
	public void testMethod4(){
		Game game = new Game();
		int i0 = game.calculateOutPutBasedOnHomeCity("Acity");
		assertEquals(i0,0);

		int i1 = game.calculateOutPutBasedOnHomeCity("Bcity");
		assertEquals(i1,1);

		int i2 = game.calculateOutPutBasedOnHomeCity("Ccity");
		assertEquals(i2,2);

		int i3 = game.calculateOutPutBasedOnHomeCity("Dcity");
		assertEquals(i3,3);

		int i4 = game.calculateOutPutBasedOnHomeCity("Ecity");
		assertEquals(i4,4);

		int i5 = game.calculateOutPutBasedOnHomeCity("Fcity");
		assertEquals(i5,5);

		int i6 = game.calculateOutPutBasedOnHomeCity("Gcity");
		assertEquals(i6,6);

		int i7 = game.calculateOutPutBasedOnHomeCity("Hcity");
		assertEquals(i7,7);

		int i8 = game.calculateOutPutBasedOnHomeCity("Icity");
		assertEquals(i8,8);

		int i9 = game.calculateOutPutBasedOnHomeCity("Jcity");
		assertEquals(i9,9);

		int i10 = game.calculateOutPutBasedOnHomeCity("Mcity");
		assertEquals(i10,10);

	}

	@Test
	public void testMethod5(){

		Game game = new Game();
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(0);
		resultsFromInputs.setResultForNameLenght(1);
		resultsFromInputs.setResultForGender(0);
		resultsFromInputs.setResultForHomeCity(0);

		Conversor conversor = new Conversor();
		game.buildFinalString("firstname", "lastname", resultsFromInputs, conversor );

	}

	@Test
	public void testMethod6(){
		Game game = new Game();
		game.runGame("GTA","first","last",'M', 24, "Stockholm");

	}

	@Test
	public void testMethod7(){

		Game game = new Game();
		ArrayList<String> values1 = new ArrayList<>();
		values1.addAll(Arrays.asList("GameName", "Name", "Aftername", "M", "24", "Stockholm"));
		game.run(values1);

	}

	@Test
	public void testMethod8(){
		Game game = new Game();
		ArrayList<String> values1 = new ArrayList<>();
		values1.addAll(Arrays.asList("GameName", "Name", "Aftername", "M", "24", "Stockholm"));
		char result = game.getGenderFromInputValues(values1);
		assertEquals(result, 'M');

	}

	@Test
	public void testMethod9() {
		Game game = new Game();
		ArrayList<String> values1 = new ArrayList<>();
		values1.addAll(Arrays.asList("GameName", "Name", "Aftername", "M", "24", "Stockholm"));
		int result = game.getAgeFromInputValues(values1);
		assertEquals(result, 24);


	}



}
