package com.gaConnecte.assistAuto.service;

import java.util.List;

import com.gaConnecte.assistAuto.dto.ContratDTO;
import com.gaConnecte.assistAuto.dto.RemorqueurDTO;
import com.gaConnecte.assistAuto.entities.Remorqueur;

public interface RemorqueurService {
	
	
	public Remorqueur convertToEntity(RemorqueurDTO rDTO);
	
	public RemorqueurDTO convertToDTO(Remorqueur remorqueur);
	
	public List<RemorqueurDTO> convertlistDTO( List<Remorqueur> listRemorqueur);
	
	public RemorqueurDTO addRemorqueur (RemorqueurDTO rDTO);
	
	public void enableEtatRemorqueur(Long id);
	
	public void disableEtatRemorqueur(Long id);
	
	public void deleteRemorqueur(Long id);
	
	public RemorqueurDTO editRemorqueur (RemorqueurDTO cDTO,Long id);
	
	public List<RemorqueurDTO> listRemorqueurDTO();

}
