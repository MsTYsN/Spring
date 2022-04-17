package com.example.example1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//Les methodes de la classe HelloWorldController peuvent repondre aux requetes HTTP

@Controller
public class HelloWorldController {
	
	//L'appel de l'url relative /hello execute avec la methode GET execute la methode afficher
	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	//@PostMapping("/hello")
	@GetMapping("/hello")
	@ResponseBody //retourne le contenu du corps de la réponse
	public String afficher() {
		return "Hello World";
	}
	
	@GetMapping("/world")
	@ResponseBody
	public String afficherAutreMessage() {
		return "ajpsdpoajsdposjd";
	}
	
	@GetMapping("/projects/{id}")
	public String afficher(@PathVariable int id) {
		return "Projet";
	}
	
	@GetMapping("/projects/{id}")
	public String afficherP(@PathVariable(name="id") int idP) {
		return "Projet";
	}
}
