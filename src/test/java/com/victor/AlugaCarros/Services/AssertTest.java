package com.victor.AlugaCarros.Services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssertTest {
	
	@Test
	public void testeee() {
		Assert.assertTrue("estava esperando vdd mas veio falso", false);
	}
}
