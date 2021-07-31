package aplicacionCerp;

public class Cursos {
	
	
		protected String dia;
		protected float hora;
		protected String materia;
		
		public Cursos(String materia,String dia,float hora){
			
			this.materia=materia;
			this.dia=dia;
			this.hora=hora;
}

		public String getMateria() {
			return materia;
		}

		public void setMateria(String materia) {
			this.materia = materia;
		}
		
		public String getDia() {
			return dia;
		}

		public void setDia(String dia) {
			this.dia = dia;
		}

		public float getHora() {
			return hora;
		}

		public void setHora(float hora) {
			this.hora = hora;
		}
}
