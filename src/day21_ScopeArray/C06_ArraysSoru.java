package day21_ScopeArray;

import java.util.Arrays;

public class C06_ArraysSoru {

	public static void main(String[] args) {
		// Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int arr[]= {3,5,8,65,32,34};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
		}
		System.out.println("elementler toplamı : "+ toplam);
		
		
		// array in tüm elemanlarını önce küçükten büyüğe sonra büyükten küçüğe yazdırın.
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// Büyükten küçüğe
		// for loop ile ters sıra yazdırabiliriz.
		for (int i = arr.length-1;  i >=0 ; i --) {
			System.out.print(arr[i]+ " ");
			
			
				
			}
		// array yapmak isterseniz aynı uzunlukta bir array oluşturup elemanları ters sırada yeni arraya taşıyabilirsiniz.
		System.out.println(" ");
					int tersArray[]=new int[arr.length]; // tersArray oluşturduk ve uzulukğu eski arr arrayının uzunluğu ile aynı olsun diye 
														// arr.lenght yaptık.
					
					for (int i = 0; i < tersArray.length; i++) {
						tersArray[i]=arr[arr.length-1-i];
			
		}
					System.out.print(Arrays.toString(tersArray));
	}

}
