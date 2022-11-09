package day46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		// Verilen bir Array'deki tekrar eden sayıları silip 
		//unique değerlerden oluşan bir array oluşturun. 

		int arr[]= {3,4,6,4,2,4,6,8,6,5,3,1,2,4,6,7};
		
		Set<Integer> benzersizSet=new HashSet<>();
		
		for (Integer each : arr) {
			
			benzersizSet.add(each);
			
		}
		System.out.println(benzersizSet); //[1, 2, 3, 4, 5, 6, 7, 8]
		
		//Buradan sonra Arraye çevirelim tekrar.

		Object[] tekrarsızArr= benzersizSet.toArray();
		
		System.out.println(Arrays.toString(tekrarsızArr)); //[1, 2, 3, 4, 5, 6, 7, 8]

		
	}

}
