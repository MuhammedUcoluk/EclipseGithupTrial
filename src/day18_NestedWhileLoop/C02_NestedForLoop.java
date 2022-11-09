package day18_NestedWhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanıcıdan 10 dan küçük pozitif bir tamsayı girmesini isteyin.
		// Girdiği sayıya göre aşağıdaki şekli yazdırın.
		// Ör: 3 girilirse 		1
							//  1 2									ÜÇGEN NESTEDFORLOOP
							//  1 2 3
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 10 dan küçük bir tamsayı giriniz.");
		int sayı=scan.nextInt();
		
		for (int satır = 1; satır <=sayı; satır++) {
			for (int i = 1; i <= satır; i++) {
				System.out.print(i+ " ");
			}
			System.out.println("");
			
			scan.close();
		}
	
	}						

}
