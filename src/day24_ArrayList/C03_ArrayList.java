package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayList {

	public static void main(String[] args) {
		// Verilen bir array de istenen değere sahip elementleri silip
		// kalanı yeni bir array olarak kaydedin 
		// ve sonra yeni arrayi yazdırın
		
		int arr[]= {3,4,5,6,3,5};
		int silinecekEleman=3;
		
		List<Integer> gecici= new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=silinecekEleman) {
				gecici.add(arr[i]);
			}
			System.out.println("List olarak : " + gecici); // List olarak istenmeyen eleman hariç tüm elemanları görürüz.
			// Sonucu array olarak istiyorsak.
			// Listedekileri yeni arraye ekleyebiliriz.
			
			int yeniArray[]=new int[gecici.size()];
			
			for (int j = 0; j < yeniArray.length; j++) {
				
				yeniArray[j]=gecici.get(j);
				
			}
			// yeni arrayımızı yazdıralım.
			System.out.println("Array olarak : " + Arrays.toString(yeniArray));
			
			
		}

	}

}
