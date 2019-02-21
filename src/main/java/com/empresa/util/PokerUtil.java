package com.empresa.util;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class PokerUtil {

	public static final int CARTA_1_MAIOR_VALOR = 1;
	public static final int CARTA_2_MAIOR_VALOR = 2;
	public static final int CARTAS_MESMO_VALOR = 0;

	private HashMap<String, Integer> ordemCartas = new HashMap<String, Integer>();

	/**
	 * Recebe duas cartas e determina qual a carta com maior valor (mais alta)
	 * @param carta1
	 * @param carta2
	 * @return int: 
	 * 		1: caso a carta1 seja a de maior valor
	 * 		2: caso a carta2 seja a de maior valor
	 * 		0: caso as duas cartas tenham o mesmo valor
	 * @throws Exception caso os parametros estejam inválidos
	 */
	public int identificarCartaMaisAlta(String carta1, String carta2) throws Exception {
		
		validarNull(carta1, carta2);
		
		String numeroCarta1 = Character.toString(carta1.charAt(0));
		String numeroCarta2 = Character.toString(carta2.charAt(0));
		
		//verificar se cartas tem o mesmo valor
		if (validarNumeroCartasIguais(numeroCarta1, numeroCarta2)) {
			return CARTAS_MESMO_VALOR;
		}
		
		ordemCartas.put("2", 1);
		ordemCartas.put("3", 2);
		ordemCartas.put("4", 3);
		ordemCartas.put("5", 4);
		ordemCartas.put("6", 5);
		ordemCartas.put("7", 6);
		ordemCartas.put("8", 7);
		ordemCartas.put("9", 8);
		ordemCartas.put("J", 9);
		ordemCartas.put("Q", 10);
		ordemCartas.put("K", 11);
		ordemCartas.put("A", 12);
		
		//Verifica se as cartas informadas são válidas
		if (! (ordemCartas.containsKey(numeroCarta1) && ordemCartas.containsKey(numeroCarta2) )) {
			throw new Exception("Os parametros possuem problemas");
		}
		
		//Avalia qual a maior carta com base na primeira posição da string
		if (ordemCartas.get(numeroCarta1) > ordemCartas.get(numeroCarta2)) {
			return CARTA_1_MAIOR_VALOR;
		} else if (ordemCartas.get(numeroCarta1) > ordemCartas.get(numeroCarta2)) {
			return CARTA_2_MAIOR_VALOR;
		} else {
			return CARTAS_MESMO_VALOR;
		}
		
	}

	private boolean validarNumeroCartasIguais(String numeroCarta1, String numeroCarta2) {
		return StringUtils.equals(numeroCarta1, numeroCarta2);
	}

	private void validarNull(String carta1, String carta2) throws Exception {
		if (StringUtils.isEmpty(carta1) || StringUtils.isEmpty(carta2)) {
			throw new Exception("Os parametros possuem problemas");
		}

	}
}
