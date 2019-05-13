package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern25Generator {

	public void generatePattern25(int size) {
		// Print parallelogram cap
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}

		System.out.println("");

		// Print parallelogram body
		for (int i = 0; i < size - 2; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < size - 2; j++) {
				System.out.print(" ");
			}

			System.out.println("*");

		}

		// Print parallelogram bottom
		for (int i = 0; i < size - 1; i++) {
			System.out.print(" ");
		}

		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
