package com.mb.api.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class BookModel
{
	private String title;
	
	private String description;
	
	private String author;
	
	private String publication;
	
	private Double price;
	
	private Integer pages;

}
