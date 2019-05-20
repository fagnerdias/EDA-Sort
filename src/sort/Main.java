package sort;

public class Main {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		vetor.makeVetor(10);
		vetor.printVetor();
		
		Sort sort = new Sort();
		sort.insertionSort(vetor.getVetor());
		vetor.printVetor();

	}

}
