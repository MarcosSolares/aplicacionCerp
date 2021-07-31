package aplicacionCerp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner teclado= new Scanner(System.in);
	

	public static void main(String[] args) {
		ArrayList<Estudiante> estudiante= new ArrayList<Estudiante>();
		ArrayList<Docente> docente= new ArrayList<Docente>();
		ArrayList<Cursos> cursos= new ArrayList<Cursos>();
		ArrayList listado= new ArrayList();
		Scanner lector= new Scanner(System.in);
		boolean programaActivo = true;
		
		
		do {
		System.out.println("Elige la opcion que desees ejecutar : ");
		System.out.println("*******Estudiantes******* ");
		System.out.println("1. Agregar Estudiante ");
		System.out.println("2. Eliminar Estudiante ");
		System.out.println("3. Modificar Estudiante ");
		System.out.println("4. Lista de Estudiantes ");
		System.out.println("*******Docentes******* ");
		System.out.println("5. Agregar Docente ");
		System.out.println("6. Eliminar Docente ");
		System.out.println("7. Modificar Docente ");
		System.out.println("8. Lista de Docente ");
		System.out.println("*******Cursos******* ");
		System.out.println("9. Agregar Curso ");
		System.out.println("10. Eliminar Curso ");
		System.out.println("11. Modificar Curso ");
		System.out.println("12. Lista de Cursos ");
		System.out.println("13. Salir  ");
		
		int opcion = lector.nextInt();
		
		if(opcion == 1) {
			System.out.println("--------------------------------------------");
            System.out.println("Has elegido Agregar Estudiante");
        	System.out.println("--------------------------------------------");
			System.out.println("Digita la Cedula del Estudiante sin punto ni guiones: ");
			int cedula= lector.nextInt();
			
			if(listado.contains(cedula)) {
				 System.out.println("***********************");
				 System.out.println("cuidado cedula existente ");
				 System.out.println("***********************");
			 }else {
					 listado.add(cedula);
					 System.out.println("cedula agregada correctamente ");
					 System.out.println("-----------------------------------");		 
				 }
			System.out.println("Digita el Nombre del  Estudiante: ");
			String nombre= lector.next();
			System.out.println("Digita el Apellido del  Estudiante: ");
			String apellido= lector.next();
			System.out.println("Digita la Nota: ");
			float nota= lector.nextInt();
			 System.out.println("********************************************************");
			 System.out.println("Estudiante agregado con exito");
			 System.out.println("********************************************************");
			Estudiante a= new Estudiante(cedula, nombre, apellido,nota);
			estudiante.add(a);
			
			
	}else if (opcion==2) {
	
			System.out.println("--------------------------------------------");
            System.out.println("Has elegido Eliminar Estudiantes"); 
            System.out.println("--------------------------------------------");
			System.out.println("Digita el Apellido del Estudiante a Eliminar: ");
			
			String apellido= lector.next();
			
			Iterator<Estudiante> it = estudiante.iterator();
			
			while(it.hasNext()) {
				Estudiante a = it.next();
				if (a.getApellido().equals(apellido)) {
					it.remove();
					System.out.println("********************************************************");
					System.out.println(" Estudiante Eliminado: ");
					System.out.println("********************************************************");
				}
			}
	}else if (opcion==3) {
	
			System.out.println("--------------------------------------------");
            System.out.println("Has elegido Modificar Estudiantes"); 
            System.out.println("--------------------------------------------");
			System.out.println("Digita el Apellido del Estudiante a Modificar: ");	
			String apellido= lector.next();
			
			System.out.println("Digita la Cedula Nueva: ");
			int cedula2= lector.nextInt();
			System.out.println("Digita el Nombre Nuevo: ");
			String nombre2= lector.next();
			System.out.println("Digita el Apellido Nuevo: ");
			String apellido2= lector.next();
			System.out.println("Digita Nueva Nota: ");
			float nota2= lector.nextInt();
			
			Iterator<Estudiante> it = estudiante.iterator();
			
			while(it.hasNext()) {
				Estudiante a = it.next();
				if (a.getApellido().equals(apellido)) {
					a.setCedula(cedula2);
					a.setNombre(nombre2);
					a.setApellido(apellido2);
					a.setNota(nota2);
				
					System.out.println("********************************************************");
					System.out.println(" Estudiante Modificado: ");
					System.out.println("********************************************************");	
				
				}
			}
			
	}else if (opcion==4) {

				for (Estudiante a: estudiante) {
					 System.out.println("****************");
					 System.out.println("Datos");
					 System.out.println("*************");		
				System.out.println("Cedula: " + a.getCedula() + ", Nombre: "+ a.getNombre() +", Apellido: "+ a.getApellido()+", Nota: "+ a.getNota());
				
				}		
	}else if(opcion == 5) {
				System.out.println("--------------------------------------------");
	            System.out.println("Has elegido Agregar Docente");
	        	System.out.println("--------------------------------------------");
				System.out.println("Digita la Cedula del Docente sin punto ni guiones: ");
				int cedula= lector.nextInt();
				
				if(listado.contains(cedula)) {
					 System.out.println("***********************");
					 System.out.println("cuidado cedula existente ");
					 System.out.println("***********************");
				 }else {
						 listado.add(cedula);
						 System.out.println("cedula agregada correctamente ");
						 System.out.println("-----------------------------------");		 
					 }
				System.out.println("Digita el Nombre del  Docente: ");
				String nombre= lector.next();
				System.out.println("Digita el Apellido del   Docente: ");
				String apellido= lector.next();
				System.out.println("Digita Horario del Docente ( 0 a 24 ): ");
				float horario= lector.nextInt();
				 System.out.println("********************************************************");
				 System.out.println("Docente agregado con exito");
				 System.out.println("********************************************************");
				Docente a= new Docente(cedula, nombre, apellido,horario);
				docente.add(a);
				
				
		}else if (opcion==6) {
			System.out.println("--------------------------------------------");
            System.out.println("Has elegido Eliminar Docente"); 
            System.out.println("--------------------------------------------");
			System.out.println("Digita el Apellido del Estudiante a Eliminar: ");
			
			String apellido= lector.next();
			
			Iterator<Docente> it = docente.iterator();
			
			while(it.hasNext()) {
				Docente a = it.next();
				if (a.getApellido().equals(apellido)) {
					it.remove();
					System.out.println("********************************************************");
					System.out.println(" Docente Eliminado: ");
					System.out.println("********************************************************");
				}
			}}else if (opcion==7) {
				System.out.println("--------------------------------------------");
	            System.out.println("Has elegido modificar Docente"); 
	            System.out.println("--------------------------------------------");
				System.out.println("Digita el Apellido del Profesor a Modificar: ");	
				String apellido= lector.next();
				
				System.out.println("Digita la Cedula Nueva: ");
				int cedula2= lector.nextInt();
				System.out.println("Digita el Nombre Nuevo: ");
				String nombre2= lector.next();
				System.out.println("Digita el Apellido Nuevo: ");
				String apellido2= lector.next();
				System.out.println("Digita Nuevo Horario: ");
				float horario2= lector.nextInt();
				
				Iterator<Docente> it = docente.iterator();
				
				while(it.hasNext()) {
					Docente b = it.next();
					if (b.getApellido().equals(apellido)) {
						b.setCedula(cedula2);
						b.setNombre(nombre2);
						b.setApellido(apellido2);
						b.setNota(horario2);
						System.out.println("********************************************************");
						System.out.println(" Docente Modificado: ");
						System.out.println("********************************************************");
					}
				}
			}else if (opcion==8) {
				for (Docente a: docente) {
					 System.out.println("****************");
					 System.out.println("Datos");
					 System.out.println("*************");		
				System.out.println("Cedula: " + a.getCedula() + ", Nombre: "+ a.getNombre() +", Apellido: "+ a.getApellido()+", Hora: "+ a.getHorario());
					
				}
			}else if(opcion == 9) {
					System.out.println("--------------------------------------------");
		            System.out.println("Has elegido Agregar Curso");
		        	System.out.println("--------------------------------------------");
					System.out.println("Horario del Curso (0 a 24): ");
					float hora= lector.nextInt();
					
					if(listado.contains(hora)) {
						 System.out.println("***********************");
						 System.out.println("cuidado hora existente ");
						 System.out.println("***********************");
					 }else {
							 listado.add(hora);
							 System.out.println("hora agregada correctamente ");
							 System.out.println("-----------------------------------");		 
						 }
					System.out.println("Digita el nombre de la Materia: ");
					String materia= lector.next();
					System.out.println("Digita el Dia( ej Viernes ): ");
					String dia= lector.next();
					
					 System.out.println("********************************************************");
					 System.out.println("Curso agregado con exito");
					 System.out.println("********************************************************");
					Cursos a= new Cursos(materia, dia, hora);
					cursos.add(a);
						
			}else if (opcion==10) { 
				
					System.out.println("--------------------------------------------");
					System.out.println("Has elegido Eliminar Curso"); 
					System.out.println("--------------------------------------------");
					System.out.println("Digita el nombre de la Materia a Eliminar: ");
				
					String materia= lector.next();
				
					Iterator<Cursos> it = cursos.iterator();
				
					while(it.hasNext()) {
					Cursos a = it.next();
					if (a.getMateria().equals(materia)) {
						it.remove();
						System.out.println("********************************************************");
						System.out.println(" Curso Eliminado: ");
						System.out.println("********************************************************");
					}
				}	     	
					
			}else if (opcion==11) {
				
				{
					
					System.out.println("--------------------------------------------");
		            System.out.println("Has elegido Modificar Curso"); 
		            System.out.println("--------------------------------------------");
					System.out.println("Digita la Materia del Curso a Modificar: ");	
					String materia= lector.next();
					
					System.out.println("Digita la Nueva Materia: ");
					String materia2= lector.next();
					System.out.println("Digita el Dia (ej JUEVES ): ");
					String dia2= lector.next();
					System.out.println("Digita Nuevo Horario: ");
					float hora2= lector.nextInt();
					
					Iterator<Cursos> it = cursos.iterator();
					
					while(it.hasNext()) {
						Cursos a = it.next();
						if (a.getMateria().equals(materia)) {
							
							a.setDia(dia2);
							a.setHora(hora2);
						
							System.out.println("********************************************************");
							System.out.println(" Curso Modificado: ");
							System.out.println("********************************************************");	
						
						}
					}
				}	
					
			}else if (opcion==12) {		
					 
				for (Cursos a: cursos) {
					 System.out.println("****************");
					 System.out.println("Datos: ");
					 System.out.println("*************");		
				System.out.println("Materia: " + a.getMateria() + ", Dia: "+ a.getDia() +", Hora: "+ a.getHora());
				}		
		}else if (opcion==13) {
			programaActivo= false;
			
	}else System.out.println("***************************************");
		
		}while (programaActivo);
		
	}	
}