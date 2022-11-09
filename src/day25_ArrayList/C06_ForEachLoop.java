package day25_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hiç uğraşmadan bir array veya listedeki tüm elemanları gözden geçirmek isteriz.
		
		int arr[]= {1,2,3,5,3,2,7};
		
		// bu arrayi esnek bir list yapmak istiyorum.
		
		
		List<Integer> yeniList=new ArrayList<>();
		/*for (int i = 0; i < arr.length; i++) {
			yeniList.add(arr[i]);*/
			
		
			
		//}
			//System.out.println(yeniList); //[1, 2, 3, 5, 3, 2, 7]
		
			for (int each : arr) { // arr deki herbir(each) integeri bana getir.
			yeniList.add(each);
			}
			System.out.println(yeniList); //[1, 2, 3, 5, 3, 2, 7]
			
			// eğer bir list veya array'in tüm elemanlarını elden geçirmek istiyorsak ve sıralam önemli değilse
			// for_each loop kullanırız.
	}

}
