package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.OrderNumeros;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		System.out.println("Digite a quantida de número que serão digitados: ");
		int n = sc.nextInt();
		
		int num;
		for(int i = 0; i < n; i++) {
			num = sc.nextInt();
			if(num % 2 == 0) {
				pares.add(num);
			}
			else {
				impares.add(num);
			}
		}
		
		OrderNumeros numeros = new OrderNumeros(pares, impares);
		numeros.ordenarList();
		//System.out.println(numeros);
		numeros.imprimir();
		
		sc.close();
	}

}
