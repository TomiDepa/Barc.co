package logica;

import java.util.ArrayList;

public class Proveedor {
	private int id;
	private String nombre; 
	private String rubro;
	private String ubicacion;
	private String telefono; 
	private String email;
	private String contrasena;
	private ArrayList<Producto> productos;
	public Proveedor(int id, String nombre, String rubro, String ubicacion, String telefono, String email, String contrasena) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rubro = rubro;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.email = email;
		this.contrasena = contrasena;
		this.productos = new ArrayList<Producto>();
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
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	 public ArrayList<Producto> getProductos() {
		    return productos; 
		  }
	 
	 public void addProducto(Producto producto) {
		    getProductos().add(producto);
		    producto.setProveedor(this); 
		  }
}
