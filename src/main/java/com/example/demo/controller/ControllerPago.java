package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Compra;
import com.example.demo.model.Estado;
import com.example.demo.services.ValidacionService;



@RestController
@RequestMapping("/pasarela")
public class ControllerPago {

	@Autowired
	ValidacionService vService;
	
	
	@PostMapping("/compra")
	public ResponseEntity<Estado> compra(@RequestBody Compra compra) {
		System.out.println("Pasarela de Pago\n" + compra.toString());
		ResponseEntity<Estado> response = new ResponseEntity<>()
				vService.validateCompra(compra);		
		
	}
	
}
