package com.gaConnecte.assistAuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.daos.VilleRepository;
import com.gaConnecte.assistAuto.dto.VilleDTO;
import com.gaConnecte.assistAuto.entities.Ville;
import com.gaConnecte.assistAuto.service.VilleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/villes")
public class VilleController {
	
	@Autowired
	private VilleService villeService;
	@Autowired
	private VilleRepository villeRepository;
	
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public VilleDTO addVille(@RequestBody VilleDTO vDTO) {
		
		return villeService.addVille(vDTO);
		
	}
	
	@RequestMapping(value = "delete/{id_ville}", method = RequestMethod.DELETE)

	public void deleteVille(@PathVariable Long id_ville) {

		villeService.deleteVille(id_ville);

		}
	
	@RequestMapping(value = "getIdVilleByGouvernorat/{id_gouvernorat}", method = RequestMethod.GET)
	public List<VilleDTO> getIdVilleByGouvernorat(@PathVariable Long id_gouvernorat) {
		
		List<Ville> listVille = villeRepository.getIdVilleByGouvernorat(id_gouvernorat);
		List<VilleDTO> listVilleDTO = villeService.convertToDTO(listVille);

		return  listVilleDTO;

		}

}
