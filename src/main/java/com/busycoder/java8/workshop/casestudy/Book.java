package com.busycoder.java8.workshop.casestudy;

import java.util.List;
import java.util.stream.Stream;

class Book {
	private String title;
	private List<Author> authors;
	private int pages;
	private Subject subject;
	private int year;
	private String isbn;

	public Stream<Author> getAuthorStream(){
		return this.getAuthors().stream();
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(String title, List<Author> authors, int pages, Subject subject,
                int year, String isbn) {
		super();
		this.title = title;
		this.authors = authors;
		this.pages = pages;
		this.subject = subject;
		this.year = year;
		this.isbn = isbn;
	}
	public Book() {}
	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", pages="
				+ pages + ", subject=" + subject + ", year=" + year + ", isbn="
				+ isbn + "]";
	}
	
	
	
	
	
}