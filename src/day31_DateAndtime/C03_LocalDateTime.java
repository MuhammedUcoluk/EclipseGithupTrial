package day31_DateAndtime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		
		LocalDateTime tarihsaat=LocalDateTime.now();
	
		System.out.println(tarihsaat); //2022-09-13T22:25:29.550798900
		
		tarihsaat.toString().startsWith("2022");
		System.out.println(tarihsaat.toString().startsWith("2021")); // 2021 ile mi başlıyor diye sorduk FALSE
	
	}
	

}
