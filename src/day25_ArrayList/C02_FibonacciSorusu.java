package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_FibonacciSorusu {

	public static void main(String[] args) {
		// verilen bir sayıdan, küçük Fibonacci sayılarını bir list olarak kaydedelim.
		
		// 1,1,2,3,5,8,13,21,34,55..... buna Fibonacci diyoruz.
		
		int sinir=100;
		
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int sayı=0;
		
		
		while(sayı<sinir) {
		
			sayı= fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1); // burada dinamik olması için size-2ile size-1 topladık.
			fibonacci.add(sayı);
			
			
		}	
		
		System.out.println(fibonacci);// [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144] sonraki 100 den büyük 144 ü silmek için
		fibonacci.remove(fibonacci.size()-1); // Bunu yazdık.
		System.out.println(fibonacci); //[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

		
	}

}
