package main;

import java.util.ArrayList;
import java.util.List;

import main.Movimiento.Signo;

public class Cuenta {

	String numero;
	String titular;
	double saldo;
	List<Movimiento> movimientos;
	
	public Cuenta(int i) {
		this.saldo = i;
		
		movimientos = new ArrayList<Movimiento>();
	}

	public Cuenta(String string, int i) {
		this(i);
		this.numero = string;
	}

	public void ingreso(double i) {
		Movimiento m = new Movimiento(i, Signo.H, String.format("Ingreso de %f", i));
		
		saldo += i;
		
		movimientos.add(m);
	}

	public void reintegro(double i) {
		Movimiento m = new Movimiento(i, Signo.D, String.format("Reintegro de %f", i));
		
		if (saldo - i >= -500)
			saldo -= i;
		else
			m.setDetalle(String.format("Fondos insuficientes (saldo %f€) en la cuenta %s para el reintegro de %f", saldo, numero, i));
		
		movimientos.add(m);
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
