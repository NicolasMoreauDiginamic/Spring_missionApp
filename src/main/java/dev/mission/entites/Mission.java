package dev.mission.entites;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mission")
public class Mission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date_debut")
	private LocalDate dateDebut;
	@Column(name = "date_fin")
	private LocalDate dateFin;
	private String libelle;
	@Column(name= "taux_journalier")
	private BigDecimal tauxJourna;
	
	public Mission() {
		
	}

	public Mission(LocalDate dateDebut, LocalDate dateFin, String libelle, BigDecimal tauxJourna) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.libelle = libelle;
		this.tauxJourna = tauxJourna;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getTauxJourna() {
		return tauxJourna;
	}

	public void setTauxJourna(BigDecimal tauxJourna) {
		this.tauxJourna = tauxJourna;
	}

	@Override
	public String toString() {
		return "Mission [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", libelle=" + libelle
				+ ", tauxJourna=" + tauxJourna + "]";
	}
	
}
