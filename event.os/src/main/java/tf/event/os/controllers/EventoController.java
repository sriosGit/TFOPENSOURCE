package tf.event.os.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tf.event.os.entities.Evento;
import tf.event.os.service.CategoriaService;
import tf.event.os.service.DistritoService;
import tf.event.os.service.EventoService;
import tf.event.os.service.UsuarioService;

@Controller
public class EventoController {

	@Autowired
	private EventoService eventoService;
	
	@Autowired
	private CategoriaService catService;
	
	@Autowired
	private DistritoService distService;
	
	@Autowired
	private UsuarioService usService;
	

	
	@RequestMapping(value = "/eventos", method = RequestMethod.GET)
	public String listarticulos(Model model) {
		model.addAttribute("eventos", eventoService.listAllEventos());
		return "eventos";// VISTA HTML
	}
	@RequestMapping("evento/new")
	public String newEvento(Model model) {

		model.addAttribute("evento", new Evento());
		model.addAttribute("categorias", catService.listAllCategorias());
		model.addAttribute("distritos", distService.listAllDistritos());
		model.addAttribute("usuarios", usService.listAllUsuarios());

		return "eventoform";
	}

	@RequestMapping(value = "/evento/new", method = RequestMethod.POST)
	public String saveEvento(Evento e){
		e.setRating(0);
        eventoService.saveEvento(e);
		return "redirect:/eventos";
	}
	@RequestMapping("evento/{id}")
	public String show(@PathVariable Integer id, Model model){
		model.addAttribute("evento",eventoService.getEventoById(id));
		model.addAttribute("categorias", catService.listAllCategorias());
		model.addAttribute("distritos", distService.listAllDistritos());
		model.addAttribute("usuario",usService.getUsuarioById(5));	
		
		model.addAttribute("organizador",eventoService.getEventoById(id).organizador);
		
		return "evento";
	}
	
	@RequestMapping("evento/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		model.addAttribute("evento",eventoService.getEventoById(id));
		model.addAttribute("categorias", catService.listAllCategorias());
		model.addAttribute("distritos", distService.listAllDistritos());
		model.addAttribute("usuarios", usService.listAllUsuarios());
		return "eventoform";
	}
	
	@RequestMapping("evento/delete/{id}")
	public String delete(@PathVariable Integer id){
		eventoService.deleteEvento(id);
		return "redirect:/eventos";
	}
	
	@RequestMapping("categoria/{id}")
	public String byCategory(@PathVariable Integer id, Model model){
		model.addAttribute("categorias", catService.listAllCategorias());
		model.addAttribute("distritos", distService.listAllDistritos());
		model.addAttribute("eventos", eventoService.getEventosbyCategoria(id));
		model.addAttribute("soloNombre", catService.getCategoriaById(id));
		model.addAttribute("usuario",usService.getUsuarioById(5));
		return "3col";
	}
	
	@RequestMapping("distrito/{id}")
	public String byDistrito(@PathVariable Integer id, Model model){
		model.addAttribute("categorias", catService.listAllCategorias());
		model.addAttribute("distritos", distService.listAllDistritos());
		model.addAttribute("eventos", eventoService.getEventosbyDistrito(id));
		model.addAttribute("soloNombre", distService.getDistritoById(id));
		model.addAttribute("usuario",usService.getUsuarioById(5));
		return "3col";
	}
	
}
