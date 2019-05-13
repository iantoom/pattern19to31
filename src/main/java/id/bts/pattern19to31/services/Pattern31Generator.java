package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern31Generator {

	public void generatePattern31 (int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		for (int i = 0; i < size - 2; i++) {
			System.out.print("*");
			
			for (int j = 0; j < size - 2; j++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
