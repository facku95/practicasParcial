package clases;

public class Estudiantes {
private Integer dni;
private String nombre,Apellido;

public Integer getDni() {
	return dni;
}

public void setDni(Integer dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return Apellido;
}

public void setApellido(String apellido) {
	Apellido = apellido;
}

public Estudiantes(Integer dni, String nombre, String apellido) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	Apellido = apellido;
}

}
