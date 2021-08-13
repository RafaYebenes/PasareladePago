package com.example.demo.interfaces;

import com.example.demo.model.Compra;
import com.example.demo.model.Estado;
import com.example.demo.model.Evento;
import com.example.demo.model.Usuario;

public interface IValidacionService {

	public int validateUser(Usuario u);
	public int validateEvento(Evento e);
	public Estado validateCompra(Compra c);
}
