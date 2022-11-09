package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("resource")
			FileInputStream fis=new FileInputStream("src\\day40\\yazı.txt");
			int k=0;
			while ((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
		
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Görev Tamamlandı");
	}	
	
}
