package aplicacionCursos;

public class Menu {	Personas Estudiante = new Personas();
Personas Profesor = new Personas();
Personas Cursos = new Personas();
int elige;
boolean sal1 = false, sal2 = false;
public char opcion;
public Menu(){opcion = ' ';}

 public void MenuPrincipal(){
    Lectores leer = new Lectores(); 
    sal1 = false;
    	do{
    System.out.println("Bienvenido \n1.Estudiantes \n2. Profesores \n3.Cursos \n4.Salir ");
    elige = leer.LecturaEntero();
    if (elige <= 3){ MenuA();}
    else if (elige == 4) { System.out.println("Nos vemos pronto!!!"); sal2 = true;}
    else
        System.out.println("Opcion desconocida. Intente de nuevo.");
        System.out.println("                                     ");
    }
    	while(sal2 == false);
}

public void MenuOperaciones(){   
Lectores leer = new Lectores();
System.out.println("Elige una opcion que desees ejecutar en el menú: ");
System.out.println("Ingrese A para agregarle datos.");
System.out.println("Ingrese B para imprimir todos los datos.");
System.out.println("Ingrese C para volver al menu.");
System.out.print("Opcion: ");
opcion = leer.LecturaChar();
}


public void MenuA(){       
    do{
    switch(elige){
            case 1:
                System.out.println("--------------------------------------------");
                System.out.println("Has elegido 1.Estudiantes");
                MenuOperaciones();
                
                
                
                if(opcion == 'A'||opcion == 'a'){/*Estudiante.setNombreEstudiante(); Disco1.setAutor(); Disco1.setFormato();*/ Estudiante.setPersonas();}
                else if(opcion == 'B'||opcion == 'b'){
                ///System.out.println("Nombre del disco: " + Disco1.getNombreDisco());
                ///System.out.println("Nombre del autor: " + Disco1.getAutor());
                ///System.out.println("Nombre del formato: " + Disco1.getFormato());
                System.out.println("Canciones: ");
                Estudiante.getPersonas();}
                else if(opcion == 'C'||opcion == 'c'){ System.out.println("Saliendo... "); sal1 = true;}
                else
                    System.out.println("Opcion desconocida. Intente de nuevo.");
                    System.out.println("                                     ");
                System.out.println("--------------------------------------------");
            break;
            case 2:
                System.out.println("--------------------------------------------");
                System.out.println("Has elegido 2.Profesor ");
                MenuOperaciones();
                if(opcion == 'A'||opcion == 'a'){/*Disco2.setNombreDisco(); Disco2.setAutor(); Disco2.setFormato();*/ Profesor.setPersonas();}
                else if(opcion == 'B'||opcion == 'b'){
                ///System.out.println("Nombre del disco: " + Disco2.getNombreDisco());
                ///System.out.println("Nombre del autor: " + Disco2.getAutor());
                ///System.out.println("Nombre del formato: " + Disco2.getFormato());
                System.out.println("Canciones: ");
                Profesor.getPersonas();}
                else if(opcion == 'C'||opcion == 'c'){ System.out.println("Saliendo... "); sal1 = true;}
                else
                    System.out.println("Opcion desconocida. Intente de nuevo.");
                    System.out.println("                                     ");
                System.out.println("--------------------------------------------");
            break;
            case 3:
                System.out.println("--------------------------------------------");
                System.out.println("Has elegido Cursos: ");
                MenuOperaciones();
                if(opcion == 'A'||opcion == 'a'){/*Cursos.setNombreDisco(); Disco3.setAutor(); Disco3.setFormato();*/ Cursos.setPersonas();}
                else if(opcion == 'B'||opcion == 'b'){
               /// System.out.println("Nombre del disco: " + Disco3.getNombreDisco());
              ///  System.out.println("Nombre del autor: " + Disco3.getAutor());
               /// System.out.println("Nombre del formato: " + Disco3.getFormato());
                System.out.println("Cursos: ");
                Cursos.getPersonas();
                }
                else if(opcion == 'C'||opcion == 'c'){ System.out.println("Saliendo... "); sal1 = true;}
                else
                    System.out.println("Opcion desconocida. Intente de nuevo.");
                    System.out.println("                                     ");
                System.out.println("--------------------------------------------");
            break;
            default:
                System.out.println("No se reconoce la opcion insertada. Intente de nuevo.");
                System.out.println("                                                     ");
            break;
         }	
         
    
}while(sal1 == false);
MenuPrincipal();
}



}
