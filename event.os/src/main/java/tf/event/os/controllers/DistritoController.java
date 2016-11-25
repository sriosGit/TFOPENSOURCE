package tf.event.os.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tf.event.os.entities.Distrito;

import tf.event.os.service.DistritoService;

@Controller
public class DistritoController {

	@Autowired
	private DistritoService distritoService;
	

	@RequestMapping(value = "/distritos", method = RequestMethod.GET)
	public String listDistritos(Model model) {
		model.addAttribute("distritos", distritoService.listAllDistritos());
		return "distritos";// VISTA HTML
	}

	@RequestMapping("distrito/new")
	public String newCategoria(Model model) {
		model.addAttribute("distrito", new Distrito());
		return "distritoform";
	}

	@RequestMapping(value = "/distrito/new", method = RequestMethod.POST)
	public String saveCategoria(Distrito d){
        distritoService.saveDistrito(d);
		return "redirect:/distritos";
	}
	
	@RequestMapping("distrito/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		model.addAttribute("distrito",distritoService.getDistritoById(id));
		return "distritoform";
	}
	
	@RequestMapping("distrito/delete/{id}")
	public String delete(@PathVariable Integer id){
		distritoService.deleteDistrito(id);
		return "redirect:/distritos";
	}
	
	
}
