package day29_StaticBlockPassByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {
		
		int sayılar[]= {3,4,5,6};
		
		elemanDegistir(sayılar);
		System.out.println("Elaman değiştir methodundan sonra : " + Arrays.toString(sayılar)); // [10, 4, 5, 6]
		
		arrayıDegistir(sayılar);
		System.out.println("arrayi değiştir methodundan sonra  : " + Arrays.toString(sayılar));// [10, 4, 5, 6]
		
		
	}

	private static void arrayıDegistir(int[] sayılar) {
		
		sayılar=new int[6];
		System.out.println("arrayi değiştir methodunda  : " + Arrays.toString(sayılar));//[0, 0, 0, 0, 0, 0]
		
	}

	private static void elemanDegistir(int[] sayılar) {
		
		sayılar[0]=10;
		System.out.println("Eleman değiştir methodunda : " + Arrays.toString(sayılar));// [10, 4, 5, 6]
		
	}

}
