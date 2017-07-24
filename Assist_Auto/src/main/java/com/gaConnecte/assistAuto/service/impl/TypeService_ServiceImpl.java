package com.gaConnecte.assistAuto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaConnecte.assistAuto.daos.TypeServiceRepository;
import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.dto.TypeServiceDTO;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.entities.TypeService;
import com.gaConnecte.assistAuto.service.TypeService_Service;

@Transactional
@Service
public class TypeService_ServiceImpl implements TypeService_Service {

	@Autowired
	private TypeServiceRepository typeServiceRepository;
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public TypeService addTypeService(TypeService ts) {
		
		return typeServiceRepository.save(ts);
	}

	@Override
	public void deleteTypeService(Long id) {
		typeServiceRepository.delete(id);
	}

	@Override
	public TypeService editTypeService(TypeService pDTO, Long id) {
		
		pDTO.setId_typeService(id);  
		return typeServiceRepository.saveAndFlush(pDTO);
	}

	@Override
	public TypeService convertToEntity(TypeServiceDTO marqueDTO) {
		return modelMapper.map(marqueDTO, TypeService.class);
		
	}

	@Override
	public TypeServiceDTO convertToDTO(TypeService typeService) {
		TypeServiceDTO objDto = modelMapper.map(typeService, TypeServiceDTO.class);
		return objDto;
	}

	@Override
	public List<TypeServiceDTO> convertToDTO(List<TypeService> listTypeService) {
		List<TypeServiceDTO> listTypeServiceDTO=new ArrayList<TypeServiceDTO>();
		for (TypeService entity : listTypeService) {
			TypeServiceDTO p = convertToDTO(entity);
			listTypeServiceDTO.add(p);
		}
		return listTypeServiceDTO;
	}

	@Override
	public List<TypeService> listTypeService() {
		return typeServiceRepository.findAll();
	}

}
