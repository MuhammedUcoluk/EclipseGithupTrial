package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// Kullanıcıdan istediği kadar sayı alıp bu sayıları toplayan bir program yapınız.
		// Sayı girişini bitirmek için q ya basınız.
		
		int sayı=0;
		int toplam=0;
		int count=0;
		
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		//InputMismatchException
		
		try {
			while(count<10000){
				
				System.out.println("Lütfen toplamak icin bir sayı yazınız.\nBitirme için sayı dışında bir tuşa basınız");
				sayı=scan.nextInt();
				toplam+=sayı;
				count++;
			}
		} catch (InputMismatchException e) {
			System.out.println("girdiğiniz  " + count + " sayının toplamı  " +  toplam);
		}
	}
}	
		
	


