package tf.event.os.service;

import tf.event.os.entities.Distrito;

public interface DistritoService {
	
	Iterable<Distrito> listAllDistritos();
	Distrito getDistritoById(Integer id);
	Distrito saveDistrito(Distrito Distrito);
	void deleteDistrito(Integer id);

}
