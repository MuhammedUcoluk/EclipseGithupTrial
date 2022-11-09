package day39_overridingKuralları_Polymorphism;

public class C02 extends C01 {
	
	public static void main(String[] args) {
		
		C02 obj1=new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01 obj2=new C02();
		//obj2.privateMethod();
		//data türü C01 OLDUĞUNDAN ÖNCELİKLE C01 CLASSINDAKİ METHODA BAKMAMIZ GEREKİR 
		//ANCAK PRİVATE OLDUĞUNDAN ULAŞAMAYIZ. ULAŞAMADIĞIMIZ BİR METHODU OVERRİDE YAPAMAYIZ!!!
		//DOLAYISI İLE SİGNATURE AYNI OLMASINA RAĞMEN BU İKİSİ FARKLI İKİ METHOD OLARAK ÇALIŞIR.
		obj2.staticMethod();
		// STATİC METHODLAR OVERRİDE EDİLEMEZ. EDİLEMEDİĞİ İÇİN 
		//SİGNATURE AYNI OLMASINA RAĞMEN BU İKİSİ FARKLI İKİ METHOD OLARAK ÇALIŞIR.
	}

	public static void staticMethod() {
		System.out.println("Child class static method çalıştı");
	}
	
	private void privateMethod() {
		System.out.println("Child class private class çalıştı");
	}
	/*
	public final void finalMerhod() {									//FİNAL METHOD OVERRİDE EDİLEBİLEMEZ!!!
		System.out.println("Parent class final method çalıştı");
	}*/
}
