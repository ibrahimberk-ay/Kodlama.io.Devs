package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.PLangService;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@RestController
@RequestMapping("/api/plangs")
public class PLangController {
	private PLangService pLangService;

	@Autowired
	public PLangController(PLangService pLangService) {
		this.pLangService = pLangService;
	}
	
	
	@GetMapping("/add")
	public void add(PLanguage pLang) {
		pLangService.add(pLang);
	}
	@GetMapping("/delete")
	public void delete(int id) {
		pLangService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public PLanguage getById(int id) {
		
		return pLangService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<PLanguage> getAll() {
		
		return pLangService.getAll();
	}
	@GetMapping("/update")
	public void update(int id,String name) {
		pLangService.update(id, name);
		
	}

}
