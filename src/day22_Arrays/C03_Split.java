package day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.," 
		// cümlesinin kelimelerini özel karakterler ve noktalama işaretleri olmadan harf sırasına göre yazdıralım.
		
		String cumle="Java ogrendim,  #cok para ?kazandim.,";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrendim,, , #cok, para, ?kazandim.,]

		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
			
			System.out.println(Arrays.toString(kelimeler)); //[Java, ogrendim, , cok, para, kazandim]
			
			
		}
		
		System.out.println(Arrays.toString(kelimeler));
		
		Arrays.sort(kelimeler);
		
		

		
		for (int i = 0; i < kelimeler.length; i++) {
			
			System.out.print(kelimeler[i]+ " ");
		}
		
		

	}

}
