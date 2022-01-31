package dev.mission.exec;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.repositories.MissionRepository;

@Controller
@Profile("nextMission")
public class ListerProchainesMissions implements CommandLineRunner {
	
	private MissionRepository mRepo;
	
	public void ListeProchaineMission(MissionRepository mRepo) {
		this.mRepo = mRepo;
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		this.mRepo
		.findByDateDebutAfter(LocalDate.now().minusDays(1))
		.forEach(System.out::println);
	}
	
	
}
