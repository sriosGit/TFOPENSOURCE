package tf.event.os.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tf.event.os.entities.Distrito;
import tf.event.os.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{

		@Autowired
		private DistritoRepository DistritoRepository;
		
		@Override
		public Iterable<Distrito> listAllDistritos() {
			// TODO Auto-generated method stub
		
			return DistritoRepository.findAll();
		}

		@Override
		public Distrito getDistritoById(Integer id) {
			// TODO Auto-generated method stub
			return DistritoRepository.findOne(id);
		}

		@Override
		public Distrito saveDistrito(Distrito Distrito) {
			// TODO Auto-generated method stub
			return DistritoRepository.save(Distrito);
		}

		@Override
		public void deleteDistrito(Integer id) {
			// TODO Auto-generated method stub
			DistritoRepository.delete(id);
		}

	}


