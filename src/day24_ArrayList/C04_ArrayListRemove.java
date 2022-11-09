package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayListRemove {

	public static void main(String[] args) {
		
		List<String> harfler = new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler); // [A, Z, F, D]
		
		System.out.println(harfler.remove(1)); //Z  bunu harfler.remove(1); olarak yapabiliriz.
												// java burada syso ile remove işlemi yaptığımızda yaptığı işlemi yazar.
		// listenin kalanını görmek isterseniz listeyi yazdırabiliriz.
		System.out.println(harfler);  // [A, F, D]
		
		System.out.println(harfler.remove(2)); // D yi yazdırır. 
		
		System.out.println(harfler); // [A, F] kaldı.
		
		System.out.println(harfler.remove("F")); // gidip F yi remove eder. ve yaptım demek için true döndürür.
		
		System.out.println(harfler.remove("B")); // LİSTEDE B OLMADIĞI İÇİN REMOVE YAPAMAZ VERİLEN GÖREVİ YAPAMADI. FALSE DÖNDÜRÜR.
		
		System.out.println(harfler); // [A]
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		
		System.out.println(harfler); //[A, A, Z, F]
		
		System.out.println(harfler.remove("A")); // TRUE döndürdü. 0 ıncı indexteki A yı sildi.
		System.out.println(harfler);
		
		harfler.add("A");
		System.out.println(harfler); //[A, Z, F, A]
		
		harfler.removeAll(harfler);
		
		System.out.println(harfler); // [] Verilen listeyi sildi.
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler=new ArrayList<>();
		
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler); //[A, Z, F, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		
		System.out.println(harfler.removeAll(silinecekHarfler)); // True
		System.out.println(harfler); //[Z, D]
		System.out.println(silinecekHarfler); //[A, C, F]
		// 			*****************ÖNEMLİ***********************
		// Eğer listemiz integer lardan oluşuyorsa 
		// REmove(index) ve remove(Object) methodları karışmasın diye 
		// girilen sayıyı İNDEX OLARAK KABUL EDER.!!!
	}

}
