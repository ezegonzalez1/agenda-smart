package com.juanieze.agenda.Entidades;

import java.util.Scanner;

public interface Interface {

	static Scanner in = new Scanner(System.in);

	public default void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
