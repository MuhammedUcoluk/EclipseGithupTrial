package day18_NestedWhileLoop;

import java.util.Scanner;

public class C01_FoorLoop {

	public static void main(String[] args) {
		// Kullanıcıdan 2 tam sayı isteyin
		// İlk sayıdan başlayarak ikinci sayıya kadar 3 er 3 er yazdrın.
		// ikinci sayı dahil olmak zorunda değil.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki tamsayı giriniz\nilk sayıyı girdikten sonra entera basınız.");
		int sayı1=scan.nextInt();
		int sayı2=scan.nextInt();
		
		if 		(sayı1>sayı2) 	{
				for (int i = sayı1; i >= sayı2; i-=3) {//azalarak 
					System.out.print(i+ " ");
				}
		}else if(sayı1<sayı2)	{
				for (int i = sayı1; i <= sayı2; i+=3) {// artarak
					System.out.println(i+ " ");
				}
		}else 	{
			System.out.println("girilen sayılar eşit");
			scan.close();
	}

}
}