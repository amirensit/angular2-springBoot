package com.gaConnecte.assistAuto.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Remorqueur implements Serializable {
	
	@Id @GeneratedValue
	private Long id_remorqueur;
	
	private String raison_social;
	private String matricule_fiscal;
	private String tel;
	private String nom_contact;
	private String prenom_contact;
	private Boolean etat;
	@ManyToOne
	@JoinColumn(name="CODE_VILLE")
	private Ville ville;
	
	
	public Remorqueur() {
		super();
	}

	public Remorqueur(String raison_social, String matricule_fiscal, String tel, String nom_contact,
			String prenom_contact, Boolean etat) {
		super();
		this.raison_social = raison_social;
		this.matricule_fiscal = matricule_fiscal;
		this.tel = tel;
		this.nom_contact = nom_contact;
		this.prenom_contact = prenom_contact;
		this.etat = etat;
	}


























	public Remorqueur(Long id_remorqueur, String raison_social, String matricule_fiscal, String tel, String nom_contact,
			String prenom_contact, Boolean etat) {
		super();
		this.id_remorqueur = id_remorqueur;
		this.raison_social = raison_social;
		this.matricule_fiscal = matricule_fiscal;
		this.tel = tel;
		this.nom_contact = nom_contact;
		this.prenom_contact = prenom_contact;
		this.etat = etat;
	}


























	public Remorqueur(Long id_remorqueur, String raison_social, String matricule_fiscal, String tel, String nom_contact,
			String prenom_contact, Boolean etat, Ville ville) {
		super();
		this.id_remorqueur = id_remorqueur;
		this.raison_social = raison_social;
		this.matricule_fiscal = matricule_fiscal;
		this.tel = tel;
		this.nom_contact = nom_contact;
		this.prenom_contact = prenom_contact;
		this.etat = etat;
		this.ville = ville;
	}





















	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}




	public Long getId_remorqueur() {
		return id_remorqueur;
	}



	public void setId_remorqueur(Long id_remorqueur) {
		this.id_remorqueur = id_remorqueur;
	}



	public String getRaison_social() {
		return raison_social;
	}



	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}



	public String getMatricule_fiscal() {
		return matricule_fiscal;
	}



	public void setMatricule_fiscal(String matricule_fiscal) {
		this.matricule_fiscal = matricule_fiscal;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getNom_contact() {
		return nom_contact;
	}



	public void setNom_contact(String nom_contact) {
		this.nom_contact = nom_contact;
	}



	public String getPrenom_contact() {
		return prenom_contact;
	}



	public void setPrenom_contact(String prenom_contact) {
		this.prenom_contact = prenom_contact;
	}



	public Ville getVille() {
		return ville;
	}



	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
}
