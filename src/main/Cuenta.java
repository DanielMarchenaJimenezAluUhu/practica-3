package main;

public class Cuenta {

	String numero;
	String titular;
	double saldo;
	
	public Cuenta(int i) {
		this.saldo = i;
	}

	public void ingreso(int i) {
		saldo += i;
	}

	public void reintegro(int i) {
		saldo -= i;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
