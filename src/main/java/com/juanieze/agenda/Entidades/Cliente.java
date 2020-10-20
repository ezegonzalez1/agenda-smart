package com.juanieze.agenda.Entidades;

import java.util.ArrayList;

public class Cliente implements Interface {

	private String nombre;
	private String apellido;
	private int dni;
	private String contraseña;
	private String mail;
	private Telefono telefono;
	private static ArrayList<Cliente> clientes;
	

	public Cliente() {
		
	}

	public Cliente(String nombre, String apellido, int dni, String contraseña, String mail, Telefono telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.contraseña = contraseña;
		this.mail = mail;
		this.telefono = telefono;
	}
	
	//esto es una prueba de eze

	public void newCliente() {
		String nombre, apellido, contraseña, mail;
		int dni;
		Telefono telefono = null;
		Cliente cliente = null;
		mostrarMensaje("Ingrese su nombre");
		nombre = in.nextLine();
		mostrarMensaje("Ingrese su apellido");
		apellido = in.nextLine();
		mostrarMensaje("Ingrese su numero de dni");
		dni = in.nextInt();
		mostrarMensaje("Cree una contraseña");
		contraseña = in.nextLine();
		mostrarMensaje("Ingrese su mail");
		mail = in.nextLine();
		telefono = telefono.datosTelefono();
		cliente = new Cliente(nombre, apellido, dni, contraseña, mail, telefono);
	}

	public boolean verificarDni(int n) {
		boolean existe = false;
		for (Cliente cliente : clientes) {
			cliente = clientes.get(0);
			if (n == cliente.getDni()) {
				existe = true;
			}
		}
		return existe;
	}

	public boolean verificarContraseña(String c) {
		boolean existe = false;
		for (Cliente cliente : clientes) {
			cliente = clientes.get(0);
			if (c.equals(cliente.getContraseña())) {
				existe = true;
			}
		}
		return existe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente> clientes) {
		Cliente.clientes = clientes;
	}
}
