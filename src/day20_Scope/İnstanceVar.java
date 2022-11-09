package day20_Scope;

public class İnstanceVar {
	
	int notMat=50;
	int notFen;
	
	public static void main(String[] args) {
		
	//	System.out.println(notMat); // main method static olduğu için static olmayan variablal ar 
		
		// main method da direk kullanılamaz veya görüntülenemez.
		
		// instance variable lara main methodd an ulaşmak isteersek obje oluşturup obje üzerinden erişim sağlayabiliriz.
		// ör= Scanner scan= new Scanner (System.in);
		// içinde olduğumuz calss tan bir obje oluşturalım
		İnstanceVar celil=new İnstanceVar();
		System.out.println(celil.notMat); // 50
		
		İnstanceVar nihal=new İnstanceVar();
		nihal.notMat=70;
		System.out.println(nihal.notMat); // 70 
	}
	
	public static void staticMethod() {
		
	}
	
	public void method() {
		
	}

}
