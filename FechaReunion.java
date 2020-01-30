public class FechaReunion implements Fecha, Hora{
	private int dia,mes,anio,hora,minuto,segundo;
//Constructor
	FechaReunion (int dia,int mes,int anio,int hora,int minuto,int segundo){
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}

	public void setdia(int dia){
	this.dia=dia;
	}

	public void setmes(int mes){
	this.mes=mes;
	}	
	
	public void setanio(int anio){
	this.anio=anio;
	}

	public void sethora(int hora){
	this.hora=hora;
	}

	public void setminuto(int minuto){
	this.minuto=minuto;
	}
	
	public void setsegundo(int segundo){
	this.segundo=segundo;
	}

	public int getdia(){
	return dia;
	}

	public int getmes(){
	return mes;
	}

	public int getanio(){
	return anio;
	}

	public int gethora(){
	return hora;
	}
	
	public int getminuto(){
	return minuto;
	}

	public int getsegundo(){
	return segundo;
	}
}