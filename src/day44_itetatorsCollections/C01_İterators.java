package day44_itetatorsCollections;

import java.util.ArrayList;
import java.util.List;

public class C01_İterators {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
		List <Integer> liste = new ArrayList();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		System.out.println(liste);
		
		//index kullanmadan tğm elemanları 3 eklenmiş olarak yazıddr.
		for (Integer each : liste) {
			System.out.print(each+3 + " ");
			//8 6 10 4 12 11 5 
		}
		System.out.println("");
		System.out.println(liste);  // [5, 3, 7, 1, 9, 8, 2]
		// foreach loop ile index kullanmadan tüm elementlere ulaşabiliyoruz ama kalıcı değişiklik yapamıyoruz.
	}
}
