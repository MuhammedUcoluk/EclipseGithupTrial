package day21_ScopeArray;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		 // Array in elemanlarını loop ile yazdırabiliriz.
		int arr[]= {2,4,5,6,78,89};
		
		// Tüm elementleri yazdırabiliriz.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");			// 1inci yöntem
		}
		//
		System.out.println("");
		// Yada Arrays Classından yardım alarak.
		System.out.print(Arrays.toString(arr));		// 2inci yöntem.
	}

}
