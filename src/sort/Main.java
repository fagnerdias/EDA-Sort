package sort;

//size of vetor: 3000, 5000, 500
public class Main {
 
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		long[] time = new long[10];
		Sort sort = new Sort();
		long med =0;
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(10000);
			long tempoInicial = System.currentTimeMillis();
			sort.insertionSort(vetor.getVetor());
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Insertion - 10000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(5000);
			long tempoInicial = System.currentTimeMillis();
			sort.insertionSort(vetor.getVetor());
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Insertion - 5000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(500);
			long tempoInicial = System.currentTimeMillis();
			sort.insertionSort(vetor.getVetor());
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Insertion - 500: ");
		System.out.println(med/10);
		med =0;
		
		

//-------------------------------------------------------------------------------------------
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(10000);
			long tempoInicial = System.currentTimeMillis();
			sort.mergesort(vetor.getVetor(),10000);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Merge - 10000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(5000);
			long tempoInicial = System.currentTimeMillis();
			sort.mergesort(vetor.getVetor(),5000);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Merge - 5000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(500);
			long tempoInicial = System.currentTimeMillis();
			sort.mergesort(vetor.getVetor(), 500);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Merge - 500: ");
		System.out.println(med/10);
		med =0;
		
		
//-------------------------------------------------------------------------------------------
		
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(10000);
			long tempoInicial = System.currentTimeMillis();
			sort.heapSort(vetor);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Heap - 10000: ");
		System.out.println(med/10);
		med =0;
		
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(5000);
			long tempoInicial = System.currentTimeMillis();
			sort.heapSort(vetor);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Heap - 10000: ");
		System.out.println(med/10);
		med =0;
		
		
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(500);
			long tempoInicial = System.currentTimeMillis();
			sort.heapSort(vetor);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Heap - 10000: ");
		System.out.println(med/10);
		med =0;
		
		
//--------------------------------------------------------------------------------------------------------
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(10000);
			long tempoInicial = System.currentTimeMillis();
			sort.quicksort(vetor, 0, 10000-1);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Quick - 10000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(5000);
			long tempoInicial = System.currentTimeMillis();
			sort.quicksort(vetor, 0, 5000-1);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Quick - 5000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(500);
			long tempoInicial = System.currentTimeMillis();
			sort.quicksort(vetor, 0, 500-1);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Quick - 500: ");
		System.out.println(med/10);
		med =0;
		
//----------------------------------------------------------------------------------------------
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(10000);
			long tempoInicial = System.currentTimeMillis();
			sort.quickInsertion(vetor, 0, 10000-1,10);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Quick + Insertion - 10000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(5000);
			long tempoInicial = System.currentTimeMillis();
			sort.quickInsertion(vetor, 0, 5000-1,10);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Quick + Insertion - 5000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(500);
			long tempoInicial = System.currentTimeMillis();
			sort.quickInsertion(vetor, 0, 500-1,10);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Quick + Insertion - 500: ");
		System.out.println(med/10);
		med =0;
		
//------------------------------------------------------------------------------------
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(10000);
			long tempoInicial = System.currentTimeMillis();
			sort.mergeInsertion(vetor.getVetor(), 10000,10);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Merge + Insertion - 10000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(5000);
			long tempoInicial = System.currentTimeMillis();
			sort.mergeInsertion(vetor.getVetor(),5000,10);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Merge + Insertion - 5000: ");
		System.out.println(med/10);
		med =0;
		
		time = new long[10];
		for(int i =0; i < 10; i++) {
			vetor.makeVetor(500);
			long tempoInicial = System.currentTimeMillis();
			sort.mergeInsertion(vetor.getVetor(),500,10);
			long tempoFinal = System.currentTimeMillis();
			time[i] = tempoFinal - tempoInicial;
		}
		
		System.out.print("[ ");
		for(long j : time) {
			System.out.print(j + ",");
			med += j;
		}
		System.out.println(" ]");
		System.out.println("media Merge + Insertion - 500: ");
		System.out.println(med/10);
		med =0;
		
	}

}
