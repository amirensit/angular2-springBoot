package com.gaConnecte.assistAuto.service;

import java.util.List;

import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.dto.VilleDTO;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.entities.Ville;

public interface VilleService {

	//public VilleDTO convertToDto(Ville v);
	public Ville convertToEntity(VilleDTO vDTO);
	public VilleDTO convertToDTO(Ville ville);
	public VilleDTO addVille(VilleDTO vDTO);
	public void deleteVille(Long id_ville);
	public List<VilleDTO> convertToDTO(List<Ville> listVille);
	
}
