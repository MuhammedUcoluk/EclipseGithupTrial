package day44_itetatorsCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

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

		System.out.println(liste);
		
		Iterator ite2=liste.iterator();
		ite2.next();
		ite2.next();
		ite2.next();
		
		System.out.println(ite2.next()); //1
		
		ite2.remove();// son döndürdüğü elementi siler
		//System.out.println(ite2.remove());
		//ite2.remove();
		System.out.println(liste);
	}

}
