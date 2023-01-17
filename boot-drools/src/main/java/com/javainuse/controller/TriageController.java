package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Triage;
import com.javainuse.service.TriageService;

@RestController
public class TriageController {

	private final TriageService triageService;

	@Autowired
	public TriageController(TriageService triageService) {
		this.triageService = triageService;
	}

	@RequestMapping(value = "/triage", method = RequestMethod.POST, produces = "application/json")
	public Triage getDecision(@RequestBody Triage triage) {

		return triageService.getDecision(triage);
	}

}
