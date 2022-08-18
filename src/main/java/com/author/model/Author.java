package com.author.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String categeory;
	private long price;
	private String publisher;
	private String image;
	private String active;
	
	public Author() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public Author(Integer id, String title, String categeory, long price, String publisher, String image,
			String active) {
		super();
		this.id = id;
		this.title = title;
		this.categeory = categeory;
		this.price = price;
		this.publisher = publisher;
		this.image = image;
		this.active = active;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategeory() {
		return categeory;
	}
	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	
	
	

}
