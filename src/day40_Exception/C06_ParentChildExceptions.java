package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("unused")
public class C06_ParentChildExceptions {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis=new FileInputStream("src\\day40\\yazı.txt");
			int k=0;
			while ((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
		
		} catch (IOException e) {
		
			e.printStackTrace();
		
			
		}
		System.out.println("");
		System.out.println("Görev Tamamlandı");

	}

}
