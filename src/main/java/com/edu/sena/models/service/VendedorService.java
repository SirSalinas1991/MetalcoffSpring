package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Vendedor;

public interface VendedorService {

	public Optional<Vendedor>findById(Integer cod_vendedor);
	public List<Vendedor> findAll();
	public Vendedor save(Vendedor e);
	public void deleteById(Integer cod_vendedor);
}
