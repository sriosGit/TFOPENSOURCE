package tf.event.os.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tf.event.os.entities.Categoria;
import tf.event.os.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

		@Autowired
		private CategoriaRepository categoriaRepository;
		
		@Override
		public Iterable<Categoria> listAllCategorias() {
			
			return  categoriaRepository.findAll();
		}

		@Override
		public Categoria getCategoriaById(Integer id) {
			// TODO Auto-generated method stub
			return categoriaRepository.findOne(id);
		}

		@Override
		public Categoria saveCategoria(Categoria categoria) {
			// TODO Auto-generated method stub
			return categoriaRepository.save(categoria);
		}

		@Override
		public void deleteCategoria(Integer id) {
			// TODO Auto-generated method stub
			categoriaRepository.delete(id);
		}

	

	}


