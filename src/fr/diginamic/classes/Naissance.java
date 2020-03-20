package fr.diginamic.classes;

import java.time.LocalDate;

/**
 * @author 20-100
 *
 */
public class Naissance {
	/*
	 * 1 ) Créer une classe Naissance ANNEE Long DateEvenement Date Nombre Long
	 */
	/** annee de naissance */
	private long annee;
	/** date Evenement */
	private LocalDate dateEvenement;
	/** nombre de naissances */
	private long nombre;

	/**
	 * Constructeur
	 * 
	 * @param annee
	 * @param dateEvenement
	 * @param nombre
	 */
	public Naissance(long annee, LocalDate dateEvenement, long nombre) {
		super();
		this.annee = annee;
		this.dateEvenement = dateEvenement;
		this.nombre = nombre;
	}

	/**
	 * recupérer annee
	 * 
	 * @return the annee
	 */
	public long getAnnee() {
		return annee;
	}

	/**
	 * definir année
	 * 
	 * @param annee the annee to set
	 */
	public void setAnnee(long annee) {
		this.annee = annee;
	}

	/**
	 * récupérer date evenement
	 * 
	 * @return the dateEvenement
	 */
	public LocalDate getDateEvenement() {
		return dateEvenement;
	}

	/**
	 * Définir date evenement
	 * 
	 * @param dateEvenement the dateEvenement to set
	 */
	public void setDateEvenement(LocalDate dateEvenement) {
		this.dateEvenement = dateEvenement;
	}

	/**
	 * Recuperer nombre de naissances
	 * 
	 * @return the nombre
	 */
	public long getNombre() {
		return nombre;
	}

	/**
	 * Définit nombre de naissances
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "C'est une naissance ! Année : " + annee + ", Date evenement : " + dateEvenement + ", Nombre : "
				+ nombre;
	}

}
