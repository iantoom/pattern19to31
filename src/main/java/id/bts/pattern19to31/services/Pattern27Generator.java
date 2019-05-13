package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern27Generator {

	public void generatePattern27(int size) {

		// Top triangles
		for (int i = 0; i < size; i++) {
			starsDrawer1(size, i);
			spaceDrawer1(i);
			starsDrawer1(size, i);
			System.out.println("");
		}

		for (int i = 0; i < size - 1; i++) {
			starsDrawer2(i);
			spaceDrawer2(size, i);
			starsDrawer2(i);
			System.out.println("");
		}
	}

	/**
	 * <p>
	 * contoh:
	 * 
	 * <p>
	 * n = 4
	 * <p>
	 * xxxx
	 * <p>
	 * xxx
	 * <p>
	 * xx
	 * <p>
	 * x
	 * 
	 * @param size
	 * @param i
	 */
	private void starsDrawer1(int size, int i) {
		for (int j = 0; j < size - i; j++) {
			System.out.print("*");
		}
	}

	private void spaceDrawer1(int i) {
		for (int j = 0; j < i * 2; j++) {
			System.out.print(" ");
		}
	}

	private void starsDrawer2(int i) {
		for (int j = 0; j < i + 2; j++) {
			System.out.print("*");
		}
	}

	private void spaceDrawer2(int size, int i) {
		for (int j = 0; j < (size - i) * 2 - 4; j++) {
			System.out.print(" ");
		}
	}
}
