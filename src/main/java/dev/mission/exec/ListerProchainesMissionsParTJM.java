package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.repositories.MissionRepository;

@Controller
@Profile("nextMissionParTJM")
public class ListerProchainesMissionsParTJM implements CommandLineRunner {
	
	private MissionRepository mRepo;
	
	public void ListeProchaineMissionTJM(MissionRepository mRepo) {
		this.mRepo = mRepo;
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		this.mRepo
		.findByDateDebutAfterAndTauxJourna(LocalDate.now(),new BigDecimal(10.10))
		.forEach(System.out::println);



	}
	
	
}
