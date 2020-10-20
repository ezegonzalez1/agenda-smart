package com.juanieze.agenda;

import java.util.Scanner;
import com.juanieze.agenda.Entidades.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReservameApplication {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ReservameApplication.class, args);

		/*
		mostrarMensaje("Bienvenido");
		ingresar();
		registrarse();
		*/
	}

	/*
	static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	
	static void ingresar() {
		// valida usuario(dni) y contraseña
		boolean paso1, paso2;
		int dni;
		String contraseña;
		Cliente cliente = new Cliente();
		do {
			mostrarMensaje("Ingrese su numero de dni");
			dni = in.nextInt();
			mostrarMensaje("Ingrese su contraseña");
			contraseña = in.nextLine();
			paso1 = cliente.verificarDni(dni);
			paso2 = cliente.verificarContraseña(contraseña);
			if (paso1 != true || paso2 != true) {
				mostrarMensaje("Usuario y/o contraseña incorrectos");
			}
		} while (paso1 != true || paso2 != true);
	}

	static void registrarse() {

	}
	*/
}
