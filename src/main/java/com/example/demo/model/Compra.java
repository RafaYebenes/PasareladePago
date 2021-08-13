package com.example.demo.model;

public class Compra {

	private Evento evento;
	
	private Usuario usuario;
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compra(Evento evento, Usuario usuario) {
		super();
		this.evento = evento;
		this.usuario = usuario;
	}
	
	public Evento getEvento() {
		return evento;
	}
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Compra [evento=" + evento + ", usuario=" + usuario + "]";
	}
	
	
	
}
