package paquete;

import static org.junit.Assert.*;

import org.junit.Test;

public class AulaTest {
	
	
	Aula Aula1 = new Aula (1);
	Materia IntroMate = new Materia ("Intro a la matematica", 10,2);
	Materia Progra1 = new Materia ("Programacion I", 12,2);
	Materia Orga1 = new Materia ("Organizacion del Computador I", 10,3);
	

	@Test
	public void AgregarMateriatest() {
		
		assertEquals(12,IntroMate.getHoraFinal());
		assertEquals(14,Progra1.getHoraFinal());
		assertEquals(13,Orga1.getHoraFinal());
		
		assertTrue(Aula1.estaLibrePara(Progra1));
		assertTrue(Aula1.estaLibrePara(IntroMate));
		assertTrue(Aula1.estaLibrePara(Orga1));
		
	/*Estan todas las combinaciones posibles para probar todas. Solo
		hay que reemplazar el valor del Equals en cantidad de materias*/
		
		
//		Aula1.agregarMateria(IntroMate);
		Aula1.meterMateria(Orga1);
//		Aula1.agregarMateria(Progra1);
		
		assertEquals(1,Aula1.getCantMaterias());
		
//		assertTrue(Aula1.estaLibrePara(IntroMate));
		assertFalse(Aula1.estaLibrePara(IntroMate));
//		assertTrue(Aula1.estaLibrePara(Orga1));
		assertFalse(Aula1.estaLibrePara(Orga1));
//		assertTrue(Aula1.estaLibrePara(Progra1));
		assertFalse(Aula1.estaLibrePara(Progra1));
		
	
		
		}
	
	

	
	
}