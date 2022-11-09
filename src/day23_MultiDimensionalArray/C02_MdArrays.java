package day23_MultiDimensionalArray;

import java.util.Arrays;

public class C02_MdArrays {

	public static void main(String[] args) {
		// MD Arrayler iç içe konulmuş arrayler demektir.
		// Array oluşturmak için 2 yöntemimiz vardır.
		//  1. inci yöntem önce declare edip sonra değer atamak.
		
		int arr[][]=new int [3][2]; // outer arrayi 3 elemanlı   [[0,0],[0,0],[0,0]] DEMEK.
									// her bir elemanı 2 elemanlı olan md arrayi oluşturur.
		// Bu yöntemle oluşturduğumuzda inner array lerin hepsi aynı boyutta olmallıdır.
		
		System.out.println(Arrays.toString(arr)); // direk outer arrayi yazdırmak istediğimizde.
													// içindeki elemanlar non-primitive olduğundan referansları yazdırır.
													// [[I@5680a178, [I@5fdef03a, [I@3b22cdd0]
		System.out.println(Arrays.toString(arr[1])); // [0, 0]

		System.out.println(Arrays.toString(arr[2])); // [0, 0]
		
		System.out.println(Arrays.deepToString(arr)); //[[0,0],[0,0],[0,0]] // ****DEEPTOSTRİNG İLE****
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		System.out.println(Arrays.deepToString(arr)); //[[0, 5], [2, 0], [0, 3]]
		
		
		//2inci yöntem hem declare edip hem değer atayabiliriz.
		
		int arr2[][]= {  {0}, {1,2,3}, {6,7,8,9}};
		
		System.out.println(Arrays.deepToString(arr2)); // [[0], [1, 2, 3], [6, 7, 8, 9]]
		
		System.out.println(Arrays.toString(arr2[1])); // [1, 2, 3]
		
		System.out.println((arr2[2][1])); // Sadece 7 verdi // array i yazdırmak istemedim. o yüzden Arrays  classını kullanmadım.
	} 

}
