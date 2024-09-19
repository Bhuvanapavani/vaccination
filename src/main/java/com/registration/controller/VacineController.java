package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.model.Vacine;
import com.registration.repository.VacineRepo;

@RestController
@RequestMapping("/vacine")
public class VacineController {
	@Autowired
	private VacineRepo repo;
	@PostMapping("/add")
public Vacine newUser(@RequestBody Vacine model) {
		Vacine save=repo.save(model);
		return save;
	}

}
