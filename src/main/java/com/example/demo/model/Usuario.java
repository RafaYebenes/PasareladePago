package com.example.demo.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Rafa Yébenes
 *
 */

public class Usuario {

	private int id;
	private String nombre;
	private String apellido1;
	private String mail;
	private String contraseña;


	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nombre, String apellido1, String mail, String contraseña, Date fechaAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.mail = mail;
		this.contraseña = contraseña;
		this.fechaAlta = fechaAlta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		try {
		    this.fechaAlta = new Date(new SimpleDateFormat("dd/MM/yyyy").parse(fechaAlta).getTime());		
		    System.out.println(this.fechaAlta);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isEmpty() {

		int cont = 0;
		if (this.id == 0)
			cont++;
		if (this.nombre == null && "".equals(this.nombre))
			cont++;
		if (this.apellido1 == null && "".equals(this.apellido1))
			cont++;
		if (this.mail == null && "".equals(this.mail))
			cont++;
		if (this.contraseña == null && "".equals(this.contraseña))
			cont++;

		if (cont == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", mail=" + mail
				+ ", contraseña=" + contraseña + ", fechaAlta=" + fechaAlta + "]";
	}

}
