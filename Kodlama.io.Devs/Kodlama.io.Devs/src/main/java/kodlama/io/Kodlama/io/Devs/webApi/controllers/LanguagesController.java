package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@RestController  //annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguagesService languageService;
	
	@Autowired
	public LanguagesController(LanguagesService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Languages> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/add")
	public void add(Languages language) {
		languageService.add(language);
	}
	
	@GetMapping("/delete")
	public void delete(Languages language) {
		languageService.delete(language);
	}
	
	@GetMapping("/update")
	public void update(Languages language) {
		languageService.update(language);
	}
	
	@GetMapping("/getbyid")
	public String getById(int id) {
		return languageService.getById(id);
	}
	
}
