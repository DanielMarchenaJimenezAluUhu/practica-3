package main;

public class Cuenta {

	String numero;
	String titular;
	double saldo;
	
	public Cuenta(int i) {
		this.saldo = i;
	}

	public Cuenta(String string, int i) {
		this.numero = string;
		this.saldo = i;
	}

	public void ingreso(int i) {
		saldo += i;
	}

	public void reintegro(int i) {
		if (saldo - i >= -500)
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
