package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	

	@Id
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefono")
	private int telefono;
	

	
	
	public Cliente(int codigo, String nombre, String apellido, String direccion, String ciudad, String email,
			int telefono) {
	
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.email = email;
		this.telefono = telefono;
		
	}
	
	


	public Cliente() {
		
	}




	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
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


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	
	
	
	
}
