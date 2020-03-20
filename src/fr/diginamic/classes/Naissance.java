package fr.diginamic.classes;

import java.util.Date;

public class Naissance {
	private long annee;
	private Date dateEvenement;
	private long nombre;

	/**
	 * Constructeur
	 * 
	 * @param annee
	 * @param dateEvenement
	 * @param nombre
	 */
	public Naissance(long annee, Date dateEvenement, long nombre) {
		super();
		this.annee = annee;
		this.dateEvenement = dateEvenement;
		this.nombre = nombre;
	}

	/**
	 * Getter
	 * 
	 * @return the annee
	 */
	public long getAnnee() {
		return annee;
	}

	/**
	 * Setter
	 * 
	 * @param annee the annee to set
	 */
	public void setAnnee(long annee) {
		this.annee = annee;
	}

	/**
	 * Getter
	 * 
	 * @return the dateEvenement
	 */
	public Date getDateEvenement() {
		return dateEvenement;
	}

	/**
	 * Setter
	 * 
	 * @param dateEvenement the dateEvenement to set
	 */
	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}

	/**
	 * Getter
	 * 
	 * @return the nombre
	 */
	public long getNombre() {
		return nombre;
	}

	/**
	 * Setter
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "C'est une naissance ! Année : " + annee + ", Date evenement : " + dateEvenement + ", Nombre : "
				+ nombre;
	}

}
