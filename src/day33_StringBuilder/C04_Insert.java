package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder("Java ogrendik");
		
		// araya yı çok iyi ekleyelim
		
		sb.insert(4, "yı çok iyi");
		
		System.out.println(sb); //Javayı çok iyi ogrendik

		// sonuna ,yaşasın ekleyelim
		
		sb.append(", yaşasın");
		
		System.out.println(sb); //Javayı çok iyi ogrendik, yaşasın
		
		//Javayı çok çok iyi öğrendik, yaşasın yapıyoruz.
		String str2="çok iyiyim";
		
		sb.insert(7, str2,0, 4);
		
		System.out.println(sb);//Javayı çok çok iyi ogrendik, yaşasın

		

	}

}
