package com.gaConnecte.assistAuto.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.gaConnecte.assistAuto.daos.GouvernoratRepository;

import com.gaConnecte.assistAuto.dto.GouvernoratDTO;
import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.entities.Gouvernorat;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.service.GouvernoratService;
@Transactional
@Service
public class GouvernoratServiceImpl implements GouvernoratService {
	
	
	@Autowired
	private GouvernoratRepository gouvernoratRepository;
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public Gouvernorat convertToEntity(GouvernoratDTO gDTO) {
		Gouvernorat gouvernorat =modelMapper.map(gDTO, Gouvernorat.class);
		
		return gouvernorat;
	}

	@Override
	public GouvernoratDTO convertToDTO(Gouvernorat gouvernorat) {
		return modelMapper.map(gouvernorat, GouvernoratDTO.class);
	}

	@Override
	public GouvernoratDTO addGouvernorat(GouvernoratDTO gDTO) {
		Gouvernorat v=convertToEntity(gDTO);
		gouvernoratRepository.save(v);
		return gDTO;
	}

	@Override
	public void deleteGouvernorat(Long id_gouvernorat) {
		gouvernoratRepository.delete(id_gouvernorat);
		
	}

	@Override
	public List<GouvernoratDTO> convertToDTO(List<Gouvernorat> listGouvernorat) {
		List<GouvernoratDTO> listGouvernoratDTO=new ArrayList<GouvernoratDTO>();
		for (Gouvernorat entity : listGouvernorat) {
			GouvernoratDTO p = convertToDTO(entity);
			listGouvernoratDTO.add(p);
		}
		return listGouvernoratDTO;
	}

	@Override
	public List<Gouvernorat> listGouvernorat() {
		 return gouvernoratRepository.findAll();
	}

}
