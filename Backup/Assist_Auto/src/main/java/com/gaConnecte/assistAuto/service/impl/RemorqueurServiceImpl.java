package com.gaConnecte.assistAuto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaConnecte.assistAuto.daos.RemorqueurRepository;
import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.dto.RemorqueurDTO;
import com.gaConnecte.assistAuto.dto.VilleDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.entities.Contrat;
import com.gaConnecte.assistAuto.entities.Pack;
import com.gaConnecte.assistAuto.entities.Remorqueur;
import com.gaConnecte.assistAuto.entities.Ville;
import com.gaConnecte.assistAuto.service.RemorqueurService;
import com.gaConnecte.assistAuto.service.VilleService;


@Transactional
@Service
public class RemorqueurServiceImpl implements RemorqueurService {
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	private ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private VilleService villeService;
	
	
	
	@Autowired
	private RemorqueurRepository remorqueurRepository;
	

	@Override
	public Remorqueur convertToEntity(RemorqueurDTO rDTO) {
		
		
		VilleDTO vDTO=null;
		vDTO=rDTO.getVilleDTO();
		Ville v=villeService.convertToEntity(vDTO);
		Remorqueur remorqueur = modelMapper.map(rDTO, Remorqueur.class);
		//Remorqueur r = new Remorqueur(rDTO.getRaison_social(),rDTO.getMatricule_fiscal(),rDTO.getTel(),rDTO.getNom_contact(),rDTO.getPrenom_contact() );
		remorqueur.setVille(v);
		return remorqueur;
		
		 }


	@Override
	public RemorqueurDTO addRemorqueur(RemorqueurDTO rDTO) {
		Remorqueur remorqueur = convertToEntity(rDTO);
		remorqueurRepository.save(remorqueur);
		return rDTO;
		
	}


	@Override
	public void enableEtatRemorqueur(Long id) {
		
		remorqueurRepository.enableEtatRemorqueur(id);
		
	}


	@Override
	public void disableEtatRemorqueur(Long id) {
		remorqueurRepository.disableEtatRemorqueur(id);
		
	}
	

	@Override
	public void deleteRemorqueur(Long id) {
		remorqueurRepository.delete(id);
		
	}


	@Override
	public RemorqueurDTO editRemorqueur(RemorqueurDTO cDTO, Long id) {
		cDTO.setId_remorqueur(id);
		Remorqueur remorqueur = new Remorqueur();
		remorqueur=convertToEntity(cDTO); 
		remorqueurRepository.saveAndFlush(remorqueur);
		return cDTO;
	}


	@Override
	public List<RemorqueurDTO> listRemorqueurDTO() {
		
		List<Remorqueur> listRemorqueur=remorqueurRepository.findAll();
		List<RemorqueurDTO> listRemorqueurDTO = convertlistDTO(listRemorqueur);
		return listRemorqueurDTO;
		
	}


	@Override
	public List<RemorqueurDTO> convertlistDTO(List<Remorqueur> listRemorqueur) {
		
		List<RemorqueurDTO> listRemorqueurDTO = new ArrayList<RemorqueurDTO>();
		RemorqueurDTO remorqueurDTO = null;
		for (Remorqueur remorqueur : listRemorqueur) {
			Ville ville=remorqueur.getVille();
			VilleDTO villeDTO= villeService.convertToDTO(ville);
			
			remorqueurDTO = convertToDTO(remorqueur);
			
			remorqueurDTO.setVilleDTO(villeDTO);
			listRemorqueurDTO.add(remorqueurDTO);
		}
		return listRemorqueurDTO;
		
		
	}


	@Override
	public RemorqueurDTO convertToDTO(Remorqueur remorqueur) {
		RemorqueurDTO rDTO= modelMapper.map(remorqueur, RemorqueurDTO.class);
		Ville ville = remorqueur.getVille();
		VilleDTO vDTO= villeService.convertToDTO(ville);
		rDTO.setVilleDTO(vDTO);
		return rDTO;
	}
	
	
	
	

}
