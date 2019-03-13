//Definicion de la Clase 

public class Materias {
	
	String nombre;
	int modulo;
	String dia;
	String hora;

	
	//Declaracion del Metodo Primcipal "Main"
	
	public static void main (String [] args){
		
		
		//Construccion de Objetos 
		
		Materias calculo = new Materias();
		
		calculo.nombre = "Calculo 2";
		calculo.modulo = 1;
		calculo.dia = "Lunes";
		calculo.hora = "7:30 a 10:00 pm";
		
		
		Materias estructurasDatos = new Materias();
		
		estructurasDatos.nombre = "Estructuras de Datos";
		estructurasDatos.modulo = 1;
		estructurasDatos.dia = "Martes";
		estructurasDatos.hora = "7:30 a 10:00 pm";
		
		
		Materias elementosTeoria = new Materias();

		elementosTeoria.nombre = "Elementos Teoria de la Computacion";
		elementosTeoria.modulo = 1;
		elementosTeoria.dia = "Martes";
		elementosTeoria.hora = "7:30 a 10:00 pm";
		
		//Muestra en consola Objetos y sus Atributos
		
		System.out.println("El Horario queda establecido asi: \n");
		
		System.out.println(calculo.dia +"\n" 
				+calculo.nombre + " Modulo: "+calculo.modulo + "\n" +calculo.hora + "\n");
		
		System.out.println(estructurasDatos.dia +"\n" 
				+estructurasDatos.nombre + " Modulo: "+estructurasDatos.modulo + "\n" +estructurasDatos.hora + "\n");
		
		System.out.println(elementosTeoria.dia +"\n" 
				+elementosTeoria.nombre + " Modulo: "+elementosTeoria.modulo + "\n" +elementosTeoria.hora + "\n");
		
		
	}
	
}



