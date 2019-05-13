package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern26Generator {

	public void generatePattern26(int size) {
		
		// Upper Triangles
		for (int i = 0; i < size - 1; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < (size - i) * 2 - 2; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Middle base
		for (int i = 0; i < size * 2; i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		// Bottom Triangles
		for (int i = 0; i < size - 1; i++) {
		
			for (int j = 0; j < size - 1 - i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < (i + 1) * 2; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < size - 1 - i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
