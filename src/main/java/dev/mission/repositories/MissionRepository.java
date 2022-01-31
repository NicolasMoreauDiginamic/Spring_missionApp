package dev.mission.repositories;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mission.entites.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

	List<Mission> findByDateDebutAfter(LocalDate date);

	List<Mission> findByDateDebutAfterAndTauxJourna(LocalDate date, BigDecimal tauxJourna);
	

}
