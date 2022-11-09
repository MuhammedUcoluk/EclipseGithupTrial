package day39_overridingKuralları_Polymorphism;

public class C01 {

	
	public static void staticMethod() {
		System.out.println("Parent class static method çalıştı");
	}
	
	private void privateMethod() {
		System.out.println("Parent class private class çalıştı");
	}
	// FİNAL DEMEK BU SON HALİ BİR DAH ADEĞİŞTİRİLEMEZ DEMEKTİR.
	// DOLAYISI İLE FİNAL OLARAK TANIMLANAN BİR METHOD OVERRİDE EDİLEMEZ!!!
	public final void finalMerhod() {
		System.out.println("Parent class final method çalıştı");
	}
	// CHİLD CLASS İLE PPARENT CLASS AYNI PACKAGE DE OLDUKLARINDAN
	// METHODLARIN ACCESS MODİF. LARI PUBLİC , PROTECTED YA DA DEFAULT OLSAYDI HİÇBİR SORUN OLMAZDI
	// 
}
