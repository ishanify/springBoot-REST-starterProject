package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {
	
	AlienService alienService;

	public AlienController(AlienService alienService) {
		System.out.println("I am in AlientController:Constructor");
		this.alienService=alienService;
	}
	
	@GetMapping("aliens")
	public List<Alien> getAliens (){
		
		System.out.println("I am in AlienController:getAliens()");
		return alienService.fetchAllAliens();
	}
	
	@PostMapping("alien")
	public void createAalien(@RequestBody Alien alien) {
		System.out.println(alien.toString());
		alienService.createAlien(alien);
		
	}

}
