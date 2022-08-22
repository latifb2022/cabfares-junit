package com.lbenzzine.cabfares;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CabFaresTest {
	
	CabFares cf;
	
	@Test
	public void calculateFare_standard_expect_correct_amounts() {
		this.cf = new CabFares(CABTYPES.STANDARD);
		cf.faresAmount();
		double result = cf.calculateFare(CABTYPES.STANDARD, 15.0);
		assertEquals(315,result );
	}
	
	@Test
	public void calculateFare_medium_expect_correct_amounts() {
		this.cf = new CabFares(CABTYPES.MEDIUM);
		cf.faresAmount();
		double result = cf.calculateFare(CABTYPES.MEDIUM, 15.0);
		assertEquals(765,result );
	}

}
