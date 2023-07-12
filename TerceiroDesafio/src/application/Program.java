package application;

import java.util.Locale;
import java.util.Scanner;

import util.Combinacao;

public class Program {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite o tamanho do Array: ");
		int n = sc.nextInt();
		System.out.print("Digite o valor alvo: ");
		int k = sc.nextInt();
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + " do array: ");
			array[i] = sc.nextInt();
		}
		
		Combinacao comb = new Combinacao(k, array);
		System.out.println("Número de pares possíveis: " + comb.combinacoesDoArray());
		
		sc.close();

	}

}
