package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Traduz;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite a quantidade de casos de teste: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int i;
		System.out.println();
		System.out.println("Digite as frases de teste: ");
		List<String> casos = new ArrayList<>();
		for(i = 0; i < n; i++) {
			casos.add(sc.nextLine());
		}
		sc.close();
		
		Traduz traduz = new Traduz(casos);
		List<String> casosTraducao = traduz.decifra();
		
		for(String e : casosTraducao) {
			System.out.println(e);
		
		}
	}

}
