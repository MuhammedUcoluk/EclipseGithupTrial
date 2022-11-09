package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel" 
		// Cümlesinin kelimelerini ters sıradan yazdırın.
		
		String str="Java ogrenmek cok guzel";
	
		
		String kelimeler[]=str.split(" ");
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrenmek, cok, guzel]
		
		for (int i= kelimeler.length-1 ; i>= 0;  i--) {
			
			System.out.print(kelimeler[i]+" "); // guzel cok ogrenmek Java
			
		}
		

	}

}
