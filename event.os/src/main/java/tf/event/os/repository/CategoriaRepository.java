package tf.event.os.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tf.event.os.entities.Categoria;


@Repository
@Transactional
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

	

}
