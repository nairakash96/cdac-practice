package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	@Test
	void empty_string_should_return_0() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_With_two_no() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void string_with_Multiple_no() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("1,2,3"));
	}

	@Test
	void string_with_Multiple_no_and_newLin() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("1,2\n3"));
	}

	@Test
	void string_with_Multiple_no_And_CustomDelimitor() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("//;\n1;2;3"));
	}

	@Test
	void string_with_Multiple_no_And_Spl_CustomDelimitor() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("//.\n1.2.3"));
	}

	@Test
	void string_with_Multiple_no_And_Spll_CustomDelimitor() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("//[***]\n1***2***3"));
	}
	
	@Test
	void should_Rise_Exception() {
		try {
			StringCalculator stringCalculator = new StringCalculator();
			stringCalculator.add("-1,2,3");
			fail("Exception expected");
		} catch (RuntimeException e) {
		}
	}

	@Test
	void should_give_Exception_Message() {
		try {
			StringCalculator stringCalculator = new StringCalculator();
			stringCalculator.add("-1,-2,3");
			fail("Exception expected");
		} catch (RuntimeException e) {
			assertEquals("Negative not Allowed :[-1, -2]", e.getMessage());
		}
	}

	@Test
	void string_GetAddcount() {
		StringCalculator stringCalculator = new StringCalculator();
		stringCalculator.add("");
		stringCalculator.add("1");
		stringCalculator.add("1,2");
		stringCalculator.add("1,2,3");
		stringCalculator.add("1,2\n3");
		assertEquals(5, stringCalculator.GetCalledCount());

	}
	
	@Test
	void string_with_no_GRT_1000() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(22, stringCalculator.add("2,1002,20"));
	}
	

}