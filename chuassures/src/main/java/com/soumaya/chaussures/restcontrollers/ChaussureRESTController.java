package com.soumaya.chaussures.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumaya.chaussures.entities.Chaussure;
import com.soumaya.chaussures.service.ChaussureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ChaussureRESTController {
	
	@Autowired
	ChaussureService chaussureService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Chaussure> getAllChaussures() {
	return chaussureService.getAllChaussures();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Chaussure getChaussureById(@PathVariable("id") Long id) {
	return chaussureService.getChaussure(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Chaussure createChaussure(@RequestBody Chaussure chaussure) {
	return chaussureService.saveChaussure(chaussure);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Chaussure updateChaussure(@RequestBody Chaussure chaussure) {
	return chaussureService.updateChaussure(chaussure);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteChaussure(@PathVariable("id") Long id)
	{
		chaussureService.deleteChaussureById(id);
	}
	
	@RequestMapping(value="/chausslieu/{idLieu}",method = RequestMethod.GET)
	public List<Chaussure> getChaussuresByLieuId(@PathVariable("idLieu") Long idLieu) {
	return chaussureService.findByLieuIdL(idLieu);
	}
	
}
