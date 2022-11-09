package day40_Exception;

import java.util.Scanner;

public class c08_İllegalArgumentExceptions {

	public static void main(String[] args) {
		// Soru: Kullanıcıdan yaşını girmesini isteyin.
		// Kullanıcı sıfırdan küçük bir sayı girerse Exception verecek şekilde kodu yazın
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen console de görmek için yaşınızı giriniz");
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(yas);
			}
			
		}catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yaş sıfırdan küçük olamaz");
			
		}

	}

}
