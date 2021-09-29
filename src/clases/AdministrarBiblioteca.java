package clases;

public class AdministrarBiblioteca {

	public static void main(String[] args) {
	
		Prestamos [] arrayprestamos;
		Estudiantes arrayEstudiantes;
		Libros libro1 = new Libros(123,"ExpresoOriente","AgathaChristie");//se crean los libros
		arrayEstudiantes = new Estudiantes(159,"nombre","apellido");
		arrayprestamos[0] = new Prestamos(123,arrayEstudiantes,libro1);
		System.out.println(arrayprestamos[0].toString());
	}

}
