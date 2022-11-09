package day30_MutableımmutableDateTime;

public class C02_Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Ali";
		
		for (int i = 0; i < 100; i++) {
			str+="";
			
			
		}
		// Bu kod çalıştığında java kaç obje oluşturur?
		
		// Bir obje başta oluşturuldu. Loop ta 100 obje daha oluşturuldu. Dolayısı ile 
		// Bu kod çalıştığında biz ekranda hiçbirşey görmeyiz ama Java toplamda 101 obje oluşturmuş olur.
		// str ın son değeri "Ali      (100 tane boşluk)" şeklini alır.
	}

}
