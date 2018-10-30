import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_isValid_I_1(){
		//Arrange
		RomanNumerals rm = new RomanNumerals();
		//Act
		assertEquals(false, rm.isValid("IIICI"));
	}
	
	@Test
	public void test_isValid_V_2(){
		//Arrange
		RomanNumerals rm = new RomanNumerals();
		//Act
		assertEquals(false,rm.isValid("VV"));
	}
	
	
	@Test
	public void test_1() {
		//Arrange
		RomanNumerals rm = new RomanNumerals();
		//Act
		int result = rm.convertToInteger("I");
		assertEquals(1,result);
		
	}
	
	@Test
	public void test_2014(){
		//Arrange
		RomanNumerals rm = new RomanNumerals();
		//Act
		int result = rm.convertToInteger("MMXIV");
		assertEquals(2014,result);
	}
	
	@Test
	public void test_1984(){
		//Arrange
		RomanNumerals rm = new RomanNumerals();
		//Act
		int result = rm.convertToInteger("MCMLXXXIV");
		assertEquals(1984,result);
	}
	

}
