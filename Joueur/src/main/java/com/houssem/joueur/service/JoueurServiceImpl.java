package com.houssem.joueur.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.repos.JoueurRepository;
@Service
public class JoueurServiceImpl implements JoueurService{
	private JoueurRepository JoueurRepository;

	@Autowired
	JoueurRepository JoueurRepository1;
	@Override
	public Joueur saveJoueur(Joueur j) {
	return JoueurRepository.save(j);
	}
	
	@Override
	public Joueur updateJoueur(Joueur p) {
	return JoueurRepository.save(p);
	}
	@Override
	public void deleteJoueur(Joueur p) {
		JoueurRepository.delete(p);
	}
	@Override
	public void deleteJoueurById(Long id) {
		JoueurRepository.deleteById(id);
	}
	@Override
	public Joueur getJoueur(Long id) {
	return JoueurRepository.findById(id).get();
	}
	@Override
	public List<Joueur> getAllJoueurs() {
	return JoueurRepository.findAll();
	}

	@Override
	public List<Joueur> findByNomJoueur(String nom) {
		
		return JoueurRepository.findByNomJoueur(nom);
	}

	@Override
	public List<Joueur> findByNomJoueurLike(String nom) {
		
		return JoueurRepository.findByNomJoueurLike(nom);
	}

	@Override
	public List<Joueur> findByNomPrix(String nom, Double prix) {
		
		return JoueurRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
		
		return JoueurRepository.findByEquipe(equipe);
	}

	@Override
	public List<Joueur> findByEquipeIdEqui(Long id) {
		
		return JoueurRepository.findByEquipeIdequi(id);
	}

	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
		
		return JoueurRepository.findByOrderByNomJoueurAsc();
	}

	@Override
	public List<Joueur> trierJoueurNomsPrix() {
		
		return JoueurRepository.trierJoueurNomsPrix();
	}
}
