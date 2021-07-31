package aplicacionCerp;

public class Docente extends Personas {

	
	protected float horario;
	
	public Docente(int cedula,String nombre, String apellido,float horario){
		
		super(cedula,nombre,apellido);
		this.horario=horario;
			
	}
	public float getHorario() {
		return horario;
	}
	public void setNota(float horario) {
		this.horario = horario;

	}		
}	
