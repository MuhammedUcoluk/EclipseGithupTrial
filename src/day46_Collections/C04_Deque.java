package day46_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {

		Deque<String> ciftBaslı=new LinkedList<>();
		
		ciftBaslı.add("Yıldız");
		ciftBaslı.add("Ali");
		System.out.println(ciftBaslı); // [Yıldız, Ali] add() Queue den geldiğinde sona ekler.
		
		ciftBaslı.addLast("Emine");
		System.out.println(ciftBaslı);//[Yıldız, Ali, Emine] Deque den gelen özellik.
		
		System.out.println(ciftBaslı.pop()); //Yıldız sildiği ilk elemanı döndürdü.
		System.out.println(ciftBaslı); //[Ali, Emine] ilk elementi sildi.
		
		ciftBaslı.push("Seyfullah");
		System.out.println(ciftBaslı); //[Seyfullah, Ali, Emine]
		
		ciftBaslı.add(null);
		System.out.println(ciftBaslı); //[Seyfullah, Ali, Emine, null] 
	}

}
