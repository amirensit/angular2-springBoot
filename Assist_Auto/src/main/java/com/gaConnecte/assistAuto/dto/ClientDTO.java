package com.gaConnecte.assistAuto.dto;

import java.util.List;

public class ClientDTO {
	
	private Long id_client;
	private Long num_client;
	private String nom_client;
	private Boolean etat;
	
	private List<PackDTO> packs;
	
	
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	public Long getNum_client() {
		return num_client;
	}
	public void setNum_client(Long num_client) {
		this.num_client = num_client;
	}
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public List<PackDTO> getPacks() {
		return packs;
	}
	public void setPacks(List<PackDTO> packs) {
		this.packs = packs;
	}
	
	
	
	

}
