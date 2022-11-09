package day26_ForEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep classından bir obje oluşturlaım ve özelliklerini yazdıralım.
		
		Jeep jeep1=new Jeep();
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " + jeep1.yıl);
							//10000 1001 null null 2001
		// Jeep classındaki veriables lar instance veriables olduklarından
		// Atadığım değerler sadece benim objem için değerleri değiştirir. 
		// Jeep class ındaki değerlere hiçbirşey yapmaz.
		
		
		
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model= "Corolla";
		jeep1.yıl=2005;
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " + jeep1.yıl);
		//15000 1002 Toyota Corolla 2005
		
		jeep1.hız(150);
		jeep1.yakıt("dizel");
	}

}
