package com.gaConnecte.assistAuto.service;

import java.util.List;

import com.gaConnecte.assistAuto.dto.GouvernoratDTO;
import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.entities.Gouvernorat;
import com.gaConnecte.assistAuto.entities.Marque;

public interface GouvernoratService {
	
	public Gouvernorat convertToEntity(GouvernoratDTO gDTO);
	public GouvernoratDTO convertToDTO(Gouvernorat gouvernorat);
	public GouvernoratDTO addGouvernorat(GouvernoratDTO gDTO);
	public void deleteGouvernorat(Long id_gouvernorat);
	public List<GouvernoratDTO> convertToDTO(List<Gouvernorat> listGouvernorat);
	public List<Gouvernorat> listGouvernorat() ;
}


