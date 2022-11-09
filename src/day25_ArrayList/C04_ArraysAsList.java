package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		//Verilen arrayi arrays class tan yardım alarak
		// liste çevirelim
		
		String arr[]= {"A","B","C","d"};
		
		List<String> arraydenList= Arrays.asList(arr);
		
		System.out.println("List : " + arraydenList); //[A, B, C, D] 

		//arraydenList.add("F"); /* Exception in thread "main" java.lang.UnsupportedOperationException
		//at java.base/java.util.AbstractList.add(AbstractList.java:153)
		//at java.base/java.util.AbstractList.add(AbstractList.java:111)
		//at day25_ArrayList.C04_ArraysAsList.main(C04_ArraysAsList.java:18) */
		
		// Bu şekilde arrayclass ten yardım alarak arrayliste çevirirsek
		// oluşturduğumuz listin boyutu sabit olur.
		// dolayısı ile  add methodu remove methodu clear methodu gibi methodu çalıştırmak istersek 
		// UnsupportedOperationException verir. Contains kullanılabilir.
		
		arr[1]="Z";
		System.out.println("Arrayi değiştirdikten sonra array = " + Arrays.toString(arr)); // [A, Z, C, D]
		System.out.println("Arrayi değiştirdikten sonra list = " + arraydenList); // [A, Z, C, D] arrayi değiştirince listte değişti.
		
		
		arraydenList.set(3, "D");
		System.out.println("Listi değiştirdikten sonra list = " + arraydenList); // [A, Z, C, D]
		System.out.println("list değiştirdikten sonra array= " + Arrays.toString(arr)); // [A, Z, C, D]
		
		
	}

}
