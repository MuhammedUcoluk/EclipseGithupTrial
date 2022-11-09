package day44_itetatorsCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		
		//iterator kullanarak tüm elamanları silin.
List <Integer> liste = new ArrayList();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);

		System.out.println(liste);
		
		Iterator ite2=liste.iterator();
		
		while (ite2.hasNext()) {
			ite2.next();
			ite2.remove();
			
			
		}
		System.out.println(liste);
	}

}
