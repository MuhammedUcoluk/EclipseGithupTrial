package day19_WhileDoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı alın ve busayıları tam bölen sayıları ve toplam kaç adet olduğunu
		// ekranda yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bölenlerini bulmak için pozitif bir tamsayı yazınız.");
		int sayı=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayı) {
			if (sayı%bolen==0) {
				System.out.print(bolen + " ");
				sayac++;
				scan.close();
			}
			bolen++;
		}
		System.out.println("");
		System.out.println(sayı+" sayısının "+sayac+ " adet tam böleni vardır");
	}
		
}
