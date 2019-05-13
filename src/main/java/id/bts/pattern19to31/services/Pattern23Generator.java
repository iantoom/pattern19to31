package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern23Generator {

	public void generatePattern23(int size) {
		// Print the top triangle cap
		for (int i = 0; i < size - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");

		if (size > 2) {
			for (int i = 0; i < size - 2; i++) {
				System.out.print(" ");
			}
			System.out.println("**");
		}

		// Print top triangle body
		for (int i = 0; i < size - 3; i++) {

			for (int j = 0; j < size - 3 - i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}

		// Print the middle base
		System.out.print("*");
		for (int i = 0; i < size - 2; i++) {
			System.out.print(" ");
		}
		System.out.println("*");

		// Print the bottom triangle body
		for (int i = 0; i < size - 3; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j < size - 3 - i; j++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}

		// Print the bottom triangle cap
		if (size > 2) {
			for (int i = 0; i < size - 2; i++) {
				System.out.print(" ");
			}
			System.out.println("**");
		}

		for (int i = 0; i < size - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");

	}
}
