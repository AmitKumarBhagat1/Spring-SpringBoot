package com.restapi.book.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Auther {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "auther_id")
	private int aId;
	@Column(name = "auther_name")
	private String aName;
	@Column(name = "auther_language")
	private String alanguage;
	
	@OneToOne(mappedBy = "auther")
	@JsonBackReference
	private Book book;
	
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getAlanguage() {
		return alanguage;
	}
	public void setAlanguage(String alanguage) {
		this.alanguage = alanguage;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	

}
