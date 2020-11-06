package cl.everis.service;

import org.springframework.stereotype.Service;

/**
 * Implementacion de servicios
 * @author Carlos
 *
 */
@Service
public class ImplementService {

OperationService ope = new OperationService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Implementacion de suma.
	 * @param numA
	 * @param numB
	 */
	public void suma(Integer numA, Integer numB) {
		try {
			Integer res = ope.suma(numA, numB);
			System.out.println(+res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Implementacion de resta.
	 * @param numA
	 * @param numB
	 */
	public void resta(Integer numA, Integer numB) {
		try {
			Integer res = ope.resta(numA, numB);
			System.out.println(+res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Implementacion de multiplicacion.
	 * @param numA
	 * @param numB
	 */
	public void Multiplicacion(Integer numA, Integer numB) {
		try {
			Integer res = ope.multiplicacion(numA, numB);
			System.out.println(+res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Implementacion de division.
	 * @param numA
	 * @param numB
	 */
	public void division(Integer numA, Integer numB) {
		try {
			Integer res = ope.division(numA, numB);
			System.out.println(+res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
