package day19_WhileDoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		//Kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamını bulmak için bir sayı giriniz.");
		int sayı=scan.nextInt();
		
		int rakamlarToplamı=0;
		int rakam=0;
		
		while (sayı>0) {
			rakam=sayı%10;
			rakamlarToplamı+=rakam;
			sayı/=10;
		scan.close();
		}
	
		System.out.println("girdiğiniz sayını rakamlar toplamı : " + rakamlarToplamı);
		
		//ForLoop ile Yapalım
}
}