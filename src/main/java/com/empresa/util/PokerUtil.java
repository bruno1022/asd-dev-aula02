package com.empresa.util;

import java.util.HashMap;

import com.empresa.enums.TipoMao;

public class PokerUtil {
	
	private HashMap<String,Integer> ordemCartas = new HashMap<String,Integer>();
	
	/**
	 * Recebe as cartas de 1 jogador
	 * 
	 * @param cartasDaMao - cada posição do array representa uma carta. Ex.: "5C" (5 de Copas)
	 * @return Tipo da Mao (Enum)
	 */
	public TipoMao identificarCartaMaisAlta(String carta1, String carta2) {
		
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
		
		
		return null; //TODO Implementar
	}
}
