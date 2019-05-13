package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern22Generator {

	public void generatePattern22(int size) {

		// Print the top triangle cap
		System.out.println("*");
		if (size > 2)
			System.out.println("**");

		// Print top triangle body
		for (int i = 0; i < size - 3; i++) {
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
			System.out.print("*");

			for (int j = 0; j < size - 3 - i; j++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}

		// Print the bottom triangle cap
		if (size > 2)
			System.out.println("**");
		System.out.println("*");
	}
}
