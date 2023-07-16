package com.compito.model;


import javax.persistence.Entity;

@Entity
public class Libro extends ElementoBibliotecario {
	
	private String autore;
	private String genere;
	
	
	public Libro() {
		super();
	}

    public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [ isbn= " + getIsbn() + ", titolo= " + getTitolo() + ", anno di pubblicazione= " + getAnnoPubblicazione() + ", numero di pagine= " + getNumeroPagine() + ", autore=" + autore + ", genere=" + genere + "]";
	}
	
	

}
