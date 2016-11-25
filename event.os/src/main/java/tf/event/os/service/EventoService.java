package tf.event.os.service;

import tf.event.os.entities.Evento;

public interface EventoService {
	
	Iterable<Evento> listAllEventos();
	Evento getEventoById(Integer id);
	Evento saveEvento(Evento Evento);
	void deleteEvento(Integer id);
	Iterable<Evento> getEventosbyCategoria(Integer id);
	Iterable<Evento> getEventosbyDistrito(Integer id);

}
	