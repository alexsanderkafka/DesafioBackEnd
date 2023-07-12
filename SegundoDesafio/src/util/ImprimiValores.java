package util;

import java.util.List;

public class ImprimiValores {
	
	private static String[] notas = {"100.00", "50.00", "20.00", "10.00", "5.00", "2.00"};
    private static String[] moedas = {"1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};
    
    public static void imprimirNotas(List<Integer> lista) {
    	System.out.println("NOTAS: ");
    	for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " nota(s) de R$ " + notas[i]);
        }
    }
	
    public static void imprimirMoedas(List<Integer> lista) {
    	System.out.println("NOTAS: ");
    	for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " nota(s) de R$ " + moedas[i]);
        }
    }
}
