package id.bts.pattern19to31.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern30Generator {

	public void generatePattern30(int size) {
		
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
