package mf0227.uf2404.actividad3;

public class Libro implements Comparable<Libro> {
	
	private int id;
	private String nombre;
	private int paginas;
	
	public Libro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.paginas = 0;
	}

	public Libro(int id, String nombre, int paginas) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", paginas=" + paginas + "]";
	}

	@Override
	public int compareTo(Libro o) {
		return this.nombre.compareTo(o.nombre);
		//return this.paginas - o.paginas;
	}
	
}
