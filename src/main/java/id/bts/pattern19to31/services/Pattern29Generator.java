package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern29Generator {

	public void generatePattern29(int size) {

		if(size % 2 == 0) {
			size = size - 1;
		}
		
		// triangle base
		for (int i = 0; i < size; i++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println("");

		// Upper triangle body
		for (int i = 0; i < size - 2; i++) {

			for (int j = 0; j < 1 + i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < (size - i) * 2 - 5; j++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}

		// Middle padding
		for (int i = 0; i < size - 1; i++) {
			System.out.print(" ");
		}

		System.out.print("*");

		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}
		System.out.println("");

		// Bottom triangle
		for (int i = 0; i < size - 2; i++) {

			for (int j = 0; j < size - 2 - i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < 1 + i * 2; j++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}

		// Bottom Padding
		for (int i = 0; i < size; i++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println("");
	}
}
