package com.edu.sena.controller;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Cliente;
import com.edu.sena.models.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/{id}")
	public Optional<Cliente> buscarPorId(@PathVariable Integer id) {
		return clienteService.findById(id);
		
		
	}
	@GetMapping("/listar")
	public List<Cliente> listarTodos(){
		return clienteService.findAll();
		
		
	}
	
	@PostMapping
	public Cliente guardar(@RequestBody Cliente e) {
		
		return clienteService.save(e);
	}
		
		
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		clienteService.deleteById(id);
		
	}
	
	@PutMapping("/actualizar")
	public Cliente actualizar(@RequestBody Cliente e, @PathVariable Integer id) {
		
		Cliente eEnBD=clienteService.findById(id).get();
				
			
				eEnBD.setNombre(e.getNombre());
				eEnBD.setApellido(e.getApellido());
				eEnBD.setDireccion(e.getDireccion());
				eEnBD.setCiudad(e.getCiudad());
				eEnBD.setEmail(e.getEmail());
				eEnBD.setTelefono(e.getTelefono());
				return clienteService.save(eEnBD);
				
				
	}
	
}
