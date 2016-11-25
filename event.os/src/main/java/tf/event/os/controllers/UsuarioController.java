package tf.event.os.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tf.event.os.entities.Usuario;
import tf.event.os.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public String listarticulos(Model model) {
		model.addAttribute("usuarios", usuarioService.listAllUsuarios());
		return "usuarios";// VISTA HTML
	}
	

	@RequestMapping("/usuario/new")
	public String newusuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuarioform";
	}

	@RequestMapping(value = "/usuario/new", method = RequestMethod.POST)
	public String saveusuario(Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "redirect:/usuarios";
	}	
	@RequestMapping("usuario/{id}")
	public String show(@PathVariable Integer id, Model model){
		model.addAttribute("usuario",usuarioService.getUsuarioById(id));
		return "profile";
	}
	
	@RequestMapping("usuario/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		model.addAttribute("usuario",usuarioService.getUsuarioById(id));
		return "usuarioform";
	}
	
	@RequestMapping(value = "/usuario/edit", method = RequestMethod.POST)
	public String usuarioEdit(Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "redirect:/usuario/" + usuario.id;
	}
	
	@RequestMapping("usuario/delete/{id}")
	public String delete(@PathVariable Integer id){
		usuarioService.deleteUsuario(id);
		return "redirect:/usuarios";
	}
	
	
}
