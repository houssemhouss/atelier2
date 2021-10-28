package com.houssem.joueur.service;

import java.util.List;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;

public interface JoueurService  {
	Joueur saveJoueur(Joueur j);
	Joueur updateJoueur(Joueur j);
	void deleteJoueur(Joueur j);
	void deleteJoueurById(Long id);
	Joueur getJoueur(Long id);
	List<Joueur> getAllJoueurs();
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurLike(String nom);
	List<Joueur> findByNomPrix (String nom, Double prix);
	List<Joueur> findByEquipe (Equipe equipe);
	List<Joueur> findByEquipeIdEqui(Long id);
	List<Joueur> findByOrderByNomJoueurAsc();
	List<Joueur> trierJoueurNomsPrix();
	}


