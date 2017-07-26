package com.gaConnecte.assistAuto.service;

import java.util.List;

import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.entities.Pack;

public interface ClientService {
	
	public Client convertToEntity (ClientDTO clientDTO);
	public Client convertToEntityForEdit(ClientDTO clientDTO);
	public ClientDTO convertToDTO (Client client);
	//public List<ClientDTO> convertToDTO(List<Client> listClient);
	public List<Client> convertToEntity(List<ClientDTO> listClientDTO);
	public ClientDTO addClient(ClientDTO cDTO);
	public List<Client>listClient();
	public List<ClientDTO> convertToDTO(List<Client> r) ;
	public ClientDTO editClient(ClientDTO cDTO,Long id);
	public void deleteClient(Long id);
	public void enableEtatClient(Long id);
	public void disableEtatClient(Long id);
	
}
