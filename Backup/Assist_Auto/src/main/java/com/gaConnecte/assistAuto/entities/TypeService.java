package com.gaConnecte.assistAuto.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeService  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id_typeService;
	private String nom_typeService;
	public TypeService() {
		super();
	}
	public TypeService(String nom_typeService) {
		super();
		this.nom_typeService = nom_typeService;
	}
	public Long getId_typeService() {
		return id_typeService;
	}
	public void setId_typeService(Long id_typeService) {
		this.id_typeService = id_typeService;
	}
	public String getNom_typeService() {
		return nom_typeService;
	}
	public void setNom_typeService(String nom_typeService) {
		this.nom_typeService = nom_typeService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	


}
