package com.epicode.gestionePrenotazioni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity 
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String nomeCognome;
	private String email;
	
	public Utente(String username, String nomeCognome, String email) {
		super();
		this.username = username;
		this.nomeCognome = nomeCognome;
		this.email = email;
	}
	
}