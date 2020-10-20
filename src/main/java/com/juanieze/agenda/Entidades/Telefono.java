package com.juanieze.agenda.Entidades;

import java.util.Scanner;

public class Telefono implements Interface {
	
	static Scanner in = new Scanner(System.in);
	
	private int codDeArea;
	private int numeroCelular;
	private int numeroFijo;
	
	
	
	public void newTelefono(int codDeArea, int numeroCelular, int numeroFijo) {
		this.codDeArea = codDeArea;
		this.numeroCelular = numeroCelular;
		this.numeroFijo = numeroFijo;
	}
	
	public Telefono datosTelefono() {
		Telefono telefono = new Telefono();
		mostrarMensaje("Ingrese su codigo de area");
		telefono.setCodDeArea(in.nextInt());
		mostrarMensaje("Ingrese su numero de celular");
		telefono.setNumeroCelular(in.nextInt());
		mostrarMensaje("Ingrese su numero de telefono fijo u otro celular");
		telefono.setNumeroFijo(in.nextInt());
		return telefono;
	}
	

	public int getCodDeArea() {
		return codDeArea;
	}
	public void setCodDeArea(int codDeArea) {
		this.codDeArea = codDeArea;
	}
	public int getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public int getNumeroFijo() {
		return numeroFijo;
	}
	public void setNumeroFijo(int numeroFijo) {
		this.numeroFijo = numeroFijo;
	}
	
	
}
