/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duu
 */
public class Book {
	private String tilte, publicationYear;
	private int pages;

	public Book(String tilte, String publicationYear, int pages){
		this.tilte = tilte;
		this.publicationYear = publicationYear;
		this.pages = pages;
	}

	public String getTilte(){
		return this.tilte;
	}

	@Override
	public String toString(){
		return this.tilte + ", " + this.pages + " pages, " + this.publicationYear;
	}
	
}
