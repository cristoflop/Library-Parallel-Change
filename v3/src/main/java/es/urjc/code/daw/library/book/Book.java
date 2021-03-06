package es.urjc.code.daw.library.book;

import javax.persistence.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	
	private String title;

	@Transient
	private String description;

	private String preface;

	private Double price;

	@Transient
	private Double priceFloat;

	public Book() {}

	public Book(String nombre, String description) {
		super();
		this.title = nombre;
		this.preface = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPreface() {
		return preface != null ? preface : description;
	}

	public void setPreface(String preface) {
		this.preface = preface;
		this.description = preface;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
