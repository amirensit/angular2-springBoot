package com.gaConnecte.assistAuto.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gaConnecte.assistAuto.entities.Remorqueur;

public interface RemorqueurRepository extends JpaRepository<Remorqueur, Long> {
	
	
	@Modifying
	@Query("update Remorqueur r set r.etat =True where r.id_remorqueur =:id")
	public void enableEtatRemorqueur(@Param("id") Long id);
	
	@Modifying
	@Query("update Remorqueur r set r.etat =False where r.id_remorqueur =:id")
	public void disableEtatRemorqueur(@Param("id") Long id);

}
