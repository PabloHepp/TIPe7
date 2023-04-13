package TpiE7;

public class Partido {
	
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(int golesEquipo1, int golesEquipo2, Equipo eq1, Equipo eq2) {
		
		this.golesEquipo1=golesEquipo1;
		this.golesEquipo2=golesEquipo2;
		this.equipo1=eq1;
		this.equipo2=eq2;
				
	}

	public Equipo getEquipo1 () {
		return this.equipo1;
		}
	
	public Equipo getEquipo2 () {
		return this.equipo2;
		} 
	
	public void setEquipo1(Equipo equipo1) {
		this.equipo1=equipo1;
	}
	
	public void setEquipo2(Equipo equipo2) {
		this.equipo2=equipo2;
	}
	
	public int getGolesequipo1() {
		return this.golesEquipo1;
	}
	
	public int getGolesequipo2() {
		return this.golesEquipo2;
	}
	
	public void setGolesequipo1(int golesEquipo1) {
		this.golesEquipo1=golesEquipo1;
	}
	
	public void setGolesequipo2(int golesEquipo2) {
		this.golesEquipo2=golesEquipo2;
	}
	
	public ResultadoEnum resultado() {
		ResultadoEnum resultado = null;
		
		if(golesEquipo1==golesEquipo2) {
			resultado=ResultadoEnum.EMPATE;
		}
		
		if(golesEquipo1>golesEquipo2) {
			resultado=ResultadoEnum.GANADOR;
		}
		
		if(golesEquipo1<golesEquipo2) {
			resultado=ResultadoEnum.PERDEDOR;
		}
				
		return resultado;
		}
	
	
	public String toString() {
		return "Partido Equipo:"+ equipo1 "GolesEquipo1:" + golesEquipo1+ "Equipo2:"+ equipo2 + "GolesEquipo2:"+ golesEquipo2;
		
	}
	
}
