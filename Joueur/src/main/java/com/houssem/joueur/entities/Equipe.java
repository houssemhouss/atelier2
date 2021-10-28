package com.houssem.joueur.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


@Data
@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idequi;
	private String nomequi;
	private String descriptionequi;
	
	@OneToMany(mappedBy = "equipe")
	private List<Joueur>Joueurs ;
	public Equipe(String nomequi, String descriptionequi, List<Joueur> joueurs) {
		super();
		this.nomequi = nomequi;
		this.descriptionequi = descriptionequi;
		Joueurs = joueurs;
	}
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdequi() {
		return idequi;
	}
	public void setIdequi(Long idequi) {
		this.idequi = idequi;
	}
	public String getNomequi() {
		return nomequi;
	}
	public void setNomequi(String nomequi) {
		this.nomequi = nomequi;
	}
	public String getDescriptionequi() {
		return descriptionequi;
	}
	public void setDescriptionequi(String descriptionequi) {
		this.descriptionequi = descriptionequi;
		
		
		
	}
	
	
	
	
	
	

	
	
	

}
