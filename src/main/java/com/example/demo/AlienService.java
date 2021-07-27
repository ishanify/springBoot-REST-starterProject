package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlienService {

	@Autowired
	AlienRepository alienRepository;
	
	public AlienService() {
		System.out.println("I am in AlienService:DefaultConstructor");
	}
	public void createAlien(Alien alien) {
		// TODO Auto-generated method stub
		alienRepository.save(alien);
		
		
	}
	public List<Alien> fetchAllAliens() {
		// TODO Auto-generated method stub
		List<Alien> alienList = (List<Alien>) alienRepository.findAll(); 
		System.out.println("I am in AlienService:fetchAllAliens"+alienList.toString());
		return alienList;
	}
	
	
	

}
