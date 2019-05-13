package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern21Generator {

	public void generatePattern21(int size) {
		
		if(size % 2 == 0) {
			size = size - 1;
		}
		
		// Print top triangle cap
		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}

		System.out.print("*");

		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}

		System.out.println("");

		// Triangle top body
		if (size > 3) {
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

				System.out.print("*");

				System.out.println("");
			}
		}

		// Print triangle base
		System.out.print("*");

		for (int i = 0; i < size - 2; i++) {
			System.out.print(" ");
		}

		System.out.println("*");

		// Triangle bottom body
		if (size > 3) {
			for (int i = 0; i < size / 3; i++) {

				// Space outside Triangle
				for (int j = 0; j < i + 1; j++) {
					System.out.print(" ");
				}

				System.out.print("*");

				// Space inside triangle
				for (int j = 0; j < size - 4 - i * 2; j++) {
					System.out.print(" ");
				}

				System.out.print("*");

				System.out.println("");
			}
		}

		// Print bottom triangle cap
		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}

		System.out.print("*");

		for (int i = 0; i < size / 2; i++) {
			System.out.print(" ");
		}

		System.out.println("");

	}
}
