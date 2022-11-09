package day43_İnterfaces;

public class C03_Concrete implements C02_İnterface{

	public static void main(String[] args) {
		
		C03_Concrete concreteobje=new C03_Concrete();
		
		
		//İnterface de default keyword kullanarak oluşturduğumuz bodysi olan methodlara
		// child concrete classlardan obje vasıtası ile ulaşabilirim.
		concreteobje.kaporta();
		
		//İnterface de static keyword kullanarak oluşturduğumuz bodysi olan methodlara
		// child concrete classlardan interface ismi vasıtası ile ulaşabilirim.
		C02_İnterface.şanzıman();

	}
	
	//Bir interface de static veya default keyword kullanarak bodysi şolan bir method oluşturursak
	//Bu interface e implements eden concrete child class lar bu methodları 
	//implement etmek ZORUNDA DEĞİLDİR!!!
	
	@Override
	public void motor() {
		
		
	}

}
