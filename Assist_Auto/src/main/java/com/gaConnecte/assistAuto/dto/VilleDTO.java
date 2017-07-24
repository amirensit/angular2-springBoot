package com.gaConnecte.assistAuto.dto;

public class VilleDTO {

	private Long id_ville;
	
	
	private String nom_ville;
	
	
	
	
	
	
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
	public VilleDTO(Long id_ville, String nom_ville) {
		super();
		this.id_ville = id_ville;
		this.nom_ville = nom_ville;
	}
	public VilleDTO(String nom_ville) {
		super();
		this.nom_ville = nom_ville;
	}
	
	public VilleDTO() {
		super();
	}
	
}
