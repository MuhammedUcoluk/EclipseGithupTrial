package day42_AbstractClasses;

public class AbsUstabaşı extends Absİşçi {

	// Concrete bir child class parenti olan abstract lardaki tüm abstract methodları inclement etmelidir.
	// ama parent olan abstrackt classlardaki concrete methodları inclement etmek zorunda değildir.
	public static void main(String[] args) {
		
		AbsUstabaşı ust1=new AbsUstabaşı();
		ust1.statu();
		ust1.maas();
		ust1.mesai(); 

	}

	@Override
	public void mesai() {
		System.out.println("Bu classtaki tüm personle ustabaşıdır... İmza:USTABAŞI");
		
	}

	@Override
	public void maas() {
		System.out.println("Ustabaşılar aylık 10000 TL maaş alır... İmza:USTABAŞI");
		
	}

	@Override
	public void statu() {
		System.out.println("Bu classtaki tüm personle ustabaşıdır... İmza:USTABAŞI");
		
	}

	

}
