package com.gaConnecte.assistAuto.daos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gaConnecte.assistAuto.entities.Gouvernorat;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Long> {
	@Query("select p from Ville p where p.gouvernorat.id_gouvernorat= :x")
	public List<Ville> getIdVilleByGouvernorat(@Param("x") Long x);
	
	
	
}
