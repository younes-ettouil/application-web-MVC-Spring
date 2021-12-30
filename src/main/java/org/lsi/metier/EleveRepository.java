package org.lsi.metier;

import org.lsi.entities.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleveRepository extends JpaRepository<Eleve, Integer> {
	
}
