package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class ConversorTest {

	@Test
	public void testNameConversor() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		assertEquals(conversor.getNameConverterArray().get(1), "Your last name is smaller than your first name");
		assertEquals(conversor.getNameConverterArray().get(2), "The lengths of your first name is your last name are the same");
	}

	@Test
	public void testAgeConversor() {

		Conversor conversorAge = new Conversor();
		conversorAge.setAgeConverterArrayValues();
		assertEquals(conversorAge.getAgeConverterArray().get(0),"You are young and talented! Things will come your way soon enough! ");
		assertEquals(conversorAge.getAgeConverterArray().get(1), "You are experienced and talented! Things will come your way soon enough!");
	}

	@Test
	public void testGenderConversor() {

		Conversor conversorGender = new Conversor();
		conversorGender.setGenderConverterArrayValues();
		assertEquals(conversorGender.getGenderConverterArray().get(0), "man!");
		assertEquals(conversorGender.getGenderConverterArray().get(1), "woman!");
		assertEquals(conversorGender.getGenderConverterArray().get(2), "person!");
	}
	
	@Test
	public void testCityConversor() {
		
		Conversor conversorCity = new Conversor();
		conversorCity.setCityConverterArrayValues();

		ArrayList<String> cityList = new ArrayList<>();
		cityList.add(" A, ");
		cityList.add(" B, ");
		cityList.add(" C, ");
		cityList.add(" D, ");
		cityList.add(" E, ");
		cityList.add(" F, ");
		cityList.add(" G, ");
		cityList.add(" H, ");
		cityList.add(" I, ");
		cityList.add(" J,");
		cityList.add(" a letter that comes after J, ");

		assertEquals(conversorCity.getCityConverterArray(),cityList);

	}




}


