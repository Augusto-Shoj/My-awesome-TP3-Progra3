package paquete;

public class Materia {

	private String nombreMateria;
	private int horaInicio;
	private int duracion;
	
	public Materia (String name, int inicio, int duracion)
	{
		this.nombreMateria = name;
		this.horaInicio = inicio;
		this.duracion = duracion;
	}
	
	public String getNombreMateria(){
		return nombreMateria;}
	
	public int getHoraInicio(){
		return horaInicio;}
	
	public int getDuracion(){
		return duracion;}
	
	 public int getHoraFinal(){
		 return (horaInicio + duracion);}
	 
	 public int calificacion(){
		 return this.duracion;}
	 
	 @Override
	 public String toString(){
		return "Materia: " + this.getNombreMateria() + " - Arranca: " + this.getHoraInicio() 
		+ ":00 hs, Termina : " + this.getHoraFinal() + ":00 hs.";
	}
	 



}
