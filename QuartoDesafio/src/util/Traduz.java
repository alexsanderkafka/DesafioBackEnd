package util;

import java.util.ArrayList;
import java.util.List;

public class Traduz {
	
	private List<String> casos = new ArrayList<>();

	public Traduz(List<String> casos) {
		this.casos = casos;
	}

	public List<String> getCasos() {
		return casos;
	}
	
	public List<String> decifra(){
		
		List<String> traducao = new ArrayList<>();
		int i;
		int n = casos.size();
		
		for(i = 0; i < n; i++) {
			int tamanho = casos.get(i).length();
			
			int metade = tamanho / 2;
			System.out.println();
			for(int j = metade - 1; j >= 0; j--) {
				System.out.print(casos.get(i).charAt(j));
			}
			for(int j = tamanho - 1; j >= metade; j--) {
				System.out.print(casos.get(i).charAt(j));
			}
		}
		return traducao;
	}
	
	
}
