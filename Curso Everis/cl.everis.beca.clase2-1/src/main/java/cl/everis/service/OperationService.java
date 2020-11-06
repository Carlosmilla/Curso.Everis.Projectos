package cl.everis.service;

import org.springframework.stereotype.Service;

import cl.everis.interfaceService.Ioperaciones;
import cl.everis.model.ValidadorAbstract;

/**
 * Service que contiene las operaciones.
 * @author Carlos
 *
 */
@Service
public class OperationService extends ValidadorAbstract implements Ioperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo de suma con validacion correspondiente.
	 */
	@Override
	public Integer suma(Integer numA, Integer numB) {
		validar(numA, numB);
		Integer res = (numA + numB);
		return res;
	}

	/**
	 * Metodo de resta con validacion correspondiente.
	 */
	@Override
	public Integer resta(Integer numA, Integer numB) {
		validar(numA, numB);
		Integer res = (numA - numB);
		return res;
	}

	/**
	 * Metodo de multiplicacion con validacion correspondiente.
	 */
	@Override
	public Integer multiplicacion(Integer numA, Integer numB) {
		validar(numA, numB);
		Integer res = (numA * numB);
		return res;
	}

	/**
	 * Metodo de division con validacion correspondiente.
	 */
	@Override
	public Integer division(Integer numA, Integer numB) {
		validarDiv(numA, numB);
		Integer res = (numA/numB);
		return res;
	}

}
