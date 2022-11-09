package day44_itetatorsCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<>();
	
		liste.add("Ali");
		liste.add("Veli");		
		liste.add("Ayşe");
		liste.add("Fatma");
		liste.add("Emrah");
		System.out.println(liste); //[Ali, Veli, Ayşe, Fatma, Emrah]

		
		ListIterator li1=liste.listIterator();
		
		while (li1.hasNext()) {
			
			String temp="";
			temp=(String) li1.next();
			li1.set( temp + "X");
			//li1.set(li1.next() + "X");
			
		}
		System.out.println(liste);
		}
		
	}


