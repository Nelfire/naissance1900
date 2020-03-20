package fr.diginamic.executable;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import fr.diginamic.classes.Naissance;

public class NaissanceTest {

	public static void main(String[] args) {

		try {
			ArrayList<Naissance> listeDesNaissances = new ArrayList<>();
			File document = new File("C:/Users/20-100/Desktop/COURS DTA/naissances_depuis_1900.csv");
			List<String> lignes = FileUtils.readLines(document, "UTF-8");
			for (int i = 1; i < lignes.size(); i++) {
				String ligne = lignes.get(i);

				// On commence par découpe.
				String[] morceaux = ligne.split(";");
				String type = morceaux[0];
				long annee = Long.parseLong(morceaux[1]);
				String PATTERN_DATE = "yyyyMMdd";
				LocalDate date = LocalDate.parse(morceaux[2], DateTimeFormatter.ofPattern(PATTERN_DATE));
				System.out.println(date);
//				Date dateEvenement = Date.parse(morceaux[2]);
//				long nombre = Long.parseLong(morceaux[3]);
//
//				listeDesNaissances.add(new Naissance(annee,dateEvenement,nombre));
//				System.out.println(type);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
