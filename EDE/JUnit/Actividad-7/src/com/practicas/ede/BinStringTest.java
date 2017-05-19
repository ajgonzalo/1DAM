package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class BinStringTest {

	private BinString binString;
	
	public BinStringTest(){
		// Completar
		
		binString = new BinString();
		
	}
	
	@Test
	public void  sumarTest(){
		// Test de la función sumar

		int expected = 0;
		assertEquals(expected,binString.sumar(""));
		
		expected = 100;
		assertEquals(expected,binString.sumar("d"));
		
		expected = 292;
		assertEquals(expected,binString.sumar("aba"));
		
		expected = 302;
		assertEquals(expected,binString.sumar("ede"));
		
	}
	
	@Test
	public void aBinarioTest() {
		// Test de la función aBinario

		String expected ="100100100";
		assertEquals(expected,binString.aBinario(292));
		
		expected ="";
		assertEquals(expected,binString.aBinario(0));
		
		expected ="100101110";
		assertEquals(expected,binString.aBinario(302));
		
	}
	
	@Test
	public void convertirTest() {
		// Test de la función convertirTest

		String expected ="100100100";
		assertEquals(expected,binString.convertir("aba"));
		
		expected ="100101110";
		assertEquals(expected,binString.convertir("ede"));
		
		expected ="";
		assertEquals(expected,binString.convertir(""));
		
	}
}
