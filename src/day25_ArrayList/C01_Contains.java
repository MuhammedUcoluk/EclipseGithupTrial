package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
		// Verilen bir array de tekrar eden elementleri sadece birer tane yazarak
		// unique elementlerden oluşan bir array haline getirelim.
		
		int arr[]= {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		
		// 2,3,4,5,6,7,8,9,1,0 haline getirmeyliyim.
		
		List<Integer> tekrarsız = new ArrayList<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!tekrarsız.contains(arr[i])) {
				
				tekrarsız.add(arr[i]);
			}
			
			
			
		}
		System.out.println(tekrarsız); // [2, 3, 4, 5, 6, 7, 8, 9, 1, 0] List olarak bunu tekrarsız bulduk.
		
		int tekrarsızArray[]=new int[tekrarsız.size()]; //[0,0,0,0,0,0,0,0,0,0]
		
		for (int i = 0; i < tekrarsızArray.length; i++) {
			
			tekrarsızArray[i]=tekrarsız.get(i);
			
			
		}
		Arrays.sort(tekrarsızArray);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] bunu [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] bu hale getirdik
		System.out.println(Arrays.toString(tekrarsızArray)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		
	}

}
