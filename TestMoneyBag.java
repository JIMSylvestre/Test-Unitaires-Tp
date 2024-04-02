package fr.emse.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMoneyBag {

	@Before
	public void setUp() {
	Money f12CHF = new Money(12, "CHF");
	Money f14CHF = new Money(14, "CHF");
	Money f7USD = new Money( 7, "USD");
	Money f21USD = new Money(21, "USD");
	MoneyBag fMB1 = new MoneyBag(f12CHF, f7USD);
	MoneyBag fMB2 = new MoneyBag(f14CHF, f21USD);
	}
	@Test
	public void testBagEquals() {
	Object fMB1 = null;
	assertTrue(!fMB1.equals(null)); 
	assertEquals(fMB1, fMB1); 
	Object f12CHF = null;
	assertTrue(!fMB1.equals(f12CHF)); 
	assertTrue(!f12CHF.equals(fMB1)); 
	Object fMB2 = null;
	assertTrue(!fMB1.equals(fMB2));
	}

}
