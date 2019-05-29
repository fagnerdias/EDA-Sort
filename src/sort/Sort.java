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
		int largest = indice;
		if(l < A.getHeapSize() && A.getVetor()[l] > A.getVetor()[r]) {
			largest = l;
		}
		if(r < A.getHeapSize() && A.getVetor()[r] > A.getVetor()[largest]) {
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
	
	
	
	public void	quicksort(Vetor A, int p, int r) {
		if(p < r) {
			
			int q = partition(A, p, r);
			quicksort(A, p, q-1);
			quicksort(A, q+1, r);
		}
	}
	
	public int partition(Vetor A, int p, int r) {
		
		int x = A.getVetor()[r];
		int i = p -1;
		for(int j = p; j < r-1; j++) {
			if(A.getVetor()[j] <= x) {
				i++;
				int aux = A.getVetor()[i];
				A.getVetor()[i] =  A.getVetor()[j];
				A.getVetor()[j] = aux;
			}
		}
		int aux2 = A.getVetor()[i+1];
		A.getVetor()[i+1] = A.getVetor()[r];
		A.getVetor()[r] = aux2;
		return i+1;
	}
	
	
	public void mergesort(Vetor A, int p, int r) {
		if(p < r) {
			int q = ((p + r) / 2);
		    mergesort(A, p, q);
	        mergesort(A, q + 1, r);
	        merge(A, p, q, r);
		}
	}
	
	public void merge(Vetor A, int p, int q, int r) {
		int[] aux = new int[A.getVetor().length];
		
		for(int i = p; i<= r; i++) {
			aux[i] = A.getVetor()[i];
		}
		
		int i = p;
		int j = q+ 1;
		int k = p;

		while (i <= q && j <= r) {
			if (aux[i] < aux[j]) {
				A.getVetor()[k] = aux[i];
				i++;

			} else {
				A.getVetor()[k] = aux[j];
				j++;
			}
			k++;
		}

		while (i <= q) {
			A.getVetor()[k] = aux[i];
			i++;
			k++;
		}

		while (j <= r) {
			A.getVetor()[k] = aux[j];
			j++;
			k++;

		}

	}
	
	public void mergeInsertion(Vetor A, int p, int r, int size) {
		if(p < r) {	
			if((r - p) < size ) {
				insertionSort(A.getVetor());
				
			}
			else { 				
				int q = ((p + r) / 2);
			    mergeInsertion(A, p, q,size);
			    mergeInsertion(A, q + 1, r,size);
		        merge(A, p, q, r);
			}
		}
	}
	
	public void quickInsertion(Vetor A, int p, int r, int size) {
		if(p < r) {	
			if((r - p) < size ) {
				insertionSort(A.getVetor());
				
			}
			else { 				
				int q = partition(A, p, r);
				quickInsertion(A, p, q-1,size);
				quickInsertion(A, q+1, r,size);
			}
		}
	}
	
	
	

}
