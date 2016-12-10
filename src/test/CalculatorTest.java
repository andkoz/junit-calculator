package test;

import main.Calculator;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");
		double a = 4.0;
		double b = 7.0;
		double result= classUnderTest.sum(a, b);
		assertEquals("ok.", 11, result, 0.000001);
		
	}
	@Test
	public void testSubtract() throws Exception {
		System.out.println("Metoda testowa");
		double a = 4.0;
		double b = 7.0;
		double result= classUnderTest.subtract(a, b);
		assertEquals("ok.", a-b, result, 0.000001);
		
	}
	@Test
	public void testMultiply() throws Exception {
		System.out.println("Metoda testowa");
		double a = 4.0;
		double b = 7.0;
		double result= classUnderTest.multiply(a, b);
		assertEquals("ok.", a*b, result, 0.000001);
		
	}
	@Test
	public void testDivide() throws Exception {
		System.out.println("Metoda testowa");
		double a = 4.0;
		double b = 7.0;
		double result= classUnderTest.divide(a, b);
		assertEquals("ok.", a/b, result, 0.000001);
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDivideZero() throws Exception {
		System.out.println("Metoda testowa");
		double a = 4.0;
		double b = 7.0;
		double result= classUnderTest.divide(a, 0);
		assertEquals("ok.", a/b, result, 0.000001);
		
	}

}
