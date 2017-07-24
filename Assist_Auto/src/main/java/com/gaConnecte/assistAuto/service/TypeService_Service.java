package com.gaConnecte.assistAuto.service;



import java.util.List;

import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.dto.TypeServiceDTO;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.entities.TypeService;

public interface TypeService_Service {
	
	public TypeService addTypeService(TypeService ts);
	public void deleteTypeService(Long id);
	public TypeService editTypeService(TypeService pDTO, Long id);
	public TypeService convertToEntity (TypeServiceDTO typrServiceDTO);
	public TypeServiceDTO convertToDTO (TypeService typrService);
	public List<TypeServiceDTO> convertToDTO(List<TypeService> listTypeService);
	public List<TypeService> listTypeService();

}
