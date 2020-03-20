package fr.diginamic.executable;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import fr.diginamic.classes.Naissance;

@FunctionalInterface
interface IMyExecute {
	void apply();
}

public class NaissanceTest {

	public static void main(String[] args) {
		ArrayList<Naissance> listeDesNaissances = null;
		try {
			LocalDate date = null;
			listeDesNaissances = new ArrayList<>();

			// 2 ) Charger le contenu du fichier Dans une Liste de type Naissance
			File document = new File("C:/Users/20-100/Desktop/COURS DTA/naissances_depuis_19000.csv");
			List<String> lignes = FileUtils.readLines(document, "UTF-8");
			for (int i = 1; i < lignes.size(); i++) {
				String ligne = lignes.get(i);

				// On commence par découpe.
				String[] morceaux = ligne.split(";");
				String type = morceaux[0];
				long annee = Long.parseLong(morceaux[1]);
				String PATTERN_DATE = "yyyyMMdd";
				date = LocalDate.parse(morceaux[2], DateTimeFormatter.ofPattern(PATTERN_DATE));
				long nombre = Long.parseLong(morceaux[3]);

				listeDesNaissances.add(new Naissance(annee, date, nombre));

			}

			// Afficher le contenue complet
			// listeDesNaissances.stream().forEach(p -> System.out.println(p.toString()));

			// 3 ) Afficher toute les données selon l'année 1900
			listeDesNaissances.stream().filter(e -> e.getAnnee() == 1950).forEach(System.out::println);

			// 4 ) Afficher la somme correspondant à l'année 1900

			long somme = listeDesNaissances.stream().filter(n -> n.getAnnee() == 1900).map(n -> n.getNombre())
					.reduce((n1, n2) -> n1 + n2).get();
			// Afficher la somme
			System.out.println(somme);

			// 5 ) Afficher la moyenne correspondant à l'année 1971
			double moyenne = listeDesNaissances.stream().filter(n -> n.getAnnee() == 1971).mapToLong(n -> n.getNombre())
					.average().getAsDouble();
			// Afficher la moyenne
			System.out.println(moyenne);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
