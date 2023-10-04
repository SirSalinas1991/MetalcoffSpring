package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Vendedor;
import com.edu.sena.repository.VendedorRepository;

@Service
public class VendedorServiceImpl implements VendedorService{
	
	@Autowired
	VendedorRepository vendedorRepository;
	
	@Override
	public Optional<Vendedor> findById(Integer cod_vendedor) {
	
		return vendedorRepository.findById(cod_vendedor);
	}

	@Override
	public List<Vendedor> findAll() {
	
		return vendedorRepository.findAll();
	}

	@Override
	public Vendedor save(Vendedor e) {
	
		return vendedorRepository.save(e);
	}

	@Override
	public void deleteById(Integer cod_vendedor) {
		
		vendedorRepository.deleteById(cod_vendedor);
	}
}
