package day31_DateAndtime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		LocalTime zaman= LocalTime.now();
		System.out.println("başlangıç saati : " + zaman); //22:02:30.617671100

		int sayı=10;
		for (int i = 0; i <10000; i++) {				//FOR LOOPUN ÇALIŞMA SÜRESİNİ HESAPLADIK!!!!!!!!!!
			sayı++;
		}
		
		LocalTime zaman1 = LocalTime.now();
		System.out.println("bitiş saati : " + zaman1); //22:02:30.619675200
		 
		// eğer bir işlmein başlangıç ve bitiş süreleri farkını almak istersek
		// HEM BAŞINDA HEM SONUNDA LOCALTİME OLUŞTURMALIYIZ.
		
		double nano1=zaman.getNano();
		double nano2=zaman1.getNano();
		
		System.out.println("For Loop " + (nano1-nano2) + " nano saniyede tamamladı"); //For Loop -2999900.0 nano saniyede tamamladı
		
		System.out.println(zaman.getMinute()); //19
		System.out.println(zaman.plusMinutes(10000));// 10000 dakika sonra.  20:59:43.761262900
		System.out.println(zaman.minusHours(20)); //02:20:21.407353900 20 saat önce
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Japan"));
		System.out.println(yerelSaat); // Japonya da saat 04:23:15.347614700
		 
	}

}
