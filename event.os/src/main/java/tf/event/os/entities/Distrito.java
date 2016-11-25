package tf.event.os.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="distrito")
public class Distrito {
	public int id;
	public String nombre;

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	
}
