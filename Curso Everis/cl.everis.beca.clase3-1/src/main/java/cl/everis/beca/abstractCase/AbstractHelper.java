package cl.everis.beca.abstractCase;

import java.util.ArrayList;

public abstract class AbstractHelper {

	public void validarDiv(Integer numA, Integer numB) {
		if(numB == 0) {
			System.out.println("el denominador no puede ser 0");
		} else if (numA == null || numB == null) {
			throw new RuntimeException("valores nulos");
		}
	}
	
	public void validar(Integer numA, Integer numB) {
		if (numA == null || numB == null) {
			throw new RuntimeException("valores nulos");
		}
	}
	
	public void validarLista(String args) {
		ArrayList<String> arrayList = new ArrayList<>();
		if(arrayList.isEmpty()) {
			throw new RuntimeException("array Vacio");
		}
	}
}
