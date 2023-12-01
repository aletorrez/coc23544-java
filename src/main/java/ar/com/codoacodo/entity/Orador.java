package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fechaAlta;
	
	public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		init(nombre, apellido, mail, tema, fechaAlta);
	}

	public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.id = id;
		init(nombre, apellido, mail, tema, fechaAlta);
	}
	
	private void init(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
}
