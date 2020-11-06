package cl.everis.beca.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.base.Strings;

import cl.everis.beca.abstractCase.AbstractHelper;
import cl.everis.beca.interfaces.IOperacionesInterface;

@Service
public class OperacionesService extends AbstractHelper implements IOperacionesInterface{

	@Override
	public Integer suma(Integer numA, Integer numB) {
		validar(numA, numB);
		Integer res = (numA+numB);
		return res;
	}

	@Override
	public Integer resta(Integer numA, Integer numB) {
		validar(numA, numB);
		Integer res = (numA-numB);
		return res;
	}

	@Override
	public Integer multiplicacion(Integer numA, Integer numB) {
		validar(numA, numB);
		Integer res = (numA*numB);
		return res;
	}

	@Override
	public Integer division(Integer numA, Integer numB) {
		validarDiv(numA, numB);
		Integer res = (numA/numB);
		return res;
	}

	@Override
	public String lista(String args) {
		String[] arreglo = args.split("-");
		ArrayList<Double> arrayList = new ArrayList<>();

		for (int i = 0; i < arreglo.length; i++) {
			arrayList.add(Double.parseDouble(arreglo[i]));
		}
		arrayList.sort(Collections.reverseOrder());
		String res = "";
		for (int i = 0; i < arreglo.length; i++) {
         
			res += "[" + arrayList.get(i).toString() + "]";
		}
		return res;
	}

	

	
	
}
