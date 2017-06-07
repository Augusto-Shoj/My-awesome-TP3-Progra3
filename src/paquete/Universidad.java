package paquete;

import java.util.ArrayList;

public class Universidad{
	
	private String nombre;
	private ArrayList<Aula> aulas;
	private int cantAulas;
	
	public Universidad (String nom){
		nombre = nom;
		aulas = new ArrayList<Aula>();
		cantAulas = 0;
	}
	
	public String getNombre() {
		return nombre;}

	public int getCantAulas() {
		return cantAulas;}
	
	private void aumentarCantAulas(){
		this.cantAulas++;}
	
	public Aula getAula(int i){
		return aulas.get(i);}
	
	public Aula getUltimaAula(){
		return aulas.get(getCantAulas()-1);}
	
	public void agregarAula(){
		Aula nueva = new Aula((00+getCantAulas()+1));
		aulas.add(nueva);
		aumentarCantAulas();
	}
	
	public void agregarMateria (Materia m)
	{
		for (int i=0; i<aulas.size(); i++)
		{
			if (getAula(i).estaLibrePara(m))
			{
				getAula(i).meterMateria(m);
				return;
			}
		}
		agregarAula();
		getUltimaAula().meterMateria(m);
	}
	
	
	public String verFacultad(){
		String retorno="";
		for (int i=0; i<cantAulas; i++){
			retorno=retorno+this.getAula(i).verAula()+"\n";
		}
		return retorno;
	}
	

	
	

	
	public static void main(String[] args) {
		
		Universidad facu = new Universidad("UNGS");
		
		Materia IntroMate = new Materia ("Introduccion a la matematica",10,2);
		Materia Programacion1 = new Materia ("Programacion 1",12,2);
		Materia Orga1 = new Materia ("Organizacion del Computador 1",11,1);
		Materia TODO = new Materia ("Trollface",8,12);
		
		MateriaJSON ofertaAcademica = new MateriaJSON();
		
		ofertaAcademica.addCoord(IntroMate);
		ofertaAcademica.addCoord(Programacion1);
		ofertaAcademica.addCoord(TODO);
		ofertaAcademica.addCoord(Orga1);
		
		facu.agregarMateria(IntroMate);
		facu.agregarMateria(Programacion1);
		facu.agregarMateria(Orga1);
		facu.agregarMateria(TODO);
		
		for (int x=0; x<ofertaAcademica.tamaño(); x++)
			System.out.println(ofertaAcademica.dame(x).toString());
		
		ofertaAcademica.ordenar();
		
		System.out.println("");
		
		for (int x=0; x<ofertaAcademica.tamaño(); x++)
			System.out.println(ofertaAcademica.dame(x).toString());
		
		System.out.println("");
		
		System.out.println(facu.verFacultad());
		
		
		
	}







}
