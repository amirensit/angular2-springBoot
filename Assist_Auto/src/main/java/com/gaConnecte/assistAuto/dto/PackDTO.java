package com.gaConnecte.assistAuto.dto;

public class PackDTO {
	
	
	private Long id_pack;
	private String nom_pack;
	private String description;
	private int nbre_max_service;
	private int kilometrage_max;
	private Boolean etat;
	
	
	
	
	
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Long getId_pack() {
		return id_pack;
	}
	public void setId_pack(Long id_pack) {
		this.id_pack = id_pack;
	}
	public String getNom_pack() {
		return nom_pack;
	}
	public void setNom_pack(String nom_pack) {
		this.nom_pack = nom_pack;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNbre_max_service() {
		return nbre_max_service;
	}
	public void setNbre_max_service(int nbre_max_service) {
		this.nbre_max_service = nbre_max_service;
	}
	public int getKilometrage_max() {
		return kilometrage_max;
	}
	public void setKilometrage_max(int kilometrage_max) {
		this.kilometrage_max = kilometrage_max;
	}
	
	

}
