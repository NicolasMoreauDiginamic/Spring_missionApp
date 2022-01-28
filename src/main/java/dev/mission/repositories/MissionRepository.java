package dev.mission.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mission.entites.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
	

}
