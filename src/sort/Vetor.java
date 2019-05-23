package sort;

import java.util.Random;

public class Vetor {
	private int[] vetor;
	private int heapSize;
	
	
	
	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

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
			vetor[i] = gerador.nextInt(tam);
		}
		
	}
	
	public void printVetor() {
		System.out.print("[ ");
		for(int i =0; i < this.vetor.length ; i++) {
			System.out.print(this.vetor[i]+" ");
		}
		System.out.println(" ]");
	}

}
