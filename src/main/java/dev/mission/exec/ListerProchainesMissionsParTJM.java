package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entites.Mission;

@Controller
@Profile("nextMissionParTJM")
public class ListerProchainesMissionsParTJM implements CommandLineRunner {
	
	private List<Mission> listMission;
	private BigDecimal taux;
	private Integer res;

	public ListerProchainesMissionsParTJM(List<Mission> listMission, BigDecimal taux) {
		super();
		this.listMission = listMission;
		this.taux = taux;
	}

	@Override
	public void run(String... args) throws Exception{
		
		Mission mission = new Mission();
		mission.setLibelle("Mission 8");
		mission.setTauxJourna(new BigDecimal("300.20"));
		mission.setDateDebut(LocalDate.of(2022, 4, 3));
		mission.setDateFin(LocalDate.of(2022, 6, 5));
		
		Mission mission2 = new Mission();
		mission2.setLibelle("Mission 9");
		mission2.setTauxJourna(new BigDecimal("10.40"));
		mission2.setDateDebut(LocalDate.of(2022, 1, 26));
		mission2.setDateFin(LocalDate.of(2022, 2, 2));
		
		Mission mission3 = new Mission();
		mission3.setLibelle("Mission 10");
		mission3.setTauxJourna(new BigDecimal("800.60"));
		mission3.setDateDebut(LocalDate.of(2022, 3, 5));
		mission3.setDateFin(LocalDate.of(2022, 3, 6));
		
		this.listMission.add(mission);
		this.listMission.add(mission2);
		this.listMission.add(mission3);
		this.taux = new BigDecimal("300.20");
		
		for (Mission liste : listMission) {
			this.res = liste.getTauxJourna().compareTo(taux);
			if( res == 0 | res == 1  && liste.getDateDebut().isEqual(LocalDate.now()) | liste.getDateDebut().isAfter(LocalDate.now())) {
				System.out.print(liste.getLibelle() + " Date deb : " + liste.getDateDebut() + " Taux journa : " + liste.getTauxJourna());
			}
			
		}

		
	}
	
	
}
