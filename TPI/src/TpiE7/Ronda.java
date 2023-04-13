package TpiE7;

public class Ronda {

	private Partido partidos;
	private int numRonda;
	
	public Ronda(int numRonda, Partido partidos) {
		this.numRonda=numRonda;
		this.partidos=partidos;
	}
	
	public int getNumRonda() {
		return this.numRonda;
		
	}
	
	public Partido getPartido() {
		return this.partidos;
	}
	
	public void setNumRonda(int numRonda) {
		this.numRonda=numRonda;
	}
	
	public void setPartido(Partido partidos) {
		this.partidos=partidos;
		
	}
	
	public void puntos(Partido partidos) {
		int puntos=0;
		if(partidos.getGolesequipo1()>partidos.getGolesequipo2()) {
			puntos= puntos+3;
		}
		if(partidos.getEquipo1()<partidos.getGolesequipo2()) {
			puntos=puntos;
			}
		if(partidos.getEquipo1()==partidos.getEquipo2()) {
			puntos=puntos+1;
		}
		System.out.print((partido.getEquipo1).getoNombre()+"tiene"+puntos+ "puntos");
		
	}
}
