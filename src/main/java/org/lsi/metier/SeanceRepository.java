package org.lsi.metier;

import org.lsi.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Integer> {

}
