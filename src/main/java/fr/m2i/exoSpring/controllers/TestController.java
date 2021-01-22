package fr.m2i.exoSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test") //http://localhost:8080/test
	public String test() {
		return "affichage test";
	}
}
