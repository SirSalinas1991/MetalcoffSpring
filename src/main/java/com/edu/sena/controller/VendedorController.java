package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.edu.sena.models.entity.Vendedor;
import com.edu.sena.models.service.VendedorService;

@RestController
@RequestMapping("/api/vendedor")
public class VendedorController {
	@Autowired
	VendedorService vendedorService;
	
	@GetMapping("/{cod_vendedor}")
	public Optional<Vendedor> buscarPorId(@PathVariable Integer cod_vendedor) {
		return vendedorService.findById(cod_vendedor);
		
		
	}
	@GetMapping("/listar")
	public List<Vendedor> listarTodos(){
		return vendedorService.findAll();
		
		
	}
	
	@PostMapping
	public Vendedor guardar(@RequestBody Vendedor e) {
		
		return vendedorService.save(e);
	}
		
		
	
	
	@DeleteMapping("/{cod_vendedor}")
	public void eliminar(@PathVariable Integer cod_vendedor) {
		vendedorService.deleteById(cod_vendedor);
		
	}
	
	@PutMapping("/actualizar")
	public Vendedor actualizar(@RequestBody Vendedor e, @PathVariable Integer cod_vendedor) {
		
		Vendedor EnBD=vendedorService.findById(cod_vendedor).get();
				
			
				EnBD.setCod_vendedor(e.getCod_vendedor());
				EnBD.setNombre(e.getNombre());
				EnBD.setApellido(e.getApellido());
				EnBD.setDep_ventas(e.getDep_ventas());
				return vendedorService.save(EnBD);
				
				
	}
}
