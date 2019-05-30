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
	
	
	public void mergesort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergesort(l, mid);
	    mergesort(r, n - mid);
	 
	    merge(a, l, r, mid, n - mid);
	}
	
	public void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			  
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	
	public void mergeInsertion(int[] a, int n, int size) {
		if (n < 2) {
	        return;
	    }
		if(n < size) {
			insertionSort(a);
		}
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeInsertion(l, mid,size);
	    mergeInsertion(r, n - mid,size);
	    merge(a, l, r, mid, n - mid);
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
