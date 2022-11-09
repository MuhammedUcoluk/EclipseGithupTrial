package day23_MultiDimensionalArray;

import java.util.Arrays;

public class C05_MdArrays {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

		String cumle="Her sey, Javayla kolay değil mi";
		
		String kelimeler[]=cumle.split(" "); // [Her, sey,, Javayla, kolay]
		
		System.out.println(Arrays.toString(kelimeler));
		
		System.out.println("Girilen kelimede " + kelimeler.length + " adet kelime var.");
		
				

	}

}
