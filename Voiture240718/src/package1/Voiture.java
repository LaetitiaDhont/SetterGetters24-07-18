package package1;

import java.util.*;

public class Voiture {



	Proprietaire monsieurbidule = new Proprietaire();
	
	String id_voiture;
	String couleur;
	String taille;
	String type;
	String marque;
	String modele;
	String plaque_dimmatriculation;
	int nbres_de_roues;
	String energie;
	int nbre_de_places;
	int puissance;
	int kilométrage;
	String options;
	String boite_de_vitesse;
	double annee_fabrication;
	double prix_initial;
	double prix_carburant;
	double annee_actuelle = 2018;
	double consommation_carburant;

	public double prix_argus(double prix_initial2,double annee_fabrication ) {
		// -1000€ par an
		double prixArg = prix_initial2/((annee_actuelle-annee_fabrication)*1000);
		return(prixArg);
		
	}

	
	public double coût_voiture_an(double distance_parcourue,double prix_carburant, double consommation_carburant) {
		// TODO implement here
		double coutAn = distance_parcourue * prix_carburant* consommation_carburant/100;
		return(coutAn);
	}


	public Proprietaire getMonsieurbidule() {
		return monsieurbidule;
	}


	public void setMonsieurbidule(Proprietaire monsieurbidule) {
		this.monsieurbidule = monsieurbidule;
	}


	public String getId_voiture() {
		return id_voiture;
	}


	public void setId_voiture(String id_voiture) {
		this.id_voiture = id_voiture;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public String getTaille() {
		return taille;
	}


	public void setTaille(String taille) {
		this.taille = taille;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public String getPlaque_dimmatriculation() {
		return plaque_dimmatriculation;
	}


	public void setPlaque_dimmatriculation(String plaque_dimmatriculation) {
		this.plaque_dimmatriculation = plaque_dimmatriculation;
	}


	public int getNbres_de_roues() {
		return nbres_de_roues;
	}


	public void setNbres_de_roues(int nbres_de_roues) {
		this.nbres_de_roues = nbres_de_roues;
	}


	public String getEnergie() {
		return energie;
	}


	public void setEnergie(String energie) {
		this.energie = energie;
	}


	public int getNbre_de_places() {
		return nbre_de_places;
	}


	public void setNbre_de_places(int nbre_de_places) {
		this.nbre_de_places = nbre_de_places;
	}


	public int getPuissance() {
		return puissance;
	}


	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}


	public int getKilométrage() {
		return kilométrage;
	}


	public void setKilométrage(int kilométrage) {
		this.kilométrage = kilométrage;
	}

	public double getannee_actuelle() {
		return annee_actuelle;
	}
	
	public String getOptions() {
		return options;
	}


	public void setOptions(String options) {
		this.options = options;
	}


	public String getBoite_de_vitesse() {
		return boite_de_vitesse;
	}


	public void setBoite_de_vitesse(String boite_de_vitesse) {
		this.boite_de_vitesse = boite_de_vitesse;
	}


	public double getAnnee_fabrication() {
		return annee_fabrication;
	}


	public void setAnnee_fabrication(double annee_fabrication) {
		this.annee_fabrication = annee_fabrication;
	}


	public double getPrix_initial() {
		return prix_initial;
	}


	public void setPrix_initial(double prix_initial) {
		this.prix_initial = prix_initial;
	}


	public double getPrix_carburant() {
		return prix_carburant;
	}


	public void setPrix_carburant(double prix_carburant) {
		this.prix_carburant = prix_carburant;
	}


	public double getConsommation_carburant() {
		return consommation_carburant;
	}


	public void setConsommation_carburant(double consommation_carburant) {
		this.consommation_carburant = consommation_carburant;
	}

}