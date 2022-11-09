package day31_DateAndtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now();
		
		System.out.println(tarih); //2022-09-13
		
		System.out.println(tarih.getDayOfYear()); // 256
		
		System.out.println(tarih.getDayOfMonth()); //13
		
		System.out.println(tarih.getDayOfWeek());//TUESDAY
		
		System.out.println(tarih.plusDays(20)); // 20 gün sonra tarih 2022-10-03

		System.out.println(tarih.plusWeeks(8)); // 8 hafta sonra tarih 2022-11-08

		System.out.println(tarih.plusMonths(5)); //  5 ay sonra tarih 2023-02-13
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); // 10 yıl 10 ay 10 gün sonra.
		
		System.out.println(tarih.minusYears(10).minusMonths(10).minusWeeks(10).minusDays(10)); // 10 yıl 10 ay 10 hafta 10 gün önce
		
		System.out.println(tarih.minusYears(21).isLeapYear()); // false
		
		LocalDate dogumTarihi=LocalDate.of(1998, Month.MAY, 11);
		
		LocalDate dogumTarihi2=LocalDate.of(2000, 01, 12);
		
		System.out.println(dogumTarihi + " ," + dogumTarihi2); //1998-05-11 ,2000-01-12
		
		System.out.println(dogumTarihi.isBefore(dogumTarihi2)); // true


	}

}
