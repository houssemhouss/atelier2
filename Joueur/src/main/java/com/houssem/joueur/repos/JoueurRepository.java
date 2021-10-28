package com.houssem.joueur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {

	
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurLike(String nom);
	
	
	
	/*@Query("select j from Joueur j where j.nomJoueur like %?1 and j.prixJoueur > ?2")
	List<Joueur> findByNomPrix (String nom, Double prix);*/
	
	
	@Query("select j from Joueur j where j.nomJoueur like %:nom and j.prixJoueur > :prix")
	List<Joueur> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	
	
	
	@Query("select j from Joueur j where j.equipe = ?1")
	List<Joueur> findByEquipe (Equipe equipe);
	
	
	List<Joueur>  findByEquipeIdequi(Long id);
	
	List<Joueur> findByOrderByNomJoueurAsc();
	
	
	@Query("select j from Joueur j order by j.nomJoueur ASC, j.prixJoueur DESC")
	List<Joueur> trierJoueurNomsPrix ();
}
