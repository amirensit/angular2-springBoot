package com.gaConnecte.assistAuto.service;

import com.gaConnecte.assistAuto.dto.VilleDTO;
import com.gaConnecte.assistAuto.entities.Ville;

public interface VilleService {

	//public VilleDTO convertToDto(Ville v);
	public Ville convertToEntity(VilleDTO vDTO);
	public VilleDTO convertToDTO(Ville ville);
	public VilleDTO addVille(VilleDTO vDTO);
}
