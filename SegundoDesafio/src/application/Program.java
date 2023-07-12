package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.ContaNotas;
import util.ImprimiValores;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double valor;
		
		System.out.print("Digite um valor: ");
		valor = sc.nextDouble();
		
		System.out.println();
		
		ContaNotas c = new ContaNotas(valor);
		List<Integer> notas = c.contarPapel();
		List<Integer> moedas = c.contarMoeda();
		ImprimiValores.imprimirNotas(notas);
		ImprimiValores.imprimirMoedas(moedas);

		sc.close();
	}

}
