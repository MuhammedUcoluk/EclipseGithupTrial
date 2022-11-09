package day21_ScopeArray;

import java.util.Arrays;

public class C05_ArraysSoru {

	public static void main(String[] args) {
		// Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir 
		//program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
		int arr[]= {1,2,3,4,5,6,7,8,9,22};
		int kova=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=kova; // bu son elemetin indexi. yani hepsi bir sola kaydı ama son element 22 22 olarak kaldı. 
								// bu işlemle biz en sondaki fazla olan 22 yerine ilk başta boş kovaya aldığımız index 0 yani 1 
								// değerini atadık.
		
		System.out.print(Arrays.toString(arr));
 
	}

}
