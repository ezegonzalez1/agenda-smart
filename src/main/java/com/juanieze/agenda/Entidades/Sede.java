package com.juanieze.agenda.Entidades;

import java.util.ArrayList;

public class Sede {
	private String nombreSede;
	private String codigoSede;
	private String mailSede;
	private String direccion;
	private String altura;
	private String descripcion;
	private String horaApertura;
	private String horaClausura;
	private Telefono telefono;
	private Enum <Dia> dias;
	private ArrayList<Turno> turnos;

}
