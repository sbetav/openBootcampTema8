package tema8;
public class tema8 {
	
	public static void main (String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setEdad(17);
		persona1.setNombre("Santiago");
		persona1.setTelefono(123);
		
		System.out.println("Nombre: " + persona1.getNombre());
		System.out.println("Edad: " + persona1.getEdad());
		System.out.println("Telefono: " + persona1.getTelefono());
		
	}
	
}
