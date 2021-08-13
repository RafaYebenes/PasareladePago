package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Compra;
import com.example.demo.model.Estado;
import com.example.demo.services.ValidacionService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/venta")
public class Controller {

	@Autowired
	ValidacionService vService;

	
	
	@RequestMapping(path = "/comprar", method = RequestMethod.POST,
    produces = { MediaType.APPLICATION_JSON_VALUE })
	public Estado compra(@RequestBody Compra compra) {

		return vService.validateCompra(compra);
		
		
	}
}
