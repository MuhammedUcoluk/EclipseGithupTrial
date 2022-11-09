package day29_StaticBlockPassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// Bir List oluşturalım..
		// Sonra list elemanlarını değiştir methodu yazıp orada 
		// List elemanlarından bazılarını değiştirelim.
		// Method Void olsun
		//Main Method a döndükten sonra yeniden Listi yazdıralım.
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Method a dönünce List : " + harfler);//[D, B, C] 
		
		// JAVA DA LİST VE ARRAY GİBİ OBJELER İÇİNDE PASS BY VALUE GEÇERLİDİR. 
			// YANİ FARKLI BİR METHOTTA ARRAY VEYA LİSTE YENİ DEĞER ATAMASI YAPARSANIZ
				//ORJİNAL ARRAY LİST DEĞİŞMEZ.
		
		listDegistir(harfler); // Method da yeni değer atadığım halde harfler listesi değişmedi.
		System.out.println("List e yeni değer atadıktan sonra main method a dönünce : " + harfler); //[D, B, C]
		
		
	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		System.out.println("List e yeni değer atayınca : " + harfler); //[]
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		harfler.set(0, "D");
		System.out.println("Methodda değiştirdiğimiz List : " + harfler);//[D, B, C]
		
	}

}
