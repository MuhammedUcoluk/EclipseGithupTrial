package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		String isimler[]= {"Hacer","ainagul","Emine","Murat","Kutlu"};
		
		//isimler arrayında Murat ismi varmı?
		//1.adım sıralama
		Arrays.sort(isimler);
		//Arrays classı ile sort yaptığımızda Arrayimiz kalıcı olarak değişir.
		System.out.println(Arrays.toString(isimler));  //[ Emine,Hacer,Kutlu,Murat,ainagül ]halini aldı.
		//Sort methodu elementleri natural ordera göre sıralar.
		
		// ainagülü Ainagül olarak değiştilerim 
		
		isimler[4]="Ainagül"; // değişimi yaptık.
		Arrays.sort(isimler); // Sortla tekrar sıraladık. BU ÖNEMLİ...
		System.out.println(Arrays.toString(isimler));// [Ainagül, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //4 döndürür. 
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //-5 verir Mehmet olsaydı Kutludan sonra Murat tan önce olurdu.
		
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); //-6 verir
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4 verir.

	}

}
