package medico;

public class Medico {

	private String cedulaD;
	private String nombre;
	private String apellido;
	private String direccion;
	private String especialidad;
	private String fecha;
	private boolean borrado;
	
	public Medico(String cedula, String nombre, String apellido, String direccion, String especialidad, String fecha, boolean borrado) {
		this.cedulaD=cedula;
		this.nombre= nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.especialidad=especialidad;
		this.fecha=fecha;
		this.borrado=borrado;
	}

	public String getCedulaD() {
		return cedulaD;
	}

	public void setCedulaD(String cedulaD) {
		this.cedulaD = cedulaD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}

	public String toString() {
		
		return getCedulaD()+";"+ getNombre()+";"+ getApellido()+";"+ getDireccion()+";"+ getEspecialidad()+";"+ getFecha();
	}
}