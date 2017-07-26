package com.gaConnecte.assistAuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.daos.ContratRepository;
import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.ContratDTO;
import com.gaConnecte.assistAuto.dto.RemorqueurDTO;
import com.gaConnecte.assistAuto.entities.Contrat;
import com.gaConnecte.assistAuto.entities.Remorqueur;
import com.gaConnecte.assistAuto.service.ContratService;

@RestController
@RequestMapping(value = "/contrats")
public class ContratController {
	
	@Autowired
	private ContratService contratService;
	
	@Autowired
	private ContratRepository contratRepository;
	
	/*@RequestMapping(method = RequestMethod.POST, value = "/add/{id_pack}/{id_marque}")
	
	public ContratDTO addbatch(@PathVariable Long  id_pack,@PathVariable Long  id_marque, @RequestBody Contrat c) {

		ContratDTO bat = contratService.addContrat(c, id_pack, id_marque);
		return bat;

	}*/

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ContratDTO addContrat( @RequestBody ContratDTO c) {
		
		ContratDTO bat = contratService.addContrat(c);
		return bat;

	}


	@RequestMapping(value="edit/{id}",method=RequestMethod.PUT) 
	public ContratDTO update(@RequestBody   ContratDTO cDTO,@PathVariable Long id)
		{
			return contratService.editContrat(cDTO, id);
		}
	

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<ContratDTO> listContratDTO() {
		List<Contrat> listContrat=contratRepository.findAll();
		List<ContratDTO> listContratDTO =contratService.listContratDTO();
		
		return listContratDTO;
		
	}

}
