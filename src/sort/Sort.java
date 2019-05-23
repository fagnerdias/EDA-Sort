package sort;

public class Sort {
	
	public void insertionSort(int[] A) {
		
		for (int i = 1; i < A.length; i++){
			
			int aux = A[i];
			int j = i;
			
			while ((j > 0) && (A[j-1] > aux)){
				A[j] = A[j-1];
				j--;
			}
			A[j] = aux;
                
		}
	}
	
	public void heapSort(Vetor A) {
		buildMaxHeap(A);
		int aux = 0;
		for(int i =0; i < A.getVetor().length; i ++) {
			aux = A.getVetor()[0];
			A.getVetor()[0] = A.getVetor()[i];
			A.getVetor()[i] = aux;
			int heapSize = A.getHeapSize();
			A.setHeapSize(heapSize - 1);
			maxHeapify(A, 1);
		}
	}
	
	public void maxHeapify(Vetor A, int indice) {
		int l = left(indice);
		int r = rigth(indice);
		int largest = 0;
		if(l <= A.getHeapSize() && A.getVetor()[l] > A.getVetor()[r]) {
			largest = l;
		}else {
			largest = indice;
		}
		if(r <= A.getHeapSize() && A.getVetor()[r] > A.getVetor()[largest]) {
			largest = r;
		}
		if(largest != indice) {
			int aux = A.getVetor()[indice];
			A.getVetor()[indice] = A.getVetor()[largest];
			A.getVetor()[largest] = aux;
			maxHeapify(A, largest);
		}
		
	}
	
	public int parent(int indice) {
		return (indice/2);
	}
	public int left(int indice) {
		return (2*indice);
	}
	public int rigth(int indice) {
		return (2*indice + 1);
	}
	
	public void buildMaxHeap(Vetor A) {
		A.setHeapSize(A.getVetor().length);
		for(int i =0; i < (A.getVetor().length)/2; i++) {
			maxHeapify(A, i);
		}
	}
	
	
	

}
