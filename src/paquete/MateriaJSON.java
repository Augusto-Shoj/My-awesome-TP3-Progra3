package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MateriaJSON {
	private ArrayList<Materia> oferta;

	public MateriaJSON(){
		oferta= new ArrayList<Materia>();
	}

	public void addCoord(Materia c){
		oferta.add(c);
	}

	public int tamaño(){
		return oferta.size();
	}

	public Materia dame(int indice){
		return oferta.get(indice);
	}

	public String generarJSON(){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(this);
		
		return json;
	}

	public void generarJSON(String tipo, String archivo){
	try{
		FileWriter writer = new FileWriter(archivo);
		writer.write(tipo);
		writer.close();
	} catch(IOException e){
		e.printStackTrace();
	}
	}
	
	public void ordenar(){
		Collections.sort(this.oferta, new Comparator<Materia>() {
	        public int compare(Materia materia, Materia materia2)
	        {
	            return  materia.calificacion() - materia2.calificacion();
	        }
	    });
	}
	

	public static MateriaJSON leerJSON(String archivo){
		Gson gson = new Gson();
		MateriaJSON ret = null;

	try {
		BufferedReader br = new BufferedReader (new FileReader(archivo));
		ret = gson.fromJson(br, MateriaJSON.class);
	} catch(IOException e){
	e.printStackTrace();
	}

	return ret;
	}

}
	

