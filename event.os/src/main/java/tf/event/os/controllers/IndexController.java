package tf.event.os.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tf.event.os.service.CategoriaService;
import tf.event.os.service.DistritoService;
import tf.event.os.service.UsuarioService;


@Controller
public class IndexController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CategoriaService catService;
	
	@Autowired
	private DistritoService distService;
	
	
	@RequestMapping("/")
	public String index3(Model model){
		model.addAttribute("usuario",usuarioService.getUsuarioById(5));
		model.addAttribute("categorias", catService.listAllCategorias());
		model.addAttribute("distritos", distService.listAllDistritos());
		
		return "index3";//==> VISTA
	}
	
	@RequestMapping("/admin")
	public String index(){
		return "index";//==> VISTA
	}
	

}
