package sort;

public class Main {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		vetor.makeVetor(10);
		vetor.printVetor();
		
		Sort sort = new Sort();
		long tempoInicial = System.currentTimeMillis();
		sort.insertionSort(vetor.getVetor());
		long tempoFinal = System.currentTimeMillis();
		System.out.println("tempo de execução: " + (tempoFinal - tempoInicial));
		vetor.printVetor();
		
		vetor.makeVetor(10);
		vetor.printVetor();
		
		tempoInicial = System.currentTimeMillis();
		sort.heapSort(vetor);
		tempoFinal = System.currentTimeMillis();
		System.out.println("tempo de execução heap : " + (tempoFinal - tempoInicial));
		vetor.printVetor();
		
		
		vetor.makeVetor(100);
		vetor.printVetor();
		
		tempoInicial = System.currentTimeMillis();
		sort.insertionSort(vetor.getVetor());
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("tempo de execução: " + (tempoFinal - tempoInicial));
		vetor.printVetor();
		
		
		vetor.makeVetor(1000);
		vetor.printVetor();
		tempoInicial = System.currentTimeMillis();
		sort.insertionSort(vetor.getVetor());
		tempoFinal = System.currentTimeMillis();
		System.out.println("tempo de execução: " + (tempoFinal - tempoInicial));
		vetor.printVetor();

		
		vetor.makeVetor(5000);
		vetor.printVetor();
		tempoInicial = System.currentTimeMillis();
		sort.insertionSort(vetor.getVetor());
		tempoFinal = System.currentTimeMillis();
		System.out.println("tempo de execução: " + (tempoFinal - tempoInicial));
		vetor.printVetor();
		
		
		vetor.makeVetor(10000);
		vetor.printVetor();
		tempoInicial = System.currentTimeMillis();
		sort.insertionSort(vetor.getVetor());
		tempoFinal = System.currentTimeMillis();
		System.out.println("tempo de execução: " + (tempoFinal - tempoInicial));
		vetor.printVetor();
		
		
	}

}
