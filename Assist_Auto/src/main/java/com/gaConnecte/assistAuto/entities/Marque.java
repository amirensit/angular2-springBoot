package com.gaConnecte.assistAuto.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Marque implements Serializable {
	@Id @GeneratedValue
	private Long id_marque;
	
	private String nom_marque;
	
	@OneToMany(mappedBy="marque",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Contrat> contrats ;


	public Marque() {
		super();
	}


	public Marque(Long id_marque, String nom_marque) {
		super();
		this.id_marque = id_marque;
		this.nom_marque = nom_marque;
	}


	public Marque(String nom_marque) {
		super();
		this.nom_marque = nom_marque;
	}


	public Long getId_marque() {
		return id_marque;
	}


	public void setId_marque(Long id_marque) {
		this.id_marque = id_marque;
	}


	public String getNom_marque() {
		return nom_marque;
	}


	public void setNom_marque(String nom_marque) {
		this.nom_marque = nom_marque;
	}
	
	public List<Contrat> getContrats() {
		return contrats;
	}


	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
	
	

}
