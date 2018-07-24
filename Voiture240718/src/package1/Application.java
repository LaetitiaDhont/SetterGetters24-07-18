package package1;
import java.util.*;


public class Application {

  
	public static void main(String[] args) {
		
		Voiture voitureTesla = new Voiture();
		
		voitureTesla.setBoite_de_vitesse("Manuel");
		voitureTesla.setConsommation_carburant(9);
		voitureTesla.setCouleur("gris");
		voitureTesla.setAnnee_fabrication(2017);
		voitureTesla.energie="electrique";
		voitureTesla.kilométrage=20;
		voitureTesla.marque="teslla";
		voitureTesla.modele="5s";
		voitureTesla.nbre_de_places=12;
		voitureTesla.nbres_de_roues=24;
		voitureTesla.options="toit ouvert";
		voitureTesla.plaque_dimmatriculation="0615636246";
		voitureTesla.prix_carburant=0;
		voitureTesla.prix_initial=396235124;
		voitureTesla.puissance=355;
		voitureTesla.monsieurbidule.nom="fadi";
		voitureTesla.monsieurbidule.prenom="monprenom";
		voitureTesla.monsieurbidule.adresse="monadresse";
		voitureTesla.monsieurbidule.distance_parcourue=30000;
		
		
		Voiture voitureMultiplat = new Voiture();
		voitureMultiplat.setBoite_de_vitesse("Manuel");
		voitureMultiplat.setConsommation_carburant(8);
		voitureMultiplat.setCouleur("bleu");
		voitureMultiplat.setAnnee_fabrication(2001);
		voitureMultiplat.energie="electrique";
		voitureMultiplat.kilométrage=20000;
		voitureMultiplat.marque="teslla";
		voitureMultiplat.modele="5s";
		voitureMultiplat.nbre_de_places=12;
		voitureMultiplat.nbres_de_roues=4;
		voitureMultiplat.options="toit ouvert";
		voitureMultiplat.plaque_dimmatriculation="0615630000";
		voitureMultiplat.prix_carburant=10;
		voitureMultiplat.prix_initial=396234;
		voitureMultiplat.puissance=355;
		voitureMultiplat.monsieurbidule.nom="laetitia";
		voitureMultiplat.monsieurbidule.prenom="monprenom";
		voitureMultiplat.monsieurbidule.adresse="monadresse";
		voitureMultiplat.monsieurbidule.setDistance_parcourue(30000);
		
		double prix_argus_tesla= 0;
		double prix_argus_Multiplat=0;
		// prix_argus_tesla=voitureTesla.prix_argus(voitureTesla.prix_initial, voitureTesla.annee_fabrication );
		prix_argus_tesla =voitureTesla.prix_argus(voitureTesla.getPrix_initial(), voitureTesla.getAnnee_fabrication());
		prix_argus_Multiplat =voitureMultiplat.prix_argus(voitureMultiplat.getPrix_initial(), voitureMultiplat.getAnnee_fabrication());
		
		double coût_voiture_Multiplat=0;
		double coût_voiture_tesla=0;
		coût_voiture_Multiplat = voitureMultiplat.coût_voiture_an(voitureMultiplat.getMonsieurbidule().getDistance_parcourue(),voitureMultiplat.prix_carburant, voitureMultiplat.consommation_carburant);
		coût_voiture_tesla = voitureTesla.coût_voiture_an(voitureTesla.getMonsieurbidule().getDistance_parcourue(),voitureTesla.prix_carburant, voitureTesla.consommation_carburant);
		
		
		
		System.out.println("prix_argus_tesla= "+prix_argus_tesla);
		System.out.println("prix_argus_Multiplat= "+prix_argus_Multiplat);
		
		System.out.println("coût_voiture_tesla= "+coût_voiture_tesla);
		System.out.println("coût_voiture_Multiplat= "+coût_voiture_Multiplat);
	}  
    

   

}