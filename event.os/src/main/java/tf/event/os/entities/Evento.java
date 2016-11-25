package tf.event.os.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="evento")
public class Evento {
	
	public int id;
	public String nombre;
	public Categoria categoria;
	public String direccion;
	public Distrito distrito;
	public String url_img;
	public String descripcion;
	public Usuario organizador;
	public int rating;
	public Evento() {
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
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDireccion() {
		return direccion;
	}
	


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@ManyToOne
	@JoinColumn(name="distrito_id")
	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
		
	@ManyToOne
	@JoinColumn(name="org_usuario_id")
	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}

	public String getUrl_img() {
		return url_img;
	}

	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
