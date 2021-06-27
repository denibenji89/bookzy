package com.bookzy.webapp;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebAppApplicationTests {

	@Test
	public void simpleTest() {
		int a = 1;
		int b = 2;
		assertTrue(a+b==3);
	}

}
