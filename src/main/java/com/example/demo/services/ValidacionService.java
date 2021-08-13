package com.example.demo.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IValidacionService;
import com.example.demo.model.Compra;
import com.example.demo.model.Estado;
import com.example.demo.model.Evento;
import com.example.demo.model.Usuario;

@Service
public class ValidacionService implements IValidacionService {

	@Override
	public int validateUser(Usuario u) {
		
		if(u == null) return 1;
		if(u.isEmpty()) return 2;
		if(!u.getMail().contains("@")) return 3;
		if(u.getFechaAlta().after(new Date())) return 4;
		
		return 0;
	}

	@Override
	public int validateEvento(Evento e) {
		
		if(e == null) return 1;
		if(e.isEmpty()) return 2;
		if(e.getFechaEvento().before(new Date()) ) return 3;
		return 0;
	}

	@Override
	public Estado validateCompra(Compra c) {
		
		Estado status = new Estado();
		int resultadoValidacionEvento = validateEvento(c.getEvento());
		
		
        if( resultadoValidacionEvento != 0) {
        	status.setError(true);
        	
        	if(resultadoValidacionEvento == 1) {
        		status.setMsg("Error, el evento es nulo");
        		status.setCode("400.1239");
        	}
        	
        	if(resultadoValidacionEvento == 2) {
        		status.setMsg("Error, el evento tiene campos nulos");
        		status.setCode("400.1239");
        	}
        	
        	if(resultadoValidacionEvento == 3) {
        		status.setMsg("Error, la fecha del evento ya ha pasado");
        		status.setCode("400.1151");
        	}
        }
        
        int resultadoValidacionUser = validateUser(c.getUsuario());
        
        if(resultadoValidacionUser != 0){
        	status.setError(true);
        	
        	if(resultadoValidacionUser == 1) {
        		status.setMsg("Error, el usuario es nulo");
        		status.setCode("400.1239");
        	}
        	
        	if(resultadoValidacionUser == 2) {
        		status.setMsg("Error, el usuario tiene campos nulos");
        		status.setCode("400.1239");
        	}
        	if(resultadoValidacionUser == 3) {
        		status.setMsg("Error, el email del usuario no es valido");
        		status.setCode("400.1016");
        	}
        	
        	if(resultadoValidacionUser == 4) {
        		status.setMsg("Error, la fecha de alta no puede ser posterior a la fecha de hoy");
        		status.setCode("400.1151");
        	}
        }
        
        
        if(resultadoValidacionEvento == 0 && resultadoValidacionUser == 0) {
        	status.setCode("200");
        	status.setMsg("Proceso completado con exito");
        	status.setError(false);
        }
		
		return status;
	}
	

}
