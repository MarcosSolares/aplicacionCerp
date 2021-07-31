package aplicacionCerp;

import java.util.ArrayList;

public class Estudiante extends Personas {

	protected float nota;
	
	public Estudiante(int cedula,String nombre, String apellido,float nota){
		
		super(cedula,nombre,apellido);
		this.nota=nota;
		
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}		
}	

