package day23_MultiDimensionalArray;

import java.util.Arrays;

public class C06_MdArrays {

	public static void main(String[] args) {
		// Verilen 2 arrayi birleştiren ve 
		//sonucu birleşik array isminde bir arraye kaydeden 
		//bir method oluşturunuz
		// main method içinde yeni arrayi sıralayıp yazdırın.
		
		int arr1[]= {3,5,7,10};
		int arr2[]= {2,4,6};
		
		int birlesikArray[]=birlestir(arr1,arr2);
		Arrays.sort(birlesikArray);   // Sıraladık.
		System.out.println(Arrays.toString(birlesikArray)); // [2, 3, 4, 5, 6, 7, 10]
	}

	public static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length+ arr2.length]; 
		
		for (int i = 0; i < arr1.length; i++) { // 1. array elemanlarını birlesikArray a atadık.
			
			birlesikArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) { //2.arrayin elemanlarını alacağız.
			
			birlesikArray[i+arr1.length]=arr2[i]; // i+arr1.Lenght i birlesikarrayde 0 ve 1 inci indexte arr1 elemanları var. 
			
		}
		
		return birlesikArray;
	}

}
