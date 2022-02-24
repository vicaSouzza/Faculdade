package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class primos {

	public static void main(String[] args) {

		int primo = 0;

		for (int i = 2; i <= 50; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					primo++;
				}
			}
			if (primo == 2) {
				System.out.println("O número " + i + " é PRIMO!");
				
		
			}
			primo=0;
			
		
		}   

	}

}
