package com.gaConnecte.assistAuto.service.impl;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.gaConnecte.assistAuto.daos.VilleRepository;
import com.gaConnecte.assistAuto.dto.VilleDTO;
import com.gaConnecte.assistAuto.entities.Ville;
import com.gaConnecte.assistAuto.service.VilleService;
@Transactional
@Service
public class VilleServiceImpl implements VilleService {

	@Autowired
	private VilleRepository villeRepository;
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public Ville convertToEntity(VilleDTO vDTO) {
		Ville v =modelMapper.map(vDTO, Ville.class);
		//Ville v =new Ville(vDTO.getNom_ville());
		return v;
	}

	
	
	
	@Override
	public VilleDTO addVille(VilleDTO vDTO) {
		
		Ville v=convertToEntity(vDTO);
		villeRepository.save(v);
		return vDTO;
	}




	@Override
	public VilleDTO convertToDTO(Ville ville) {
		
		return modelMapper.map(ville, VilleDTO.class);
	}

}
