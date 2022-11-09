package day26_ForEachLoop_Constructor;

public class Car {
	
	// java biz bir class oluşturduğumuzda o class tan obje üreteceğimizi bilir ve 
	// her class a default bir constructor yerleştirir. 
	// Java nın classa koyuğu bu default constructor görünmez ama obje üretmek üzere kod yazdığımızda 
	// Otomatik olarak devreye girer.
	
	
	// bir constructor oluşturmak çok kolaydır.
	// methoda benzer ama biraz farklıdır.
	// 1 - Constructor ismi class ismi ile aynı olmalıdır. 
	// class ismi büyük harfle başladığı için Constructor ismi de büyük harfle başlar.
	// (Method küçük harfle başlarken Constructor büyük harfle başlar.)
	// Constructor ların return type ı olmaz.
	// ( Methodun mutlaka return type ı vardır. Constructorun olmaz.)
	
	public Car() {
	
	}
	
	
	public int yıl=2000;
	public String renk;
	public String model;
	public int km;
	public boolean satılıkMı;
	
	
	// Bugün itibari ile class larda main method olma mecburiyeti kaldırılmıştır :))
	// Ancak bilddiğimiz gibi main method olmayan bir class direk çalıştırılamaz.
	// Main methodu olmayan class lar başka class lardan obje oluşturlarak kullanılmak üzere ihtiyaç duyulan
	// Variables ve methodları sakladığımız bir depo gibidir.
	

}
