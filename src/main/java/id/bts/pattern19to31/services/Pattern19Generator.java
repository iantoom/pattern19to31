package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern19Generator {

	public void generatePattern19(int size) {

		if(size % 2 == 0) {
			size = size - 1;
		}
		
		// Print triangle cap
		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}

		System.out.print("*");

		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}

		System.out.println("");

		if (size > 3) {
			// Triangle body
			for (int i = 0; i < size / 3; i++) {

				// Space outside Triangle
				for (int j = 0; j < size / 3 - i; j++) {
					System.out.print(" ");
				}

				System.out.print("*");

				// Space inside triangle
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print(" ");
				}

				System.out.println("*");
			} 
		}
		// Print triangle base
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}

		System.out.println("");
	}
}
