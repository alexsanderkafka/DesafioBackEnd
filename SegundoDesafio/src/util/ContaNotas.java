package util;

import java.util.ArrayList;
import java.util.List;

public class ContaNotas {
	
	public double valor;
	private double outroValor;

	public ContaNotas(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@SuppressWarnings("unused")
	public List<Integer>  contarPapel() {
		List<Integer> valores = new  ArrayList<Integer>();
		
		double valor2 = valor;
		
		//Papel
		valores.add((int) valor2 / 100);
		valor2 = valor2 % 100;
		valores.add((int) valor2 / 50);
		valor2 = valor2 % 50;
		valores.add((int) valor2 / 20);
		valor2 = valor2 % 20;
		valores.add((int) valor2 / 10);
		valor2 = valor2 % 10;
		valores.add((int) valor2 / 5);
		valor2 = valor2 % 5;
		valores.add((int) valor2 / 2);
		valor2 = valor2 % 2;
		outroValor = valor2;
		
		return valores; 
	}
	
	@SuppressWarnings("unused")
	public List<Integer>  contarMoeda() {
		List<Integer> valores = new  ArrayList<Integer>();
		
		//Moedas
		if(outroValor < 1) {
			valores.add((int) outroValor);
			valores.add((int)(outroValor / 0.50));
			outroValor = outroValor % 0.50;
			valores.add((int)(outroValor / 0.25));
			outroValor = outroValor % 0.25;
			valores.add((int)(outroValor / 0.10));
			outroValor = outroValor % 0.10;
			valores.add((int)(outroValor / 0.05));
			outroValor = outroValor % 0.05;
			valores.add((int)(outroValor / 0.01));
		}
		else {
			valores.add((int) outroValor);
			outroValor = outroValor - 1;
			valores.add((int)(outroValor / 0.50));
			outroValor = outroValor % 0.50;
			valores.add((int)(outroValor / 0.25));
			outroValor = outroValor % 0.25;
			valores.add((int)(outroValor / 0.10));
			outroValor = outroValor % 0.10;
			valores.add((int)(outroValor / 0.05));
			outroValor = outroValor % 0.05;
			valores.add((int)(outroValor / 0.01));
		}
		return valores; 
	}
	
}
