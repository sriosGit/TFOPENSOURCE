package tf.event.os.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tf.event.os.entities.Usuario;
import tf.event.os.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

		@Autowired
		private UsuarioRepository UsuarioRepository;
		
		@Override
		public Iterable<Usuario> listAllUsuarios() {
			// TODO Auto-generated method stub
		
			return UsuarioRepository.findAll();
		}

		@Override
		public Usuario getUsuarioById(Integer id) {
			// TODO Auto-generated method stub
			return UsuarioRepository.findOne(id);
		}

		@Override
		public Usuario saveUsuario(Usuario Usuario) {
			// TODO Auto-generated method stub
			return UsuarioRepository.save(Usuario);
		}

		@Override
		public void deleteUsuario(Integer id) {
			// TODO Auto-generated method stub
			UsuarioRepository.delete(id);
		}

	}


