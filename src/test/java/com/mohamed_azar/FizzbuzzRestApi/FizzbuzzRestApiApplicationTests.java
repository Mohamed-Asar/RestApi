package com.mohamed_azar.FizzbuzzRestApi;

import com.mohamed_azar.FizzbuzzRestApi.model.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzbuzzRestApiApplicationTests {

	@Test
	void testGetResult() throws Exception {
		// Given
		FizzBuzz fizzBuzz = new FizzBuzz(3,6,10,"hello", "world");
		assertEquals("[1, 2, hello, 4, 5, helloworld, 7, 8, hello, 10]", fizzBuzz.getResult());
	}

}
