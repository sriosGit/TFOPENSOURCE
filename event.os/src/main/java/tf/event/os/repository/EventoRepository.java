package tf.event.os.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tf.event.os.entities.Evento;

@Repository
@Transactional
public interface EventoRepository extends CrudRepository<Evento, Integer>{

	
	Iterable<Evento> findByCategoria_id(Integer id);

	
	Iterable<Evento> findByDistrito_id(Integer id);

}
