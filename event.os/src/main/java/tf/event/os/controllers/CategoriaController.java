package tf.event.os.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tf.event.os.entities.Categoria;
import tf.event.os.service.CategoriaService;


@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	
	
	@RequestMapping(value = "/categorias", method = RequestMethod.GET)
	public String listCategoria(Model model) {
		model.addAttribute("categorias", categoriaService.listAllCategorias());
		return "categorias";// VISTA HTML
	}

	@RequestMapping("/categoria/new")
	public String newCategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "categoriaform";
	}

	@RequestMapping(value = "/categoria/new", method = RequestMethod.POST)
	public String saveCategoria(Categoria Categoria) {
		categoriaService.saveCategoria(Categoria);
		return "redirect:/categorias";
	}
	
	@RequestMapping("categoria/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		model.addAttribute("categoria",categoriaService.getCategoriaById(id));
		return "categoriaform";
	}
	
	@RequestMapping("categoria/delete/{id}")
	public String delete(@PathVariable Integer id){
		categoriaService.deleteCategoria(id);
		return "redirect:/categorias";
	}
	
	
}
