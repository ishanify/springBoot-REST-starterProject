package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alien")
public class Alien {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer id;
	
	private Integer points;
	private String name;
	//why I got error if default constructor was not there?
	public Alien() {
		System.out.println("I am in Alien:Default Constructor");
	}
	public Alien(Integer id, String name, Integer points) {
		System.out.println("I am in Alien:parameterized constructor");
		this.id = id;
		this.name = name;
		this.points = points;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "id = "+id+", name = " + name + ", points = " + points;
		
		
		
	}

}


