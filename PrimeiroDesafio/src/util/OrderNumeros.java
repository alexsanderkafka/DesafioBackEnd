package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderNumeros {
	
	private List<Integer> pares = new ArrayList<>();
	private List<Integer> impares = new ArrayList<>();
	
	public OrderNumeros(List<Integer> pares, List<Integer> impares) {
		this.pares = pares;
		this.impares = impares;
	}
	
	public List<Integer> getPares() {
		return pares;
	}

	public List<Integer> getImpares() {
		return impares;
	}
	
	public void ordenarList() {
		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());
	}

	public void imprimir() {
		for(Integer e : pares) {
			System.out.println(e);
		}
		for(Integer e : impares) {
			System.out.println(e);
		}
	}
	
}
