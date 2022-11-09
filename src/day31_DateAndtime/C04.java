package day31_DateAndtime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Bir string ve bir int variables oluşturalım
		// Bir loop içeriisinde bu variable leri 1000 kere değiştirelim
		// işlem sürelerini kıyaslayalım.
		
		LocalTime zaman= LocalTime.now();
		System.out.println("başlangıç saati : " + zaman); //22:02:30.617671100

		int sayı=10;
		for (int i = 0; i <10000; i++) {				//FOR LOOPUN ÇALIŞMA SÜRESİNİ HESAPLADIK!!!!!!!!!!
			sayı++;
		}
		
		LocalTime zaman1 = LocalTime.now();
		System.out.println("bitiş saati : " + zaman1); //22:02:30.619675200
		 
		
		double nano1=zaman.getNano();
		double nano2=zaman1.getNano();
		
		System.out.println(" İnt For Loop " + (nano1-nano2) + " nano saniyede tamamladı"); //İnt For Loop -3000600.0 nano saniyede tamamladı
		
		
		LocalTime zamanS= LocalTime.now();
		System.out.println("başlangıç saati : " + zamanS);  //22:18:01.869980500

		String str="Ali";
		for (int i = 0; i <10000; i++) {				//FOR LOOPUN ÇALIŞMA SÜRESİNİ HESAPLADIK!!!!!!!!!!
			str+=" ";
		}
		
		LocalTime zaman1S = LocalTime.now();
		System.out.println("bitiş saati : " + zaman1S);// 22:18:01.963100100
		 
		
		double nano1S=zamanS.getNano();
		double nano2S=zaman1S.getNano();
		
		System.out.println(" String For Loop " + (nano2S-nano1S) + " nano saniyede tamamladı"); //İnt For Loop -3000600.0 nano saniyede tamamladı
		
		
		
		
		
		
		
		

	}

}
