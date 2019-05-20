package sort;

public class Sort {
	
	public void insertionSort(int[] vetor) {
		
		for (int i = 1; i < vetor.length; i++){
			
			int aux = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j--;
			}
			vetor[j] = aux;
                
		}
	}
	
	

}
