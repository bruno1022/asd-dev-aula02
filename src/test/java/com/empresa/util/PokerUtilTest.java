package com.empresa.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PokerUtilTest {
	
	/*
	 * Teste pull request
	 * */	
	
	private PokerUtil pokerUtil;
	
	@Before
	public void setUp() throws Exception {		
		pokerUtil = new PokerUtil();
	}
	
	@Test
	public void testCarta1MaiorValor() throws Exception {
	      assertEquals(PokerUtil.CARTA_1_MAIOR_VALOR, pokerUtil.identificarCartaMaisAlta("5H", "2C"));
	      
	}
	
	@Test
	public void testCarta2MaiorValor() throws Exception {
	      assertEquals(PokerUtil.CARTA_2_MAIOR_VALOR, pokerUtil.identificarCartaMaisAlta("2C", "5H"));
	      
	}
	
	@Test
	public void testCartaMesmoValor() throws Exception {
	      assertEquals(PokerUtil.CARTAS_MESMO_VALOR, pokerUtil.identificarCartaMaisAlta("5H", "5H"));
	      
	}
	
	@Test(expected = Exception.class) 
	public void testCartaInvalida() throws Exception {
		pokerUtil.identificarCartaMaisAlta("1", "2");
		
	}
	
	

}
