package tf.event.os.service;

import tf.event.os.entities.Usuario;

public interface UsuarioService {
	
	Iterable<Usuario> listAllUsuarios();
	Usuario getUsuarioById(Integer id);
	Usuario saveUsuario(Usuario Usuario);
	void deleteUsuario(Integer id);

}
