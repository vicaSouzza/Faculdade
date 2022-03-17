package aplication;

import java.util.Scanner;

import entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o modelo do carro?");
		String nome = sc.nextLine();
		carro.setModelo(nome);
		System.out.println("Qual o ano do carro?");
		int ano = sc.nextInt();
		carro.setAno(ano);
		System.out.println("Qual o a quantidade de gasolina tem no carro?");
		double tanque = sc.nextDouble();
		carro.setTanque(tanque);

		System.out.println("Qual a quantidade de gasolina vc quer abastecer? ");
		double gas = sc.nextDouble();
		double qtdGas = gas;

		carro.abastecerCarro(carro, qtdGas);
		System.out.println();
		System.out.println(carro);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		carro.abastecerTanque((int) tanque, qtdGas);
		System.out.println();
		System.out.println("----------------------------");

	}
}
