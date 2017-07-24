package com.gaConnecte.assistAuto.entities;

import java.util.List;

import javax.annotation.Nullable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Ville {

	
	@Id
	@GeneratedValue
	private Long id_ville;
	
	private String nom_ville;
	
	@OneToMany(mappedBy="ville",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Contrat> contrats;
	
	
	@OneToMany(mappedBy="ville",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Remorqueur> remorqueurs;
	
	
	
	

	public Ville(String nom_ville) {
		super();
		this.nom_ville = nom_ville;
	}

	public Ville() {
		super();
	}

	public Long getId_ville() {
		return id_ville;
	}

	public void setId_ville(Long id_ville) {
		this.id_ville = id_ville;
	}

	public String getNom_ville() {
		return nom_ville;
	}

	public void setNom_ville(String nom_ville) {
		this.nom_ville = nom_ville;
	}

	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}

	public List<Remorqueur> getRemorqueurs() {
		return remorqueurs;
	}

	public void setRemorqueurs(List<Remorqueur> remorqueurs) {
		this.remorqueurs = remorqueurs;
	}

	public Ville(Long id_ville, String nom_ville, List<Contrat> contrats) {
		super();
		this.id_ville = id_ville;
		this.nom_ville = nom_ville;
		this.contrats = contrats;
	}

	public Ville(Long id_ville, String nom_ville, List<Contrat> contrats, List<Remorqueur> remorqueurs) {
		super();
		this.id_ville = id_ville;
		this.nom_ville = nom_ville;
		this.contrats = contrats;
		this.remorqueurs = remorqueurs;
	}

	public Ville(Long id_ville, String nom_ville) {
		super();
		this.id_ville = id_ville;
		this.nom_ville = nom_ville;
	}
	
	


	
	

	
	
	

	
}
