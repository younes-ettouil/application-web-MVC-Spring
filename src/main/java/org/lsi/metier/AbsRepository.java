package org.lsi.metier;

import java.util.List;

import org.lsi.entities.Absence;
import org.lsi.entities.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsRepository extends JpaRepository<Absence, Integer> {
	@Query("select e from Absence e where e.seance.id_seance=:x")
	public List<Absence> getByseance(@Param("x") int id);
	
	
	@Query("select e from Absence e where e.abs='abs'")
	public List<Absence> getAbs();
		
}
