package day18_NestedWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullanıcıdan toplanmak üzere sayı isteyin.
		//Kullanıcı 0 a basıncaya kadar sayıları alıp toplamaya devam edin.
		// Kullanıcı 0 a bastığında o ana kadar 0 hariç kaç sayı girdiğini ve girilen sayılar toplamını yazdırın.

		// 	kULLANICIDAN 5 DEĞER ALIN DESE;
		
		for (int i = 1; i < 5; i++) {
			
		}
		
		Scanner scan=new Scanner(System.in);
		//Loopun içinde kullanacağım obje ve verable ları
		// Loop dan önce oluşturmak daha güzeldir.
		//Çünkü Loop un içinde oluşturursak
		//Loop her döndüğünde yeni bir obje ve veriable oluşturur ve hafozayı doldurur.
	
		int sayı=100; // 0 dışında ne yazsak olur 0 yazılınca işlem bitiyor soruya göre.
		int toplam=0; // girilen sayılar için Boş Kap
		int sayac=0;  // Kullanıcı kaç sayı girdi onun sayacı.
		
		while (sayı!=0) { // sayı 0  a eşit olana kadar şartını oluşturduk.
			System.out.println("Lütfen Toplama eklemek için bir tamsayı yazın.\nbitirmek için 0 a basın.");
			sayı=scan.nextInt();// int sayı=scan.next... yazmadık. sayı=scan.nextint... yazdık.
			toplam+=sayı;// Kullanıcının girdiği sayıyı toplama ekledik.
			sayac++;// sayaca her işlemde 1 ekledik.
			
			
		}
		// kullanıcı 0 a bastığında loop işlevini son kez yapıp başa dönecek ve loop bitecek.
		System.out.println("girilen sayı adedi: " + (sayac-1)); // 0 toplanmak toplam için değil bitirmek için 
		// o sebeple sayac-1 yaptık.
		System.out.println("girilne sayı toplamı: " + toplam);
		scan.close();
		
	}

}
