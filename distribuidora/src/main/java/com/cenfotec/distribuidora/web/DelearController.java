
package com.cenfotec.distribuidora.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.cenfotec.distribuidora.domain.Delear;
import com.cenfotec.distribuidora.repository.DelearRepository;

@Controller
public class DelearController {
@Autowired
DelearRepository repo;

	@GetMapping("/")
	public String index(Model model) {
	    model.addAttribute("list", repo.findAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id !=null && id !=null) {
			model.addAttribute("delear", repo.findById(id));
		} else {
			model.addAttribute("delear", new Delear());
		}
	    return "save";
	}
	
	
	@PostMapping("/save")
		public String save(Delear delear, Model model) {
			repo.save(delear);
		return "redirect:/"; 
	}
	
}
