package util;

public class Combinacao {
	
	public int k;
	public int[] array;
	
	public Combinacao(int k, int[] array) {
		super();
		this.k = k;
		this.array = array;
	}

	public int combinacoesDoArray() {
		int combinacao = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] - array[i] == k) {
					combinacao +=1;
				}
			}

		}
		return combinacao;
	}
}
