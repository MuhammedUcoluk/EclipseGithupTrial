package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrListAdd {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		System.out.println("Boş Liste : " + isimler);
		
		isimler.add("Ali");
		System.out.println("Bir Eleman : " + isimler);
		
		isimler.add("Veli");
		System.out.println("İki Eleman : " + isimler);
		// Add methodu listenin sonuna ekler.
		
		isimler.add("Can");
		System.out.println("Üç Eleman : " + isimler);
		
		// Tek seferde birden çok eleman EKLEYEMİYORuZ!!!
		
		isimler.add(1, "Ayşe");
		System.out.println("1. indexe ayşe ekledik : "+ isimler);
		
		//isimler.add(5); declare ederken belirttiğimiz data türü dışında bir data türünden ekleme YAPILMAZ!!!
		
		List <String> liste2 = new ArrayList<>();
		
		liste2.add("Günter");
		liste2.add("Emrah");
		System.out.println("liste 2 : " + liste2);
		
		isimler.addAll(4, liste2);
		System.out.println("sona liste 2 yi ekledik : " + isimler);
		
		isimler.addAll(liste2);
		System.out.println("index olmadan liste 2 yi tekrar ekledik : " + isimler);
		
		// System.out.println(isimler + liste2); // 2 listeyi tek syso da yazdıramıyoruz
		
		
		
	}

}
