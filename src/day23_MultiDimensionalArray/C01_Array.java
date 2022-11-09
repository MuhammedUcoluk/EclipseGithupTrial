package day23_MultiDimensionalArray;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array den istenen değere sahip elementleri silip
		// kalan yeni bir array olarak kaydedin.
		// Ve sonra yeni array i yazdırın.
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=3;
		
		// array de yeni eleman ekleyemeyiz veya var olan elemanları silemeyiz.
		// çünkü array in deklare edilen uzunluğu DEĞİŞMEZz.
		
		// Bu soruda istenen elementi sildiğimizde geriye kaç element kalıyor bulmamız lazıım.
		// silinecek sayı adedini bulalım.
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		System.out.println(sayac);
		int yeniArrayUzunluk=arr.length-sayac;   // Yeni arrayın uzunluğunu bulduk
		
		// artık yeni arrayi oluşturabiliriz.
		int yeniArr[]=new int[yeniArrayUzunluk]; //[0,0,0,0,....]
		
		// şimdi eski array deki elemanları birer birerr alıp
		// silinecek elemanlara eşit olmayanları yeni array e atamalıyız.
		// {3,4,5,6,3,5}
		
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {    // silinecek elemanı 3 yapmıştık. 3 e eşit olmayanları yeniArr ye attık.
				
				yeniArr[index]=arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(yeniArr));
	}

}
