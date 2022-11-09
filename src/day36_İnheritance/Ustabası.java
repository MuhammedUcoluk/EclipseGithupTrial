package day36_İnheritance;

import day35_Encapsulation_Inheritance.İsci;

public class Ustabası extends İsci{

	Ustabası(){
		
		System.out.println("ustabası parametresiz contructor çalıştı");
	}
	
	
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		Ustabası ust1=new Ustabası();
		
		// Java da her class oluşturulduğunda otomatik olarak default contructur oluştuğu gibi 
		// Extends olan yani CHİLD CLASS'ta oluşturulan her bir contructor un ilk satırında gizli super Contructor oluşturur.
		
		
	}

}
