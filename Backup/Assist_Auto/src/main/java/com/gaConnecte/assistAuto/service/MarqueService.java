package com.gaConnecte.assistAuto.service;


import java.util.List;

import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.entities.Pack;


public interface MarqueService {
	
	public Marque convertToEntity (MarqueDTO marqueDTO);
	public MarqueDTO convertToDTO (Marque marque);
	public MarqueDTO addMarque(MarqueDTO pDTO);
	public MarqueDTO editMarque(MarqueDTO pDTO, Long id);
	public Marque convertToEntityForEdit(MarqueDTO marqueDTO);
	public List<MarqueDTO> convertToDTO(List<Marque> listMarque);
	
	public List<Marque> listMarque();
	 public void deleteMarque(Long id);


}
