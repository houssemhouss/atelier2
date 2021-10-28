package com.houssem.Joueur;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.repos.JoueurRepository;

@SpringBootTest
class JoueurApplicationTests {

	@Autowired
	private JoueurRepository JoueurRepository;
	
	
   
	@Test
	public void testCreateJoueur() {
	Joueur j = new Joueur("yassine",2243.555,new Date());
	JoueurRepository.save(j);
	}
	
	
	@Test
	public void testfindByNomPrix()
	{
	List<Joueur> joues = JoueurRepository.findByNomPrix("salim",223.555 );
	for ( Joueur j : joues)
	{
	System.out.println(j);
	}

	}
	
	
	
	
	@Test
	public void testFindJoueurByNomLike()
	{
	
	List<Joueur> joues =  JoueurRepository.findByNomJoueurLike("h");
	for (Joueur j : joues)
	{
	System.out.println(j);
	}
	}
	
	@Test
	public void testFindJoueurByNom()
	{
	
	List<Joueur> joues =  JoueurRepository.findByNomJoueur("houssem");
	for (Joueur j : joues)
	{
	System.out.println(j);
	}
	}
	
	
	@Test
	public void testFindJoueur()
	{
	Joueur j = JoueurRepository.findById(1L).get();

	System.out.println(j);
	}
	
	
	@Test
	public void testUpdateJoueur()
	{
	Joueur j = JoueurRepository.findById(3L).get();
	j.setPrixJoueur(2011.0);
	JoueurRepository.save(j);
	}
	public void testDeleteJoueur()
	{
		JoueurRepository.deleteById(3L);;
	}
	@Test
	public void testListerTousJoueurs()
	{
	List<Joueur> joues = JoueurRepository.findAll();
	for (Joueur j : joues)
	{
	System.out.println(j);
	}
	}
	
	
	 @Test
		public void testtrierJoueurNomsPrix ()
		{
		List< Joueur> joues =  JoueurRepository.trierJoueurNomsPrix();
		for ( Joueur j : joues)
		{
		System.out.println(j);
		}

		}
		
		
		
		@Test
		public void testfindByOrderByNomJoueurAsc()
		{
		List<Joueur> joues =JoueurRepository.findByOrderByNomJoueurAsc();
		for (Joueur j : joues)
		{
		System.out.println(j);
		}

		}
		
		@Test
		public void findByEquipeIdequi()
		{
		List<Joueur> joues = JoueurRepository.findByEquipeIdequi(1L);
		for (Joueur j :joues)
		{
		System.out.println(j);
		}

		}
		
		@Test
		public void testfindByEquipe()
		{
		Equipe equi = new Equipe();
		equi.setIdequi(1L);
		
		List<Joueur>  joues = JoueurRepository.findByEquipe(equi);
		for (Joueur j : joues)
		{
		System.out.println(j);
		}

		}
	
	
	
	
	
	
	
}


