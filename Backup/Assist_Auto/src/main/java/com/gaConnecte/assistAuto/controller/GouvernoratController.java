package com.gaConnecte.assistAuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.dto.GouvernoratDTO;
import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.entities.Gouvernorat;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.service.GouvernoratService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/gouvernorats")
public class GouvernoratController {
	
	@Autowired
	private GouvernoratService gouvernoratService;
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public GouvernoratDTO addGouvernorat(@RequestBody GouvernoratDTO vDTO) {
		
		return gouvernoratService.addGouvernorat(vDTO);
		
	}
	
	@RequestMapping(value = "delete/{id_gouvernorat}", method = RequestMethod.DELETE)

	public void deleteGouvernorat(@PathVariable Long id_gouvernorat) {

		gouvernoratService.deleteGouvernorat(id_gouvernorat);

		}
	
	@RequestMapping(value = "getListGouvernorat", method = RequestMethod.GET)
	public List<GouvernoratDTO> getListGouvernorat()
	{
		List<Gouvernorat> listMarque=gouvernoratService.listGouvernorat();
		List<GouvernoratDTO> marqueDTOList =gouvernoratService.convertToDTO(listMarque);
		return marqueDTOList;
	}

}
