package day19_WhileDoWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		////Kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın.
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamını bulmak için bir sayı giriniz.");
		int sayı=scan.nextInt();
		
		int rakamlarToplamı=0;
		int rakam=0;
		
		String sayıStr=""+sayı; // sayıyı lenght bulmak için sayı str ı stringe çevirdik.
		// int olarak verilen bir sayının basamak sayısını bulmak istersek
		//kısa yoldan o sayıyı stringe çevirip sayıStr.lenght() methodunu kullanabiliriz.
		for (int i = 0; i < sayıStr.length(); i++) {
			rakam=sayı%10;
			rakamlarToplamı+=rakam;
			sayı/=10;
			scan.close();
		}
		System.out.println("girdiğiniz sayını rakamlar toplamı : " + rakamlarToplamı);
	}

}
