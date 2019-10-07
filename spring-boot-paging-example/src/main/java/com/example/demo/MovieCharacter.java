package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "character")
public class MovieCharacter {
	
	@Id
	  @GeneratedValue
	  private Long id;
	  private String name;
	  private String movie;

}
