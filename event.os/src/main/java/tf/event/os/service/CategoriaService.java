package tf.event.os.service;

import tf.event.os.entities.Categoria;


public interface CategoriaService {
	
	Iterable<Categoria> listAllCategorias();
	Categoria getCategoriaById(Integer id);
	Categoria saveCategoria(Categoria Categoria);
	void deleteCategoria(Integer id);

}
