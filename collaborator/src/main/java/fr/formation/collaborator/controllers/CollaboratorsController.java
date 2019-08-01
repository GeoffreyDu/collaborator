package fr.formation.collaborator.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.collaborator.business.Collaborators;
import fr.formation.collaborator.business.EndDate;

@RestController
@RequestMapping("/collabs")
public class CollaboratorsController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public HttpStatus create(@RequestBody @Valid Collaborators collaborator) {
	System.out.println(collaborator);
	return HttpStatus.CREATED;
    }

    @GetMapping("/{id}")
    public Collaborators getOne(@PathVariable("id") Long id) {
	LocalDate date = LocalDate.of(1993, 12, 29);
	LocalDate start = LocalDate.of(2019, 06, 01);
	LocalDate end = LocalDate.of(2020, 11, 23);
	Collaborators collaborator = new Collaborators("az3333", "Hubry",
		"Emilie", date, start, 40000, end);
	collaborator.setId(id);
	return collaborator;
    }

    @GetMapping()
    public ArrayList<Collaborators> getAll(@RequestParam("size") int size) {
	LocalDate date1 = LocalDate.of(1996, 12, 29);
	LocalDate start1 = LocalDate.of(2019, 8, 19);
	LocalDate end1 = LocalDate.of(2020, 1, 22);
	LocalDate date2 = LocalDate.of(1999, 5, 9);
	LocalDate start2 = LocalDate.of(2019, 06, 01);
	LocalDate end2 = LocalDate.of(2020, 11, 23);
	ArrayList<Collaborators> collabList = new ArrayList<>();
	Collaborators collab1 = new Collaborators("sqdqf4", "Hubry", "Emilie",
		date1, start1, 40000, end1);
	Collaborators collab2 = new Collaborators("khsq77", "Ducci", "Geoffrey",
		date2, start2, 30000, end2);
	collabList.add(collab1);
	collabList.add(collab2);
	return collabList;
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody Collaborators collaborator) {
	System.out.println(collaborator);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id,
	    @RequestBody Collaborators collaborator) {
	System.out.println(collaborator);
    }

    @PatchMapping("/{id}")
    public void end(@RequestBody EndDate endDate, @PathVariable("id") Long id) {
	System.out.println("Patched departure date with id: " + id);
	System.out.println(endDate);
    }
}
