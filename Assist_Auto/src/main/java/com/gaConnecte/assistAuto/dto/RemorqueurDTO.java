package com.gaConnecte.assistAuto.dto;

public class RemorqueurDTO {

	private Long id_remorqueur;	
	private String raison_social;
	private String matricule_fiscal;
	private String tel;
	private String nom_contact;
	private String prenom_contact;
	private VilleDTO villeDTO;
	private Boolean etat;
	
	
	
	
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
	public VilleDTO getVilleDTO() {
		return villeDTO;
	}
	public void setVilleDTO(VilleDTO villeDTO) {
		this.villeDTO = villeDTO;
	}
	
	
}
