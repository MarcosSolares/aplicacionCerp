package aplicacionCursos;

public class Personas {

    private String /*nombreInstituto, autor, formato,*/ nombrePersona[]= new String[6];
    private double duracion, horarioPersona[] = new double[6];
    private int numeroPersonas;
   
    public Personas(){
        ///nombreInstituto = "";
        ///autor = "";
        ///formato = "";
        ///duracion = 0;
        numeroPersonas = 0;
        nombrePersona = new String[]{"","","","","","","",};
        horarioPersona = new double[]{0,0,0,0,0,0,};     
    }   
   
    /* public void setNombreInstituto(){
        System.out.println("--------------------------------------------");
        Lectores leer = new Lectores();
        System.out.println("Ingrese el nombre del disco: ");
        nombreInstituto = leer.LeerCadena();
    
     
     public void setAutor(){
         Lectores leer = new Lectores();
         System.out.println("Ingrese el nombre del autor de este disco: ");
         autor = leer.LeerCadena();
     }
     
     public void setFormato(){
         Lectores leer = new Lectores();
         System.out.println("Ingrese el formato del disco: ");
         formato = leer.LeerCadena();
     }
     }*/
     public void setPersonas(){
         Lectores leer = new Lectores();
         do{
         System.out.println("¿Cuantas canciones son?: ");
         numeroPersonas = leer.LecturaEntero();
         if(numeroPersonas > 6){System.out.println("Solo se pueden ingresar hasta 6. \nIntente de nuevo.");
         System.out.println("                                     ");
         }
         }while(numeroPersonas > 6);
         for (int i = 0, j = 1; i < numeroPersonas; i++, j++){
         System.out.println("Ingrese el nombre " + j + ": ");
         nombrePersona[i] = leer.LeerCadena();       
         System.out.println("Ingrese el horario " + j + ": ");
         horarioPersona[i] = leer.LecturaDecimal();
         duracion = duracion + horarioPersona[i];
     }
         System.out.println("Datos Listos!.");
         System.out.println("--------------------------------------------");
     }
             
    /* public String getNombreDisco(){
         return nombreDisco;
     }
     
     public String getAutor(){
         return autor;
     }
     
     public String getFormato(){
         return formato;
     }
     */
     public void getPersonas(){
         for (int i = 0, j = 1; i < numeroPersonas; i++, j++){
             System.out.println(j + ". " + nombrePersona[i] + " (Duracion: " + horarioPersona[i] + ").");
         }
         System.out.println("*************************************************************************");
         System.out.println("Duracion total del curso: " + duracion);
         System.out.println("-------------------------------------------------------------------------");
     }

}
