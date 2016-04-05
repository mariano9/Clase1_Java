package ar.edu.unlam.tallerweb.clase1;

import org.junit.Assert;
import org.junit.Test;

public class ContandoGanado {

	@Test
	public void pruebaQuePuedaContar() {
		/*Preparacion*/		
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=1;
		/*Ejecucion*/
		miContador.contar();
		Integer cantidadObtenida = miContador.mostrarCantidad();
		/*Validacion*/
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}

	@Test
	public void pruebaQueQueElContadorArranqueEnCero() {
		/*Preparacion*/		
		ContadorDeGanado miContador = new ContadorDeGanado();
		Integer cantidadEsperada=0;
		/*Ejecucion*/
		Integer cantidadObtenida = miContador.mostrarCantidad();
		/*Validacion*/
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}	
}
/*Tarea:

Leer tutoriales
de GIT.
Crear un repo del proyecto
uno subir el codigo y el otro hacer modificaciones y subirlo nuevamente cambiado. El primero lo debe bajar.
 */
