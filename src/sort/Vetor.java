package sort;

import java.util.Random;

public class Vetor {
	private int[] vetor;
	
	
	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public void makeVetor(int tam) {
		
		this.vetor = new int[tam];
		Random gerador = new Random();
		
		for(int i =0; i < vetor.length ; i++) {
			vetor[i] = gerador.nextInt(1000);
		}
		
	}
	
	public void printVetor() {
		System.out.print("[ ");
		for(int i =0; i < this.vetor.length ; i++) {
			System.out.print(this.vetor[i]+" ");
		}
		System.out.print(" ]");
	}

}
