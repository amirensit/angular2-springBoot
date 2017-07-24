package com.gaConnecte.assistAuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.dto.VilleDTO;

import com.gaConnecte.assistAuto.service.VilleService;

@RestController
@RequestMapping(value = "/villes")
public class VilleController {
	
	@Autowired
	private VilleService villeService;
	
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public VilleDTO addVille(@RequestBody VilleDTO vDTO) {
		
		return villeService.addVille(vDTO);
		
	}

}
