package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entites.Mission;
import dev.mission.repositories.MissionRepository;

@Controller
@Profile("insert")
public class InsererMission implements CommandLineRunner {
		
	private MissionRepository missionRepo;

	public InsererMission(MissionRepository missionRepo) {
		super();
		this.missionRepo = missionRepo;
	}
	
	@Override
	public void run(String... args) throws Exception{
		Mission mission = new Mission();
		mission.setLibelle("Mission 4");
		mission.setTauxJourna(new BigDecimal("150.75"));
		mission.setDateDebut(LocalDate.of(2020, 11, 18));
		mission.setDateFin(LocalDate.of(2020, 12, 4));
		
		this.missionRepo.save(mission);
	}
}
