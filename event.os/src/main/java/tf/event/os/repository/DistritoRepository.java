package tf.event.os.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tf.event.os.entities.Distrito;

@Repository
@Transactional
public interface DistritoRepository extends CrudRepository<Distrito, Integer> {

}
