package com.gaConnecte.assistAuto.service;

import java.util.List;

import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.entities.Pack;

public interface PackService {
	
	public PackDTO convertToDTO(Pack entity) ;
	
	public Pack convertToEntity(PackDTO pd);
	
	 public List<PackDTO> convertToDTO(List<Pack> listPack);
	 
	 public List<Pack> convertToEntity(List<PackDTO> listPackDTO);
	 
	 public PackDTO addPack(PackDTO pDTO);
	 
	 public List<PackDTO> convertListToDTO(List<Pack> m);
	 
	 public PackDTO editPack(PackDTO pDTO, Long id);
	 
	 public void deletePack(Long id);
	 
	 public void enableEtatPack(Long id);
	 
	 public void disableEtatPack(Long id);
	 
	 public List<Pack> listPack();
	
	

}
