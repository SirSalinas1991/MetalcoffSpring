package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendedor")
public class Vendedor {

	@Id
	@Column(name = "cod_vendedor")
	private int cod_vendedor;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "dep_ventas")
	private String dep_ventas;
	
	
	public Vendedor(int cod_vendedor, String nombre, String apellido, String dep_ventas) {
		this.cod_vendedor = cod_vendedor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dep_ventas = dep_ventas;
	}
	
	

	public Vendedor() {

	}



	public int getCod_vendedor() {
		return cod_vendedor;
	}

	public void setCod_vendedor(int cod_vendedor) {
		this.cod_vendedor = cod_vendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDep_ventas() {
		return dep_ventas;
	}

	public void setDep_ventas(String dep_ventas) {
		this.dep_ventas = dep_ventas;
	}
	
	
	
	
	
}
