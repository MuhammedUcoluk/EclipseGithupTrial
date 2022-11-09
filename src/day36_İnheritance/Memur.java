package day36_İnheritance;

import day35_Encapsulation_Inheritance.Muhasebe;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		
		Memur memur1=new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.maasHesapla();
		System.out.println(memur1.isim + " in maaşı : " + memur1.maas); //Hasan in maaşı : 3200
		
		

	}

}
