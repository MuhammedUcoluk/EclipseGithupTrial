package day23_MultiDimensionalArray;

public class C03_MdArray {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana 
		//yazdiran bir method yaziniz. { {1,2}, {4,5,6,7} }
		
		int arr[][]= { {1,2}, {4,5,6,7} };   // kaç kat array varsa o kadar forloop kullanılır.
		 // Method oluştur demişti. 
		
		carpimYazdir(arr);
		
		int carpım=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // arr[i] nin mantığı 0 ıncı index teki arrayin lenghti 
																		//	1 inci indexteki arrayin lenghti diyebilmek için
				 
				carpım*=arr[i][j];
			}
		}

		System.out.println(carpım); // 1*2*4*5*6*7 = 1680 verdi.
	

	
		
	}

	
	// Yukarıda istenen method sorusu cevabı.
	public static void carpimYazdir(int[][] arr) {
int carpım=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // arr[i] nin mantığı 0 ıncı index teki arrayin lenghti 
																		//	1 inci indexteki arrayin lenghti diyebilmek için
				 
				carpım*=arr[i][j];
			}
		}

		System.out.println(carpım); // 1*2*4*5*6*7 = 1680 verdi.
	
		
	}

}
