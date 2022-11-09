package day31_DateAndtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihsaat=LocalDateTime.now();
		
		System.out.println(tarihsaat); //2022-09-13T22:28:53.741975500

		// Eğer tarih veya saati kendi istediğimiz formatta yazdırmak istersek;
		// gün / ay / yıl  saat:dakika şeklinde bir formatta yazdırmak istiyorum. 
		
		DateTimeFormatter düzenle = DateTimeFormatter.ofPattern("dd / MM / YYYY EEE  HH : mm");
		
		System.out.println(düzenle.format(tarihsaat)); //13 / 09 / 2022 Sal  22 : 36

		/*
		 Format oluştururken 
		 gün için 
		 d: başta 0  varsa onu yazmadan gün numarası
		 dd:tek haneli günleri 01 gibi basına sıfır yazarak gün numarası
		 DDD: yılın kaçıncı günü
		 E, EE, EEE: hangi gündeysen tarih saat arasına Sal şeklinde
		 EEEE: gün isminin tamamı.
		 
		 Ay için ( ay için M dakika için m kullanılır.
		 M: başta 0 varsa onu y zamadan ay numarası
		 MM: tek haneli ayları başta 01 gibi basına sıfır yazarak
		 MMM: Ay isminin ilk üç harfi 
		 MMMM: ay isminin tamamı
		 
		 Yıl
		  YY: Yılın son iki rakamı
		  YYYY: Yılın tamamını yazdırır.
		  
		  Saat: (24saat üzerinden istiyorsak H 12 üzerinden istiyorsak h )
		  HH : Saatin tamamı , tek rakamlı saat olursa 02 gibi.
		  H: Tek rakamlı saat olursa sadece saati..
		  a yazarsak AM veya PM olarak verir.
		 */

	}

}
