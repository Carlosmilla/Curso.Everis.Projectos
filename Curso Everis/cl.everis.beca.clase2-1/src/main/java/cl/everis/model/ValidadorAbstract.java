package cl.everis.model;

/**
 * Validador
 * @author Carlos
 *
 */
public abstract class ValidadorAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Validacion de operaciones suma, resta y multiplicacion.
	 * @param numA
	 * @param numB
	 */
	public void validar(Integer numA, Integer numB) {
		if (numA == null || numB == null) {
			throw new RuntimeException("valores nulos");
		}
	}
	
	/**
	 * validacion de division
	 * @param numA
	 * @param numB
	 */
	public void validarDiv(Integer numA, Integer numB) {
		if(numB == 0) {
			System.out.println("el denominador no puede ser 0");
		} else if (numA == null || numB == null) {
			throw new RuntimeException("valores nulos");
		}
	}

}
