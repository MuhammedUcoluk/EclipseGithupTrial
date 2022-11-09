package day44_itetatorsCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_İterator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
List <Integer> liste = new ArrayList();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste); //[5,	 3,		 7,		 1,		 9,		 8,		 2]
		
		Iterator ıte1=liste.iterator();
		
		for (int i = 0; i < liste.size(); i++) {
			
							  // senden sonra eleman var mı?		// bir sonraki elemanta götürür. Delil olarak üzerinden atladığı elamanı yazdırır.
			System.out.println(ıte1.hasNext() + 			 " ==== " + ıte1.next());
		}
		System.out.println(ıte1.hasNext());// false
		System.out.println(ıte1.next()); // java.util.NoSuchElementException
	}

}
