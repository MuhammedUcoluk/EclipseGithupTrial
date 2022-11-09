package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// Verilen bir int array için kullanıcıdan sayı isteeyin ve girilen sayıyı index olarak kabul edip 
		// o indexteki elementi yazdırın.
		
		int arr[]= {2,3,5,6,2,7,9,1};
		
		//ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		try {
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Lütfen elementi yazdırmak için index giriniz.");
			int index=scan.nextInt();
			
			System.out.println("Girdiğiniz inddexteki elemet : " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiğiniz index arrayde yok");
		}catch (InputMismatchException e) {
			System.out.println("Girdiğiniz index pozitif tamsayı olmalı");
	}

}
}