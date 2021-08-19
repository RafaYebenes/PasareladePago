package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonRootName;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	public int idusuarios;

	public String nombre;

	public String apellido;

	public String mail;

	public String contrasenia;

	public Date fechaalta;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idusuarios, String nombre, String apellido, String mail, String contrasenia, Date fechaalta) {
		super();
		this.idusuarios = idusuarios;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasenia = contrasenia;
		this.fechaalta = fechaalta;
	}

	public int getIdusuarios() {
		return idusuarios;
	}

	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [idusuarios=" + idusuarios + ", nombre=" + nombre + ", apellido=" + apellido + ", mail="
				+ mail + ", contrasenia=" + contrasenia + ", fechaalta=" + fechaalta + "]";
	}

	
	public boolean isEmpty() {

		int cont = 0;
		if (this.idusuarios == 0)
			cont++;
		if (this.nombre == null && "".equals(this.nombre))
			cont++;
		if (this.apellido == null && "".equals(this.apellido))
			cont++;
		if (this.mail == null && "".equals(this.mail))
			cont++;
		if (this.contrasenia == null && "".equals(this.contrasenia))
			cont++;

		if (cont == 0) {
			return false;
		} else {
			return true;
		}
	}
	
}
