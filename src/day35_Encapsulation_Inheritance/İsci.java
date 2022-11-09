package day35_Encapsulation_Inheritance;

public class İsci extends Muhasebe {

	protected String statü;
	protected String meslegi;
	protected String sendika;
	
	public İsci(){
		System.out.println("isci parametresiz contructor çalıştı");
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		İsci isci1=new İsci();
		isci1.meslegi="Kaynakcı";
		isci1.saatUcreti=20;
		isci1.isim="Emine";
		isci1.maas=isci1.maasHesapla();
		System.out.println(isci1.isim + " 'in maasi :" + isci1.maas); // 4000
		
		
		
		
		
		
	}

}
