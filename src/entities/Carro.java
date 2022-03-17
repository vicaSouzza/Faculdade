package entities;

public class Carro {

	private String modelo;
	private int ano;
	private double tanque;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public void abastecerCarro(Carro carro, double qtdGas) {
		tanque = carro.getTanque();

		tanque = +tanque + qtdGas;
		System.out.println("Metodo abastecerCarro, Tanque " + tanque);

	}

	public void abastecerTanque(int tanque, double qtdGas) {

		//o metodo abastecerTanque tem o parametro tanque do tipo int e na classe ele é double
		//tanque =+tanque + qtdGas); 
		//System.out.println("Metodo abastecerTanque, Tanque " + tanque);
		
		System.out.println("o metodo abastecerTanque tem o parametro tanque do tipo int e na classe ele é double");

	}

	@Override
	public String toString() {
		double qtdGas = 0;
		tanque = +tanque + qtdGas;
		return "" + "modelo = " + modelo + ", ano = " + ano + ", tanque = " + tanque;
	}

}
