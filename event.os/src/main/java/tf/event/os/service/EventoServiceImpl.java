package tf.event.os.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tf.event.os.entities.Evento;
import tf.event.os.repository.EventoRepository;

@Service
public class EventoServiceImpl implements EventoService{

		@Autowired
		private EventoRepository EventoRepository;
		
		@Override
		public Iterable<Evento> listAllEventos() {
			// TODO Auto-generated method stub
		
			return EventoRepository.findAll();
		}

		@Override
		public Evento getEventoById(Integer id) {
			// TODO Auto-generated method stub
			return EventoRepository.findOne(id);
		}

		@Override
		public Evento saveEvento(Evento Evento) {
			// TODO Auto-generated method stub
			return EventoRepository.save(Evento);
		}

		@Override
		public void deleteEvento(Integer id) {
			// TODO Auto-generated method stub
			EventoRepository.delete(id);
		}

		@Override
		public Iterable<Evento> getEventosbyCategoria(Integer id) {
			// TODO Auto-generated method stub
			return EventoRepository.findByCategoria_id(id);
		}

		@Override
		public Iterable<Evento> getEventosbyDistrito(Integer id) {
			// TODO Auto-generated method stub
			return EventoRepository.findByDistrito_id(id);
		}

	}


