package com.example.demo.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class Evento {

	private int id;
	private String nombre;
	private String descripcioCorta;
	private String descripciónExtendida; 
	private String foto;
	@Temporal(TemporalType.DATE)
	private Date fechaEvento; 
	private int horaEvento;

	//rango precios, política de acceso, sala/Recinto (nombre, lugar, dirección, aforo)
	
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento(int id, String nombre, String descripcioCorta, String descripciónExtendida, String foto,
			Date fechaEvento, int horaEvento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcioCorta = descripcioCorta;
		this.descripciónExtendida = descripciónExtendida;
		this.foto = foto;
		this.fechaEvento = fechaEvento;
		this.horaEvento = horaEvento;
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

	public String getDescripcioCorta() {
		return descripcioCorta;
	}

	public void setDescripcioCorta(String descripcioCorta) {
		this.descripcioCorta = descripcioCorta;
	}

	public String getDescripciónExtendida() {
		return descripciónExtendida;
	}

	public void setDescripciónExtendida(String descripciónExtendida) {
		this.descripciónExtendida = descripciónExtendida;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	
	public void setFechaEvento(String fechaEvento){
        try {
        	this.fechaEvento = new Date(new SimpleDateFormat("dd/MM/yyyy").parse(fechaEvento).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

	public int getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(int horaEvento) {
		this.horaEvento = horaEvento;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", nombre=" + nombre + ", descripcioCorta=" + descripcioCorta
				+ ", descripciónExtendida=" + descripciónExtendida + ", foto=" + foto + ", fechaEvento=" + fechaEvento
				+ ", horaEvento=" + horaEvento + "]";
	} 
	
	
	public boolean isEmpty() {
		
		int cont = 0;
		if( this.id == 0 ) cont++;
		if( this.nombre == null && "".equals(this.nombre) ) cont++;
		if( this.descripcioCorta == null && "".equals(this.descripcioCorta)) cont++;
		if( this.descripciónExtendida == null && "".equals(this.descripciónExtendida)) cont++;
		if( this.fechaEvento == null && "".equals(this.fechaEvento)) cont++;
		if( this.horaEvento < 0 && this.horaEvento > 24) cont++;
		
		if(cont == 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
