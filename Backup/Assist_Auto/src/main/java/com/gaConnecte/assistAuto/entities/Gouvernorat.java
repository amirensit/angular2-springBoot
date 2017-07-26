package com.gaConnecte.assistAuto.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gouvernorat {
	
	@Id
	@GeneratedValue
	private Long id_gouvernorat;
	
	private String nom_gouvernorat;
	
	@OneToMany(mappedBy="gouvernorat",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Ville> Villes;
	
	
	
	
	
	
	
	public List<Ville> getVilles() {
		return Villes;
	}

	public void setVilles(List<Ville> villes) {
		Villes = villes;
	}

	public Gouvernorat() {
		super();
	}

	public Gouvernorat(String nom_gouvernorat) {
		super();
		this.nom_gouvernorat = nom_gouvernorat;
	}

	public Long getId_gouvernorat() {
		return id_gouvernorat;
	}

	public void setId_gouvernorat(Long id_gouvernorat) {
		this.id_gouvernorat = id_gouvernorat;
	}

	public String getNom_gouvernorat() {
		return nom_gouvernorat;
	}

	public void setNom_gouvernorat(String nom_gouvernorat) {
		this.nom_gouvernorat = nom_gouvernorat;
	}
	
	

}
