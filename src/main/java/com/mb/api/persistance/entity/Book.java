package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "publicatuon")
	private String publication;
	
	@Column(name = "price", precision = 2)
	private Double price;
	
	@Column(name = "pages")
	private Integer pages;

}
